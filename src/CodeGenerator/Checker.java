package CodeGenerator;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import ANTLR.*;

public class Checker extends DaemonScriptBaseVisitor<DataType>{
    private ParseTreeProperty<DataType> types;
    private ParseTreeProperty<Symbol> symbols;
    private Scope currentScope = new Scope();
    private int numLocals = 0;

    public Checker( ParseTreeProperty<DataType> types,
                    ParseTreeProperty<Symbol> symbols ) {
        this.types = types;
        this.symbols = symbols;
    }

    @Override
    public DataType visitAtomString(DaemonScriptParser.AtomStringContext ctx) {
        return addType( ctx, DataType.STRING );
    }

    @Override
    public DataType visitAtomNumber(DaemonScriptParser.AtomNumberContext ctx) {
        return addType( ctx, DataType.INT );
    }

    @Override
    public DataType visitExMinus(DaemonScriptParser.ExMinusContext ctx) {
        DataType subtype = visit(ctx.expression());
        return addType( ctx, subtype );
    }

    @Override
    public DataType visitExPar(DaemonScriptParser.ExParContext ctx) {
        DataType subtype = visit(ctx.expression());
        return addType( ctx, subtype );
    }

    @Override
    public DataType visitExMultiply(DaemonScriptParser.ExMultiplyContext ctx) {
        DataType leftType = visit(ctx.expression(0));
        DataType rightType = visit(ctx.expression(1));
        if( leftType != rightType )
            throw new CompilerException("Left and right type are not the same!");
        return addType(ctx, leftType);
    }

    @Override
    public DataType visitExAdditive(DaemonScriptParser.ExAdditiveContext ctx) {
        DataType leftType = visit(ctx.expression(0));
        DataType rightType = visit(ctx.expression(1));
        if( leftType != rightType )
            throw new CompilerException("Left and right type are not the same!");
        return addType(ctx, leftType);
    }

    @Override
    public DataType visitDeclaration(DaemonScriptParser.DeclarationContext ctx) {
        String varName = ctx.ID().getText();
        DataType varType;
        if (ctx.NUMBER() != null) {
            varType = DataType.INT;
        } else if ( ctx.BOOLEAN() != null ) {
            varType = DataType.BOOLEAN;
        } else if ( ctx.LIST() != null ) {
            varType = DataType.LIST;
        } else {
            varType = DataType.STRING;
        }
        numLocals++;

        Symbol s = currentScope.lookupVariable(varName);
        if( s != null )
            throw new CompilerException("Already declared variable called " + varName);

        currentScope.declareVariable(new Symbol(varName, varType, numLocals));
        return null;
    }

    @Override
    public DataType visitAssignment(DaemonScriptParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();
        Symbol s = currentScope.lookupVariable(varName);
        if( s == null )
            throw new CompilerException("Undefined variable in assignment: " + varName);

        DataType expressionType = visit(ctx.expression());
        if( s.getType() != expressionType )
            throw new CompilerException("Assignment type is not correct");

        symbols.put(ctx, s);
        return null;
    }

    @Override
    public DataType visitAtomId(DaemonScriptParser.AtomIdContext ctx) {
        Symbol s = currentScope.lookupVariable(ctx.getText());
        if( s == null )
            throw new CompilerException("Undefined variable: " + ctx.getText());

        symbols.put(ctx, s);
        types.put(ctx, s.getType());
        return s.getType();
    }

    @Override
    public DataType visitBlock(DaemonScriptParser.BlockContext ctx) {
        currentScope = currentScope.openScope();
        visitChildren(ctx);
        currentScope = currentScope.closeScope();
        return null;
    }

    private DataType addType(ParseTree node, DataType type) {
        types.put(node, type);
        return type;
    }
}