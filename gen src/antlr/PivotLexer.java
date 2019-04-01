// Generated from /Users/philip/Library/Mobile Documents/com~apple~CloudDocs/Cloud dokumenter/Java projects/P4Grammar/Pivot.g4 by ANTLR 4.7.2
package	antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PivotLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WhiteSpace=1, NewLine=2, LINE_COMMENT=3, AND=4, OR=5, GT=6, GE=7, ST=8, 
		SE=9, EQ=10, NE=11, TRUE=12, FALSE=13, SIGNAL=14, INPUT=15, OUTPUT=16, 
		DEVICE=17, DEFINEKW=18, IF=19, WHILE=20, INITFUNCKW=21, VOID=22, WHEN=23, 
		EVERY=24, MS=25, SECONDS=26, MINUTES=27, HOURS=28, DAYS=29, WEEKS=30, 
		MONTHS=31, WAIT=32, STRINGKW=33, INTEGERKW=34, FLOATKW=35, SET=36, GET=37, 
		EXCEEDS=38, DECEEDS=39, NOW=40, ELSE=41, RETURN=42, BREAK=43, AT=44, STARTING=45, 
		PARANBEG=46, PARANEND=47, BLCKBEG=48, BLCKEND=49, EQUALS=50, PLUS=51, 
		MINUS=52, DIV=53, MULT=54, RANGESEP=55, SEMCOL=56, LISTSEP=57, QUOT=58, 
		COL=59, AMP=60, DATE=61, DATEnoYEAR=62, FLOAT=63, TIME=64, INTEGER=65, 
		STRING=66, ID=67, SIGN=68;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WhiteSpace", "NewLine", "LINE_COMMENT", "NEWLINE", "LOWERCASE", "UPPERCASE", 
			"DIGIT", "AND", "OR", "GT", "GE", "ST", "SE", "EQ", "NE", "TRUE", "FALSE", 
			"SIGNAL", "INPUT", "OUTPUT", "DEVICE", "DEFINEKW", "IF", "WHILE", "INITFUNCKW", 
			"VOID", "WHEN", "EVERY", "MS", "SECONDS", "MINUTES", "HOURS", "DAYS", 
			"WEEKS", "MONTHS", "WAIT", "STRINGKW", "INTEGERKW", "FLOATKW", "SET", 
			"GET", "EXCEEDS", "DECEEDS", "NOW", "ELSE", "RETURN", "BREAK", "AT", 
			"STARTING", "PARANBEG", "PARANEND", "BLCKBEG", "BLCKEND", "EQUALS", "PLUS", 
			"MINUS", "DIV", "MULT", "RANGESEP", "SEMCOL", "LISTSEP", "QUOT", "COL", 
			"AMP", "DATE", "DATEnoYEAR", "FLOAT", "TIME", "INTEGER", "STRING", "ID", 
			"SIGN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'&&'", "'||'", "'>'", "'>='", "'<'", "'<='", 
			"'=='", "'!='", "'true'", "'false'", "'Signal'", "'input'", "'output'", 
			"'Device'", "'define'", "'if'", "'while'", "'init'", "'void'", "'when'", 
			"'every'", "'ms'", "'seconds'", "'minutes'", "'hours'", "'days'", "'weeks'", 
			"'months'", "'wait'", "'string'", "'int'", "'float'", "'set'", "'get'", 
			"'exceeds'", "'deceeds'", "'now'", "'else'", "'return'", "'break'", "'at'", 
			"'starting'", "'('", "')'", "'{'", "'}'", "'='", "'+'", "'-'", "'/'", 
			"'*'", "'..'", "';'", "','", "'\"'", "':'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WhiteSpace", "NewLine", "LINE_COMMENT", "AND", "OR", "GT", "GE", 
			"ST", "SE", "EQ", "NE", "TRUE", "FALSE", "SIGNAL", "INPUT", "OUTPUT", 
			"DEVICE", "DEFINEKW", "IF", "WHILE", "INITFUNCKW", "VOID", "WHEN", "EVERY", 
			"MS", "SECONDS", "MINUTES", "HOURS", "DAYS", "WEEKS", "MONTHS", "WAIT", 
			"STRINGKW", "INTEGERKW", "FLOATKW", "SET", "GET", "EXCEEDS", "DECEEDS", 
			"NOW", "ELSE", "RETURN", "BREAK", "AT", "STARTING", "PARANBEG", "PARANEND", 
			"BLCKBEG", "BLCKEND", "EQUALS", "PLUS", "MINUS", "DIV", "MULT", "RANGESEP", 
			"SEMCOL", "LISTSEP", "QUOT", "COL", "AMP", "DATE", "DATEnoYEAR", "FLOAT", 
			"TIME", "INTEGER", "STRING", "ID", "SIGN"
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


	public PivotLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pivot.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u01f6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u00a0\n\4\f\4"+
		"\16\4\u00a3\13\4\3\4\3\4\3\5\5\5\u00a8\n\5\3\5\3\5\5\5\u00ac\n\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#"+
		"\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\5D\u01c3\n"+
		"D\3D\6D\u01c6\nD\rD\16D\u01c7\3D\3D\6D\u01cc\nD\rD\16D\u01cd\3E\3E\3E"+
		"\3E\3E\3E\3F\5F\u01d7\nF\3F\6F\u01da\nF\rF\16F\u01db\3G\3G\3G\3G\3G\6"+
		"G\u01e3\nG\rG\16G\u01e4\3G\3G\3H\3H\5H\u01eb\nH\3H\3H\3H\7H\u01f0\nH\f"+
		"H\16H\u01f3\13H\3I\3I\2\2J\3\3\5\4\7\5\t\2\13\2\r\2\17\2\21\6\23\7\25"+
		"\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63"+
		"\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(W)Y*[+],_-"+
		"a.c/e\60g\61i\62k\63m\64o\65q\66s\67u8w9y:{;}<\177=\u0081>\u0083?\u0085"+
		"@\u0087A\u0089B\u008bC\u008dD\u008fE\u0091F\3\2\b\4\2\13\13\"\"\4\2\f"+
		"\f\17\17\3\2c|\3\2C\\\3\2\62;\6\2\"#/\60<<aa\2\u0201\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5\u0097\3\2\2\2\7\u009b"+
		"\3\2\2\2\t\u00ab\3\2\2\2\13\u00ad\3\2\2\2\r\u00af\3\2\2\2\17\u00b1\3\2"+
		"\2\2\21\u00b3\3\2\2\2\23\u00b6\3\2\2\2\25\u00b9\3\2\2\2\27\u00bb\3\2\2"+
		"\2\31\u00be\3\2\2\2\33\u00c0\3\2\2\2\35\u00c3\3\2\2\2\37\u00c6\3\2\2\2"+
		"!\u00c9\3\2\2\2#\u00ce\3\2\2\2%\u00d4\3\2\2\2\'\u00db\3\2\2\2)\u00e1\3"+
		"\2\2\2+\u00e8\3\2\2\2-\u00ef\3\2\2\2/\u00f6\3\2\2\2\61\u00f9\3\2\2\2\63"+
		"\u00ff\3\2\2\2\65\u0104\3\2\2\2\67\u0109\3\2\2\29\u010e\3\2\2\2;\u0114"+
		"\3\2\2\2=\u0117\3\2\2\2?\u011f\3\2\2\2A\u0127\3\2\2\2C\u012d\3\2\2\2E"+
		"\u0132\3\2\2\2G\u0138\3\2\2\2I\u013f\3\2\2\2K\u0144\3\2\2\2M\u014b\3\2"+
		"\2\2O\u014f\3\2\2\2Q\u0155\3\2\2\2S\u0159\3\2\2\2U\u015d\3\2\2\2W\u0165"+
		"\3\2\2\2Y\u016d\3\2\2\2[\u0171\3\2\2\2]\u0176\3\2\2\2_\u017d\3\2\2\2a"+
		"\u0183\3\2\2\2c\u0186\3\2\2\2e\u018f\3\2\2\2g\u0191\3\2\2\2i\u0193\3\2"+
		"\2\2k\u0195\3\2\2\2m\u0197\3\2\2\2o\u0199\3\2\2\2q\u019b\3\2\2\2s\u019d"+
		"\3\2\2\2u\u019f\3\2\2\2w\u01a1\3\2\2\2y\u01a4\3\2\2\2{\u01a6\3\2\2\2}"+
		"\u01a8\3\2\2\2\177\u01aa\3\2\2\2\u0081\u01ac\3\2\2\2\u0083\u01ae\3\2\2"+
		"\2\u0085\u01ba\3\2\2\2\u0087\u01c2\3\2\2\2\u0089\u01cf\3\2\2\2\u008b\u01d6"+
		"\3\2\2\2\u008d\u01dd\3\2\2\2\u008f\u01ea\3\2\2\2\u0091\u01f4\3\2\2\2\u0093"+
		"\u0094\t\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\2\2\2\u0096\4\3\2\2\2"+
		"\u0097\u0098\5\t\5\2\u0098\u0099\3\2\2\2\u0099\u009a\b\3\2\2\u009a\6\3"+
		"\2\2\2\u009b\u009c\7\61\2\2\u009c\u009d\7\61\2\2\u009d\u00a1\3\2\2\2\u009e"+
		"\u00a0\n\3\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a5\b\4\2\2\u00a5\b\3\2\2\2\u00a6\u00a8\7\17\2\2\u00a7\u00a6\3\2\2"+
		"\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\7\f\2\2\u00aa\u00ac"+
		"\7\17\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\n\3\2\2\2\u00ad"+
		"\u00ae\t\4\2\2\u00ae\f\3\2\2\2\u00af\u00b0\t\5\2\2\u00b0\16\3\2\2\2\u00b1"+
		"\u00b2\t\6\2\2\u00b2\20\3\2\2\2\u00b3\u00b4\7(\2\2\u00b4\u00b5\7(\2\2"+
		"\u00b5\22\3\2\2\2\u00b6\u00b7\7~\2\2\u00b7\u00b8\7~\2\2\u00b8\24\3\2\2"+
		"\2\u00b9\u00ba\7@\2\2\u00ba\26\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc\u00bd"+
		"\7?\2\2\u00bd\30\3\2\2\2\u00be\u00bf\7>\2\2\u00bf\32\3\2\2\2\u00c0\u00c1"+
		"\7>\2\2\u00c1\u00c2\7?\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7?\2\2\u00c4\u00c5"+
		"\7?\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7#\2\2\u00c7\u00c8\7?\2\2\u00c8 "+
		"\3\2\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7w\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\"\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7c\2\2\u00d0"+
		"\u00d1\7n\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7g\2\2\u00d3$\3\2\2\2\u00d4"+
		"\u00d5\7U\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7i\2\2\u00d7\u00d8\7p\2\2"+
		"\u00d8\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da&\3\2\2\2\u00db\u00dc\7k\2"+
		"\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7w\2\2\u00df\u00e0"+
		"\7v\2\2\u00e0(\3\2\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7w\2\2\u00e3\u00e4"+
		"\7v\2\2\u00e4\u00e5\7r\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7v\2\2\u00e7"+
		"*\3\2\2\2\u00e8\u00e9\7F\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7x\2\2\u00eb"+
		"\u00ec\7k\2\2\u00ec\u00ed\7e\2\2\u00ed\u00ee\7g\2\2\u00ee,\3\2\2\2\u00ef"+
		"\u00f0\7f\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7k\2\2"+
		"\u00f3\u00f4\7p\2\2\u00f4\u00f5\7g\2\2\u00f5.\3\2\2\2\u00f6\u00f7\7k\2"+
		"\2\u00f7\u00f8\7h\2\2\u00f8\60\3\2\2\2\u00f9\u00fa\7y\2\2\u00fa\u00fb"+
		"\7j\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7g\2\2\u00fe"+
		"\62\3\2\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7p\2\2\u0101\u0102\7k\2\2\u0102"+
		"\u0103\7v\2\2\u0103\64\3\2\2\2\u0104\u0105\7x\2\2\u0105\u0106\7q\2\2\u0106"+
		"\u0107\7k\2\2\u0107\u0108\7f\2\2\u0108\66\3\2\2\2\u0109\u010a\7y\2\2\u010a"+
		"\u010b\7j\2\2\u010b\u010c\7g\2\2\u010c\u010d\7p\2\2\u010d8\3\2\2\2\u010e"+
		"\u010f\7g\2\2\u010f\u0110\7x\2\2\u0110\u0111\7g\2\2\u0111\u0112\7t\2\2"+
		"\u0112\u0113\7{\2\2\u0113:\3\2\2\2\u0114\u0115\7o\2\2\u0115\u0116\7u\2"+
		"\2\u0116<\3\2\2\2\u0117\u0118\7u\2\2\u0118\u0119\7g\2\2\u0119\u011a\7"+
		"e\2\2\u011a\u011b\7q\2\2\u011b\u011c\7p\2\2\u011c\u011d\7f\2\2\u011d\u011e"+
		"\7u\2\2\u011e>\3\2\2\2\u011f\u0120\7o\2\2\u0120\u0121\7k\2\2\u0121\u0122"+
		"\7p\2\2\u0122\u0123\7w\2\2\u0123\u0124\7v\2\2\u0124\u0125\7g\2\2\u0125"+
		"\u0126\7u\2\2\u0126@\3\2\2\2\u0127\u0128\7j\2\2\u0128\u0129\7q\2\2\u0129"+
		"\u012a\7w\2\2\u012a\u012b\7t\2\2\u012b\u012c\7u\2\2\u012cB\3\2\2\2\u012d"+
		"\u012e\7f\2\2\u012e\u012f\7c\2\2\u012f\u0130\7{\2\2\u0130\u0131\7u\2\2"+
		"\u0131D\3\2\2\2\u0132\u0133\7y\2\2\u0133\u0134\7g\2\2\u0134\u0135\7g\2"+
		"\2\u0135\u0136\7m\2\2\u0136\u0137\7u\2\2\u0137F\3\2\2\2\u0138\u0139\7"+
		"o\2\2\u0139\u013a\7q\2\2\u013a\u013b\7p\2\2\u013b\u013c\7v\2\2\u013c\u013d"+
		"\7j\2\2\u013d\u013e\7u\2\2\u013eH\3\2\2\2\u013f\u0140\7y\2\2\u0140\u0141"+
		"\7c\2\2\u0141\u0142\7k\2\2\u0142\u0143\7v\2\2\u0143J\3\2\2\2\u0144\u0145"+
		"\7u\2\2\u0145\u0146\7v\2\2\u0146\u0147\7t\2\2\u0147\u0148\7k\2\2\u0148"+
		"\u0149\7p\2\2\u0149\u014a\7i\2\2\u014aL\3\2\2\2\u014b\u014c\7k\2\2\u014c"+
		"\u014d\7p\2\2\u014d\u014e\7v\2\2\u014eN\3\2\2\2\u014f\u0150\7h\2\2\u0150"+
		"\u0151\7n\2\2\u0151\u0152\7q\2\2\u0152\u0153\7c\2\2\u0153\u0154\7v\2\2"+
		"\u0154P\3\2\2\2\u0155\u0156\7u\2\2\u0156\u0157\7g\2\2\u0157\u0158\7v\2"+
		"\2\u0158R\3\2\2\2\u0159\u015a\7i\2\2\u015a\u015b\7g\2\2\u015b\u015c\7"+
		"v\2\2\u015cT\3\2\2\2\u015d\u015e\7g\2\2\u015e\u015f\7z\2\2\u015f\u0160"+
		"\7e\2\2\u0160\u0161\7g\2\2\u0161\u0162\7g\2\2\u0162\u0163\7f\2\2\u0163"+
		"\u0164\7u\2\2\u0164V\3\2\2\2\u0165\u0166\7f\2\2\u0166\u0167\7g\2\2\u0167"+
		"\u0168\7e\2\2\u0168\u0169\7g\2\2\u0169\u016a\7g\2\2\u016a\u016b\7f\2\2"+
		"\u016b\u016c\7u\2\2\u016cX\3\2\2\2\u016d\u016e\7p\2\2\u016e\u016f\7q\2"+
		"\2\u016f\u0170\7y\2\2\u0170Z\3\2\2\2\u0171\u0172\7g\2\2\u0172\u0173\7"+
		"n\2\2\u0173\u0174\7u\2\2\u0174\u0175\7g\2\2\u0175\\\3\2\2\2\u0176\u0177"+
		"\7t\2\2\u0177\u0178\7g\2\2\u0178\u0179\7v\2\2\u0179\u017a\7w\2\2\u017a"+
		"\u017b\7t\2\2\u017b\u017c\7p\2\2\u017c^\3\2\2\2\u017d\u017e\7d\2\2\u017e"+
		"\u017f\7t\2\2\u017f\u0180\7g\2\2\u0180\u0181\7c\2\2\u0181\u0182\7m\2\2"+
		"\u0182`\3\2\2\2\u0183\u0184\7c\2\2\u0184\u0185\7v\2\2\u0185b\3\2\2\2\u0186"+
		"\u0187\7u\2\2\u0187\u0188\7v\2\2\u0188\u0189\7c\2\2\u0189\u018a\7t\2\2"+
		"\u018a\u018b\7v\2\2\u018b\u018c\7k\2\2\u018c\u018d\7p\2\2\u018d\u018e"+
		"\7i\2\2\u018ed\3\2\2\2\u018f\u0190\7*\2\2\u0190f\3\2\2\2\u0191\u0192\7"+
		"+\2\2\u0192h\3\2\2\2\u0193\u0194\7}\2\2\u0194j\3\2\2\2\u0195\u0196\7\177"+
		"\2\2\u0196l\3\2\2\2\u0197\u0198\7?\2\2\u0198n\3\2\2\2\u0199\u019a\7-\2"+
		"\2\u019ap\3\2\2\2\u019b\u019c\7/\2\2\u019cr\3\2\2\2\u019d\u019e\7\61\2"+
		"\2\u019et\3\2\2\2\u019f\u01a0\7,\2\2\u01a0v\3\2\2\2\u01a1\u01a2\7\60\2"+
		"\2\u01a2\u01a3\7\60\2\2\u01a3x\3\2\2\2\u01a4\u01a5\7=\2\2\u01a5z\3\2\2"+
		"\2\u01a6\u01a7\7.\2\2\u01a7|\3\2\2\2\u01a8\u01a9\7$\2\2\u01a9~\3\2\2\2"+
		"\u01aa\u01ab\7<\2\2\u01ab\u0080\3\2\2\2\u01ac\u01ad\7(\2\2\u01ad\u0082"+
		"\3\2\2\2\u01ae\u01af\5\17\b\2\u01af\u01b0\5\17\b\2\u01b0\u01b1\7f\2\2"+
		"\u01b1\u01b2\5\17\b\2\u01b2\u01b3\5\17\b\2\u01b3\u01b4\7o\2\2\u01b4\u01b5"+
		"\5\17\b\2\u01b5\u01b6\5\17\b\2\u01b6\u01b7\5\17\b\2\u01b7\u01b8\5\17\b"+
		"\2\u01b8\u01b9\7{\2\2\u01b9\u0084\3\2\2\2\u01ba\u01bb\5\17\b\2\u01bb\u01bc"+
		"\5\17\b\2\u01bc\u01bd\7f\2\2\u01bd\u01be\5\17\b\2\u01be\u01bf\5\17\b\2"+
		"\u01bf\u01c0\7o\2\2\u01c0\u0086\3\2\2\2\u01c1\u01c3\7/\2\2\u01c2\u01c1"+
		"\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c6\5\17\b\2"+
		"\u01c5\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\7\60\2\2\u01ca\u01cc\5\17\b\2"+
		"\u01cb\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce"+
		"\3\2\2\2\u01ce\u0088\3\2\2\2\u01cf\u01d0\5\17\b\2\u01d0\u01d1\5\17\b\2"+
		"\u01d1\u01d2\5\177@\2\u01d2\u01d3\5\17\b\2\u01d3\u01d4\5\17\b\2\u01d4"+
		"\u008a\3\2\2\2\u01d5\u01d7\7/\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2"+
		"\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01da\5\17\b\2\u01d9\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u008c\3\2"+
		"\2\2\u01dd\u01e2\7$\2\2\u01de\u01e3\5\13\6\2\u01df\u01e3\5\r\7\2\u01e0"+
		"\u01e3\5\u0091I\2\u01e1\u01e3\5\17\b\2\u01e2\u01de\3\2\2\2\u01e2\u01df"+
		"\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\7$"+
		"\2\2\u01e7\u008e\3\2\2\2\u01e8\u01eb\5\13\6\2\u01e9\u01eb\5\r\7\2\u01ea"+
		"\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01f1\3\2\2\2\u01ec\u01f0\5\13"+
		"\6\2\u01ed\u01f0\5\r\7\2\u01ee\u01f0\5\17\b\2\u01ef\u01ec\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2"+
		"\2\2\u01f1\u01f2\3\2\2\2\u01f2\u0090\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4"+
		"\u01f5\t\7\2\2\u01f5\u0092\3\2\2\2\20\2\u00a1\u00a7\u00ab\u01c2\u01c7"+
		"\u01cd\u01d6\u01db\u01e2\u01e4\u01ea\u01ef\u01f1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}