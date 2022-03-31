grammar DaemonScript;

app: program;

program:
        main EOF
    ;

main:
        'Main'
        '[' statement* ']'
        statement*
    ;


//statements
statement:
        expression
    |   declaration
    |   assignment
    |   console_print
    |   if_statement
    |   while_statement
    ;

function_call:
        (ID POINT)? ID PARANTHESE_START arguments? PARANTHESE_END (SEMICOLON)?
    ;

function_declaration:
        ID PARANTHESE_START (OBJ_TYPE ID (COMMA OBJ_TYPE ID)*)? PARANTHESE_END statement_block
    ;

arguments:
        expression ( COMMA expression )*
    ;

array:
        BRACKET_START (expression (COMMA expression)*)? BRACKET_END
    ;

console_print:
        CONSOLE POINT PRINT PARANTHESE_START expression? PARANTHESE_END SEMICOLON
    ;

console_scan_string:
        CONSOLE POINT SCANSTRING PARANTHESE_START PARANTHESE_END SEMICOLON?
    ;

console_scan_int:
        CONSOLE POINT SCANINT PARANTHESE_START PARANTHESE_END SEMICOLON
    ;

declaration:
        OBJ_TYPE (LT OBJ_TYPE GT)? ID (EQUALS expression)? (POINT function_call)? SEMICOLON
    ;

assignment:
        ID EQUALS expression SEMICOLON
    ;

if_statement:
        IF condition_block (ELSE IF condition_block)* (ELSE statement_block)?
    ;

while_statement:
        WHILE expression statement_block
    ;

condition_block:
        expression THEN statement_block
    ;

statement_block:
        BRACKET_START block BRACKET_END
    ;

block:
        statement*
    ;

//expressions
expression:
        MINUS expression                                    #ExMinus
    |   NOT expression                                      #ExNot
    |   expression op=(MULT | DIV | MOD) expression         #ExMultiply
    |   expression op=(PLUS | MINUS) expression             #ExAdditive
    |   expression op=(LTEQ | GTEQ | LT | GT) expression    #ExRelational
    |   expression op=(EQ | NEQ) expression                 #ExEqual
    |   expression AND expression                           #ExAnd
    |   expression OR expression                            #ExOr
    |   array                                               #ExArray
    |   function_declaration                                #ExFunctionDeclaration
    |   function_call                                       #ExFunctionCall
    |   console_scan_string                                 #ExConsoleScanString
    |   console_scan_int                                    #ExConsoleScanInt
    |   atom                                                #ExAtom
 ;

atom:
        '(' expression ')'          #ExPar
    |   (INT | FLOAT)               #AtomNumber
    |   (TRUE | FALSE)              #AtomBoolean
    |   ID                          #AtomId
    |   STRING                      #AtomString
    ;


OBJ_TYPE:(
        'Number'
    |   'Text'
    |   'Boolean'
    |   'List'
    )
    ;
ARGS: 'args';
THEN: 'then';


//Class name start with Capital letter
//Variable name start with Lowercase letter
IF: 'if';
ELSE: 'else';
WHILE: 'while';
TRUE: 'true';
FALSE: 'false';

OR: '||';
AND: '&&';
EQ: '==';
NEQ: '!=';
GT: '>';
LT: '<';
GTEQ: '>=';
LTEQ: '<=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
NOT: '!';

NULL: 'null';

CONSOLE: 'console';
PRINT: 'print';
SCANINT: 'scanInt';
SCANSTRING: 'scanString';

POINT: '.';
ID: [a-zA-Z_] [a-zA-Z_0-9]*;
SPECIAL_CHAR: [.+-];
INT: '0' | [1-9][0-9]*;
FLOAT: [0-9]+ '.' [0-9]*  |   '.' [0-9]+;
DIGITS: [0-9]+;
STRING:  BRACE_START ~[}\n]* BRACE_END;
SEMICOLON: ';';
COLON: ':';
PARANTHESE_START: '(';
PARANTHESE_END: ')';
BRACKET_START: '[';
BRACKET_END: ']';
EQUALS: '=';
BRACE_START: '{';
BRACE_END: '}';
COMMA: ',';



WS: [ \r\n\t]+ -> skip;
COMMENT: DIV DIV ~[\n]* -> skip;