// Generated from C:/Users/zikri/Desktop/School Saxion/compilers and operatingsystems/final/antlr4_jasmin_lang/src/ANTLR\DaemonScript.g4 by ANTLR 4.9.2
package ANTLR;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DaemonScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LIST=3, BOOLEAN=4, TEXT=5, NUMBER=6, OBJ_TYPE=7, ARGS=8, 
		THEN=9, IF=10, ELSE=11, WHILE=12, TRUE=13, FALSE=14, OR=15, AND=16, EQ=17, 
		NEQ=18, GT=19, LT=20, GTEQ=21, LTEQ=22, PLUS=23, MINUS=24, MULT=25, DIV=26, 
		MOD=27, NOT=28, NULL=29, CONSOLE=30, PRINT=31, SCANINT=32, SCANSTRING=33, 
		POINT=34, ID=35, SPECIAL_CHAR=36, INT=37, FLOAT=38, DIGITS=39, STRING=40, 
		SEMICOLON=41, COLON=42, PARANTHESE_START=43, PARANTHESE_END=44, BRACKET_START=45, 
		BRACKET_END=46, EQUALS=47, BRACE_START=48, BRACE_END=49, COMMA=50, WS=51, 
		COMMENT=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "LIST", "BOOLEAN", "TEXT", "NUMBER", "OBJ_TYPE", "ARGS", 
			"THEN", "IF", "ELSE", "WHILE", "TRUE", "FALSE", "OR", "AND", "EQ", "NEQ", 
			"GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", "NOT", 
			"NULL", "CONSOLE", "PRINT", "SCANINT", "SCANSTRING", "POINT", "ID", "SPECIAL_CHAR", 
			"INT", "FLOAT", "DIGITS", "STRING", "SEMICOLON", "COLON", "PARANTHESE_START", 
			"PARANTHESE_END", "BRACKET_START", "BRACKET_END", "EQUALS", "BRACE_START", 
			"BRACE_END", "COMMA", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Main'", "'return'", "'List'", "'Boolean'", "'Text'", "'Number'", 
			null, "'args'", "'then'", "'if'", "'else'", "'while'", "'true'", "'false'", 
			"'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'!'", "'null'", "'console'", "'print'", 
			"'scanInt'", "'scanString'", "'.'", null, null, null, null, null, null, 
			"';'", "':'", "'('", "')'", "'['", "']'", "'='", "'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "LIST", "BOOLEAN", "TEXT", "NUMBER", "OBJ_TYPE", "ARGS", 
			"THEN", "IF", "ELSE", "WHILE", "TRUE", "FALSE", "OR", "AND", "EQ", "NEQ", 
			"GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", "NOT", 
			"NULL", "CONSOLE", "PRINT", "SCANINT", "SCANSTRING", "POINT", "ID", "SPECIAL_CHAR", 
			"INT", "FLOAT", "DIGITS", "STRING", "SEMICOLON", "COLON", "PARANTHESE_START", 
			"PARANTHESE_END", "BRACKET_START", "BRACKET_END", "EQUALS", "BRACE_START", 
			"BRACE_END", "COMMA", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DaemonScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DaemonScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u015d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0095\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\7$\u0106\n$\f$"+
		"\16$\u0109\13$\3%\3%\3&\3&\3&\7&\u0110\n&\f&\16&\u0113\13&\5&\u0115\n"+
		"&\3\'\6\'\u0118\n\'\r\'\16\'\u0119\3\'\3\'\7\'\u011e\n\'\f\'\16\'\u0121"+
		"\13\'\3\'\3\'\6\'\u0125\n\'\r\'\16\'\u0126\5\'\u0129\n\'\3(\6(\u012c\n"+
		"(\r(\16(\u012d\3)\3)\7)\u0132\n)\f)\16)\u0135\13)\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\6"+
		"\64\u014e\n\64\r\64\16\64\u014f\3\64\3\64\3\65\3\65\3\65\7\65\u0157\n"+
		"\65\f\65\16\65\u015a\13\65\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66\3\2\n\5\2C\\aac|\6\2\62;C\\aac|\4"+
		"\2--/\60\3\2\63;\3\2\62;\4\2\f\f\177\177\5\2\13\f\17\17\"\"\3\2\f\f\2"+
		"\u016a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5"+
		"p\3\2\2\2\7w\3\2\2\2\t|\3\2\2\2\13\u0084\3\2\2\2\r\u0089\3\2\2\2\17\u0094"+
		"\3\2\2\2\21\u0096\3\2\2\2\23\u009b\3\2\2\2\25\u00a0\3\2\2\2\27\u00a3\3"+
		"\2\2\2\31\u00a8\3\2\2\2\33\u00ae\3\2\2\2\35\u00b3\3\2\2\2\37\u00b9\3\2"+
		"\2\2!\u00bc\3\2\2\2#\u00bf\3\2\2\2%\u00c2\3\2\2\2\'\u00c5\3\2\2\2)\u00c7"+
		"\3\2\2\2+\u00c9\3\2\2\2-\u00cc\3\2\2\2/\u00cf\3\2\2\2\61\u00d1\3\2\2\2"+
		"\63\u00d3\3\2\2\2\65\u00d5\3\2\2\2\67\u00d7\3\2\2\29\u00d9\3\2\2\2;\u00db"+
		"\3\2\2\2=\u00e0\3\2\2\2?\u00e8\3\2\2\2A\u00ee\3\2\2\2C\u00f6\3\2\2\2E"+
		"\u0101\3\2\2\2G\u0103\3\2\2\2I\u010a\3\2\2\2K\u0114\3\2\2\2M\u0128\3\2"+
		"\2\2O\u012b\3\2\2\2Q\u012f\3\2\2\2S\u0138\3\2\2\2U\u013a\3\2\2\2W\u013c"+
		"\3\2\2\2Y\u013e\3\2\2\2[\u0140\3\2\2\2]\u0142\3\2\2\2_\u0144\3\2\2\2a"+
		"\u0146\3\2\2\2c\u0148\3\2\2\2e\u014a\3\2\2\2g\u014d\3\2\2\2i\u0153\3\2"+
		"\2\2kl\7O\2\2lm\7c\2\2mn\7k\2\2no\7p\2\2o\4\3\2\2\2pq\7t\2\2qr\7g\2\2"+
		"rs\7v\2\2st\7w\2\2tu\7t\2\2uv\7p\2\2v\6\3\2\2\2wx\7N\2\2xy\7k\2\2yz\7"+
		"u\2\2z{\7v\2\2{\b\3\2\2\2|}\7D\2\2}~\7q\2\2~\177\7q\2\2\177\u0080\7n\2"+
		"\2\u0080\u0081\7g\2\2\u0081\u0082\7c\2\2\u0082\u0083\7p\2\2\u0083\n\3"+
		"\2\2\2\u0084\u0085\7V\2\2\u0085\u0086\7g\2\2\u0086\u0087\7z\2\2\u0087"+
		"\u0088\7v\2\2\u0088\f\3\2\2\2\u0089\u008a\7P\2\2\u008a\u008b\7w\2\2\u008b"+
		"\u008c\7o\2\2\u008c\u008d\7d\2\2\u008d\u008e\7g\2\2\u008e\u008f\7t\2\2"+
		"\u008f\16\3\2\2\2\u0090\u0095\5\r\7\2\u0091\u0095\5\13\6\2\u0092\u0095"+
		"\5\t\5\2\u0093\u0095\5\7\4\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\20\3\2\2\2\u0096\u0097\7c\2\2"+
		"\u0097\u0098\7t\2\2\u0098\u0099\7i\2\2\u0099\u009a\7u\2\2\u009a\22\3\2"+
		"\2\2\u009b\u009c\7v\2\2\u009c\u009d\7j\2\2\u009d\u009e\7g\2\2\u009e\u009f"+
		"\7p\2\2\u009f\24\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7h\2\2\u00a2\26"+
		"\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6"+
		"\u00a7\7g\2\2\u00a7\30\3\2\2\2\u00a8\u00a9\7y\2\2\u00a9\u00aa\7j\2\2\u00aa"+
		"\u00ab\7k\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7g\2\2\u00ad\32\3\2\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7g\2\2"+
		"\u00b2\34\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7"+
		"n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8\36\3\2\2\2\u00b9\u00ba"+
		"\7~\2\2\u00ba\u00bb\7~\2\2\u00bb \3\2\2\2\u00bc\u00bd\7(\2\2\u00bd\u00be"+
		"\7(\2\2\u00be\"\3\2\2\2\u00bf\u00c0\7?\2\2\u00c0\u00c1\7?\2\2\u00c1$\3"+
		"\2\2\2\u00c2\u00c3\7#\2\2\u00c3\u00c4\7?\2\2\u00c4&\3\2\2\2\u00c5\u00c6"+
		"\7@\2\2\u00c6(\3\2\2\2\u00c7\u00c8\7>\2\2\u00c8*\3\2\2\2\u00c9\u00ca\7"+
		"@\2\2\u00ca\u00cb\7?\2\2\u00cb,\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd\u00ce"+
		"\7?\2\2\u00ce.\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0\60\3\2\2\2\u00d1\u00d2"+
		"\7/\2\2\u00d2\62\3\2\2\2\u00d3\u00d4\7,\2\2\u00d4\64\3\2\2\2\u00d5\u00d6"+
		"\7\61\2\2\u00d6\66\3\2\2\2\u00d7\u00d8\7\'\2\2\u00d88\3\2\2\2\u00d9\u00da"+
		"\7#\2\2\u00da:\3\2\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de"+
		"\7n\2\2\u00de\u00df\7n\2\2\u00df<\3\2\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2"+
		"\7q\2\2\u00e2\u00e3\7p\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7q\2\2\u00e5"+
		"\u00e6\7n\2\2\u00e6\u00e7\7g\2\2\u00e7>\3\2\2\2\u00e8\u00e9\7r\2\2\u00e9"+
		"\u00ea\7t\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7v\2\2"+
		"\u00ed@\3\2\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7c\2"+
		"\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7K\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5"+
		"\7v\2\2\u00f5B\3\2\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9"+
		"\7c\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7U\2\2\u00fb\u00fc\7v\2\2\u00fc"+
		"\u00fd\7t\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7i\2\2"+
		"\u0100D\3\2\2\2\u0101\u0102\7\60\2\2\u0102F\3\2\2\2\u0103\u0107\t\2\2"+
		"\2\u0104\u0106\t\3\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108H\3\2\2\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010b\t\4\2\2\u010bJ\3\2\2\2\u010c\u0115\7\62\2\2\u010d\u0111\t\5\2\2"+
		"\u010e\u0110\t\6\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u010c\3\2\2\2\u0114\u010d\3\2\2\2\u0115L\3\2\2\2\u0116\u0118\t\6\2\2"+
		"\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011f\7\60\2\2\u011c\u011e\t\6\2\2"+
		"\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0129\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\7\60\2\2"+
		"\u0123\u0125\t\6\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0117\3\2\2\2\u0128"+
		"\u0122\3\2\2\2\u0129N\3\2\2\2\u012a\u012c\t\6\2\2\u012b\u012a\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012eP\3"+
		"\2\2\2\u012f\u0133\5a\61\2\u0130\u0132\n\7\2\2\u0131\u0130\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0136\u0137\5c\62\2\u0137R\3\2\2\2\u0138\u0139"+
		"\7=\2\2\u0139T\3\2\2\2\u013a\u013b\7<\2\2\u013bV\3\2\2\2\u013c\u013d\7"+
		"*\2\2\u013dX\3\2\2\2\u013e\u013f\7+\2\2\u013fZ\3\2\2\2\u0140\u0141\7]"+
		"\2\2\u0141\\\3\2\2\2\u0142\u0143\7_\2\2\u0143^\3\2\2\2\u0144\u0145\7?"+
		"\2\2\u0145`\3\2\2\2\u0146\u0147\7}\2\2\u0147b\3\2\2\2\u0148\u0149\7\177"+
		"\2\2\u0149d\3\2\2\2\u014a\u014b\7.\2\2\u014bf\3\2\2\2\u014c\u014e\t\b"+
		"\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\b\64\2\2\u0152h\3\2\2\2"+
		"\u0153\u0154\5\65\33\2\u0154\u0158\5\65\33\2\u0155\u0157\n\t\2\2\u0156"+
		"\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\b\65\2\2\u015c"+
		"j\3\2\2\2\17\2\u0094\u0107\u0111\u0114\u0119\u011f\u0126\u0128\u012d\u0133"+
		"\u014f\u0158\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}