// Generated from /Users/philip/Library/Mobile Documents/com~apple~CloudDocs/Cloud dokumenter/Java projects/P4Grammar/Pivot.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PivotParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_decls = 1, RULE_define = 2, RULE_signal = 3, RULE_enumerations = 4, 
		RULE_enumeration = 5, RULE_range = 6, RULE_lowerBound = 7, RULE_upperBound = 8, 
		RULE_device = 9, RULE_inputs = 10, RULE_outputs = 11, RULE_declDevice = 12, 
		RULE_init = 13, RULE_funcDecl = 14, RULE_fParams = 15, RULE_param = 16, 
		RULE_event = 17, RULE_atomEvent = 18, RULE_repeatEvent = 19, RULE_timeFrame = 20, 
		RULE_block = 21, RULE_stmts = 22, RULE_waitStmt = 23, RULE_assignment = 24, 
		RULE_ifstmt = 25, RULE_whilestmt = 26, RULE_funcCall = 27, RULE_arguments = 28, 
		RULE_declVar = 29, RULE_brk = 30, RULE_rtn = 31, RULE_litVal = 32, RULE_expr = 33, 
		RULE_logical_expr = 34, RULE_comparison_expr = 35, RULE_comparison_operand = 36, 
		RULE_comp_operator = 37, RULE_atom = 38, RULE_varType = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decls", "define", "signal", "enumerations", "enumeration", 
			"range", "lowerBound", "upperBound", "device", "inputs", "outputs", "declDevice", 
			"init", "funcDecl", "fParams", "param", "event", "atomEvent", "repeatEvent", 
			"timeFrame", "block", "stmts", "waitStmt", "assignment", "ifstmt", "whilestmt", 
			"funcCall", "arguments", "declVar", "brk", "rtn", "litVal", "expr", "logical_expr", 
			"comparison_expr", "comparison_operand", "comp_operator", "atom", "varType"
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

	@Override
	public String getGrammarFileName() { return "Pivot.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PivotParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PivotParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			decls();
			setState(81);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclsContext extends ParserRuleContext {
		public DefineContext defs;
		public DeclVarContext vars;
		public DeclDeviceContext devVars;
		public InitContext inFunc;
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public List<EventContext> event() {
			return getRuleContexts(EventContext.class);
		}
		public EventContext event(int i) {
			return getRuleContext(EventContext.class,i);
		}
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public List<DeclVarContext> declVar() {
			return getRuleContexts(DeclVarContext.class);
		}
		public DeclVarContext declVar(int i) {
			return getRuleContext(DeclVarContext.class,i);
		}
		public List<DeclDeviceContext> declDevice() {
			return getRuleContexts(DeclDeviceContext.class);
		}
		public DeclDeviceContext declDevice(int i) {
			return getRuleContext(DeclDeviceContext.class,i);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decls);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFINEKW) {
				{
				{
				setState(83);
				((DeclsContext)_localctx).defs = define();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(91);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRINGKW:
					case INTEGERKW:
					case FLOATKW:
						{
						setState(89);
						((DeclsContext)_localctx).vars = declVar();
						}
						break;
					case ID:
						{
						setState(90);
						((DeclsContext)_localctx).devVars = declDevice();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITFUNCKW) {
				{
				setState(96);
				((DeclsContext)_localctx).inFunc = init();
				}
			}

			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << WHEN) | (1L << EVERY) | (1L << STRINGKW) | (1L << INTEGERKW) | (1L << FLOATKW))) != 0)) {
				{
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
				case STRINGKW:
				case INTEGERKW:
				case FLOATKW:
					{
					setState(99);
					funcDecl();
					}
					break;
				case WHEN:
				case EVERY:
					{
					setState(100);
					event();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineContext extends ParserRuleContext {
		public TerminalNode DEFINEKW() { return getToken(PivotParser.DEFINEKW, 0); }
		public TerminalNode SEMCOL() { return getToken(PivotParser.SEMCOL, 0); }
		public SignalContext signal() {
			return getRuleContext(SignalContext.class,0);
		}
		public DeviceContext device() {
			return getRuleContext(DeviceContext.class,0);
		}
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(DEFINEKW);
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGNAL:
				{
				setState(107);
				signal();
				}
				break;
			case DEVICE:
				{
				setState(108);
				device();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(111);
			match(SEMCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignalContext extends ParserRuleContext {
		public TerminalNode SIGNAL() { return getToken(PivotParser.SIGNAL, 0); }
		public TerminalNode ID() { return getToken(PivotParser.ID, 0); }
		public TerminalNode COL() { return getToken(PivotParser.COL, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public EnumerationsContext enumerations() {
			return getRuleContext(EnumerationsContext.class,0);
		}
		public SignalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterSignal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitSignal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitSignal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignalContext signal() throws RecognitionException {
		SignalContext _localctx = new SignalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_signal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(SIGNAL);
			setState(114);
			match(ID);
			setState(115);
			match(COL);
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INTEGER:
				{
				setState(116);
				range();
				}
				break;
			case ID:
				{
				setState(117);
				enumerations();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationsContext extends ParserRuleContext {
		public List<EnumerationContext> enumeration() {
			return getRuleContexts(EnumerationContext.class);
		}
		public EnumerationContext enumeration(int i) {
			return getRuleContext(EnumerationContext.class,i);
		}
		public List<TerminalNode> LISTSEP() { return getTokens(PivotParser.LISTSEP); }
		public TerminalNode LISTSEP(int i) {
			return getToken(PivotParser.LISTSEP, i);
		}
		public EnumerationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterEnumerations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitEnumerations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitEnumerations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationsContext enumerations() throws RecognitionException {
		EnumerationsContext _localctx = new EnumerationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_enumerations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			enumeration();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LISTSEP) {
				{
				{
				setState(121);
				match(LISTSEP);
				setState(122);
				enumeration();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationContext extends ParserRuleContext {
		public LitValContext enumVal;
		public TerminalNode ID() { return getToken(PivotParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(PivotParser.EQUALS, 0); }
		public LitValContext litVal() {
			return getRuleContext(LitValContext.class,0);
		}
		public EnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitEnumeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitEnumeration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationContext enumeration() throws RecognitionException {
		EnumerationContext _localctx = new EnumerationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_enumeration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ID);
			setState(129);
			match(EQUALS);
			setState(130);
			((EnumerationContext)_localctx).enumVal = litVal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public LowerBoundContext lowerBound() {
			return getRuleContext(LowerBoundContext.class,0);
		}
		public TerminalNode RANGESEP() { return getToken(PivotParser.RANGESEP, 0); }
		public UpperBoundContext upperBound() {
			return getRuleContext(UpperBoundContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			lowerBound();
			setState(133);
			match(RANGESEP);
			setState(134);
			upperBound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LowerBoundContext extends ParserRuleContext {
		public LowerBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowerBound; }
	 
		public LowerBoundContext() { }
		public void copyFrom(LowerBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntlwRangeContext extends LowerBoundContext {
		public TerminalNode INTEGER() { return getToken(PivotParser.INTEGER, 0); }
		public IntlwRangeContext(LowerBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterIntlwRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitIntlwRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitIntlwRange(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatlwRangeContext extends LowerBoundContext {
		public TerminalNode FLOAT() { return getToken(PivotParser.FLOAT, 0); }
		public FloatlwRangeContext(LowerBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterFloatlwRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitFloatlwRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitFloatlwRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowerBoundContext lowerBound() throws RecognitionException {
		LowerBoundContext _localctx = new LowerBoundContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lowerBound);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntlwRangeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatlwRangeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpperBoundContext extends ParserRuleContext {
		public UpperBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upperBound; }
	 
		public UpperBoundContext() { }
		public void copyFrom(UpperBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntupRangeContext extends UpperBoundContext {
		public TerminalNode INTEGER() { return getToken(PivotParser.INTEGER, 0); }
		public IntupRangeContext(UpperBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterIntupRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitIntupRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitIntupRange(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatupRangeContext extends UpperBoundContext {
		public TerminalNode FLOAT() { return getToken(PivotParser.FLOAT, 0); }
		public FloatupRangeContext(UpperBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterFloatupRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitFloatupRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitFloatupRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpperBoundContext upperBound() throws RecognitionException {
		UpperBoundContext _localctx = new UpperBoundContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_upperBound);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntupRangeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatupRangeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeviceContext extends ParserRuleContext {
		public TerminalNode DEVICE() { return getToken(PivotParser.DEVICE, 0); }
		public TerminalNode ID() { return getToken(PivotParser.ID, 0); }
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public TerminalNode AMP() { return getToken(PivotParser.AMP, 0); }
		public OutputsContext outputs() {
			return getRuleContext(OutputsContext.class,0);
		}
		public DeviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_device; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterDevice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitDevice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitDevice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeviceContext device() throws RecognitionException {
		DeviceContext _localctx = new DeviceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_device);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(DEVICE);
			setState(145);
			match(ID);
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INPUT) {
					{
					setState(146);
					inputs();
					}
				}

				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AMP) {
					{
					setState(149);
					match(AMP);
					setState(150);
					outputs();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTPUT) {
					{
					setState(153);
					outputs();
					}
				}

				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AMP) {
					{
					setState(156);
					match(AMP);
					setState(157);
					inputs();
					}
				}

				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputsContext extends ParserRuleContext {
		public Token input;
		public TerminalNode INPUT() { return getToken(PivotParser.INPUT, 0); }
		public TerminalNode COL() { return getToken(PivotParser.COL, 0); }
		public List<TerminalNode> ID() { return getTokens(PivotParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PivotParser.ID, i);
		}
		public List<TerminalNode> LISTSEP() { return getTokens(PivotParser.LISTSEP); }
		public TerminalNode LISTSEP(int i) {
			return getToken(PivotParser.LISTSEP, i);
		}
		public InputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputsContext inputs() throws RecognitionException {
		InputsContext _localctx = new InputsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(INPUT);
			setState(163);
			match(COL);
			setState(164);
			((InputsContext)_localctx).input = match(ID);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LISTSEP) {
				{
				{
				setState(165);
				match(LISTSEP);
				setState(166);
				((InputsContext)_localctx).input = match(ID);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputsContext extends ParserRuleContext {
		public Token output;
		public TerminalNode OUTPUT() { return getToken(PivotParser.OUTPUT, 0); }
		public TerminalNode COL() { return getToken(PivotParser.COL, 0); }
		public List<TerminalNode> ID() { return getTokens(PivotParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PivotParser.ID, i);
		}
		public List<TerminalNode> LISTSEP() { return getTokens(PivotParser.LISTSEP); }
		public TerminalNode LISTSEP(int i) {
			return getToken(PivotParser.LISTSEP, i);
		}
		public OutputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterOutputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitOutputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitOutputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputsContext outputs() throws RecognitionException {
		OutputsContext _localctx = new OutputsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_outputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(OUTPUT);
			setState(173);
			match(COL);
			setState(174);
			((OutputsContext)_localctx).output = match(ID);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LISTSEP) {
				{
				{
				setState(175);
				match(LISTSEP);
				setState(176);
				((OutputsContext)_localctx).output = match(ID);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclDeviceContext extends ParserRuleContext {
		public Token devType;
		public Token varID;
		public Token val;
		public TerminalNode EQUALS() { return getToken(PivotParser.EQUALS, 0); }
		public TerminalNode SEMCOL() { return getToken(PivotParser.SEMCOL, 0); }
		public List<TerminalNode> ID() { return getTokens(PivotParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PivotParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(PivotParser.STRING, 0); }
		public DeclDeviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declDevice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterDeclDevice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitDeclDevice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitDeclDevice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclDeviceContext declDevice() throws RecognitionException {
		DeclDeviceContext _localctx = new DeclDeviceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declDevice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			((DeclDeviceContext)_localctx).devType = match(ID);
			setState(183);
			((DeclDeviceContext)_localctx).varID = match(ID);
			setState(184);
			match(EQUALS);
			setState(185);
			((DeclDeviceContext)_localctx).val = match(STRING);
			setState(186);
			match(SEMCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitContext extends ParserRuleContext {
		public TerminalNode INITFUNCKW() { return getToken(PivotParser.INITFUNCKW, 0); }
		public TerminalNode PARANBEG() { return getToken(PivotParser.PARANBEG, 0); }
		public TerminalNode PARANEND() { return getToken(PivotParser.PARANEND, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(INITFUNCKW);
			setState(189);
			match(PARANBEG);
			setState(190);
			match(PARANEND);
			setState(191);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclContext extends ParserRuleContext {
		public Token id;
		public FParamsContext params;
		public TerminalNode PARANBEG() { return getToken(PivotParser.PARANBEG, 0); }
		public TerminalNode PARANEND() { return getToken(PivotParser.PARANEND, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ID() { return getToken(PivotParser.ID, 0); }
		public FParamsContext fParams() {
			return getRuleContext(FParamsContext.class,0);
		}
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(PivotParser.VOID, 0); }
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGKW:
			case INTEGERKW:
			case FLOATKW:
				{
				setState(193);
				varType();
				}
				break;
			case VOID:
				{
				setState(194);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(197);
			((FuncDeclContext)_localctx).id = match(ID);
			setState(198);
			match(PARANBEG);
			setState(199);
			((FuncDeclContext)_localctx).params = fParams();
			setState(200);
			match(PARANEND);
			setState(201);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> LISTSEP() { return getTokens(PivotParser.LISTSEP); }
		public TerminalNode LISTSEP(int i) {
			return getToken(PivotParser.LISTSEP, i);
		}
		public FParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterFParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitFParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitFParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FParamsContext fParams() throws RecognitionException {
		FParamsContext _localctx = new FParamsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRINGKW) | (1L << INTEGERKW) | (1L << FLOATKW))) != 0)) {
				{
				setState(203);
				param();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LISTSEP) {
					{
					{
					setState(204);
					match(LISTSEP);
					setState(205);
					param();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public Token localID;
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PivotParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			varType();
			setState(214);
			((ParamContext)_localctx).localID = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventContext extends ParserRuleContext {
		public AtomEventContext atomEvent() {
			return getRuleContext(AtomEventContext.class,0);
		}
		public RepeatEventContext repeatEvent() {
			return getRuleContext(RepeatEventContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHEN:
				{
				setState(216);
				atomEvent();
				}
				break;
			case EVERY:
				{
				setState(217);
				repeatEvent();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomEventContext extends ParserRuleContext {
		public Token deviceID;
		public Token signalID;
		public Token enumID;
		public TerminalNode WHEN() { return getToken(PivotParser.WHEN, 0); }
		public TerminalNode COL() { return getToken(PivotParser.COL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PivotParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PivotParser.ID, i);
		}
		public TerminalNode EXCEEDS() { return getToken(PivotParser.EXCEEDS, 0); }
		public TerminalNode INTEGER() { return getToken(PivotParser.INTEGER, 0); }
		public TerminalNode DECEEDS() { return getToken(PivotParser.DECEEDS, 0); }
		public TerminalNode DATE() { return getToken(PivotParser.DATE, 0); }
		public TerminalNode AT() { return getToken(PivotParser.AT, 0); }
		public TerminalNode TIME() { return getToken(PivotParser.TIME, 0); }
		public AtomEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterAtomEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitAtomEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitAtomEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomEventContext atomEvent() throws RecognitionException {
		AtomEventContext _localctx = new AtomEventContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atomEvent);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(WHEN);
				setState(221);
				((AtomEventContext)_localctx).deviceID = match(ID);
				setState(222);
				((AtomEventContext)_localctx).signalID = match(ID);
				setState(223);
				match(COL);
				setState(229);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(224);
					((AtomEventContext)_localctx).enumID = match(ID);
					}
					break;
				case EXCEEDS:
					{
					setState(225);
					match(EXCEEDS);
					setState(226);
					match(INTEGER);
					}
					break;
				case DECEEDS:
					{
					setState(227);
					match(DECEEDS);
					setState(228);
					match(INTEGER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(WHEN);
				setState(233);
				match(DATE);
				setState(234);
				match(AT);
				setState(235);
				match(TIME);
				setState(236);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(WHEN);
				setState(238);
				match(TIME);
				setState(239);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatEventContext extends ParserRuleContext {
		public TerminalNode EVERY() { return getToken(PivotParser.EVERY, 0); }
		public TerminalNode INTEGER() { return getToken(PivotParser.INTEGER, 0); }
		public TimeFrameContext timeFrame() {
			return getRuleContext(TimeFrameContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode AT() { return getToken(PivotParser.AT, 0); }
		public TerminalNode TIME() { return getToken(PivotParser.TIME, 0); }
		public TerminalNode STARTING() { return getToken(PivotParser.STARTING, 0); }
		public TerminalNode DATE() { return getToken(PivotParser.DATE, 0); }
		public RepeatEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterRepeatEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitRepeatEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitRepeatEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatEventContext repeatEvent() throws RecognitionException {
		RepeatEventContext _localctx = new RepeatEventContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_repeatEvent);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(EVERY);
				setState(243);
				match(INTEGER);
				setState(244);
				timeFrame();
				setState(245);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(EVERY);
				setState(248);
				match(INTEGER);
				setState(249);
				timeFrame();
				setState(250);
				match(AT);
				setState(251);
				match(TIME);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STARTING) {
					{
					setState(252);
					match(STARTING);
					setState(253);
					match(DATE);
					}
				}

				setState(256);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeFrameContext extends ParserRuleContext {
		public TerminalNode MONTHS() { return getToken(PivotParser.MONTHS, 0); }
		public TerminalNode WEEKS() { return getToken(PivotParser.WEEKS, 0); }
		public TerminalNode DAYS() { return getToken(PivotParser.DAYS, 0); }
		public TerminalNode HOURS() { return getToken(PivotParser.HOURS, 0); }
		public TerminalNode MINUTES() { return getToken(PivotParser.MINUTES, 0); }
		public TerminalNode SECONDS() { return getToken(PivotParser.SECONDS, 0); }
		public TerminalNode MS() { return getToken(PivotParser.MS, 0); }
		public TimeFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterTimeFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitTimeFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitTimeFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeFrameContext timeFrame() throws RecognitionException {
		TimeFrameContext _localctx = new TimeFrameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_timeFrame);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MS) | (1L << SECONDS) | (1L << MINUTES) | (1L << HOURS) | (1L << DAYS) | (1L << WEEKS) | (1L << MONTHS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BLCKBEG() { return getToken(PivotParser.BLCKBEG, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode BLCKEND() { return getToken(PivotParser.BLCKEND, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(BLCKBEG);
			setState(263);
			stmts();
			setState(264);
			match(BLCKEND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtsContext extends ParserRuleContext {
		public List<WaitStmtContext> waitStmt() {
			return getRuleContexts(WaitStmtContext.class);
		}
		public WaitStmtContext waitStmt(int i) {
			return getRuleContext(WaitStmtContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<IfstmtContext> ifstmt() {
			return getRuleContexts(IfstmtContext.class);
		}
		public IfstmtContext ifstmt(int i) {
			return getRuleContext(IfstmtContext.class,i);
		}
		public List<WhilestmtContext> whilestmt() {
			return getRuleContexts(WhilestmtContext.class);
		}
		public WhilestmtContext whilestmt(int i) {
			return getRuleContext(WhilestmtContext.class,i);
		}
		public List<FuncCallContext> funcCall() {
			return getRuleContexts(FuncCallContext.class);
		}
		public FuncCallContext funcCall(int i) {
			return getRuleContext(FuncCallContext.class,i);
		}
		public List<TerminalNode> SEMCOL() { return getTokens(PivotParser.SEMCOL); }
		public TerminalNode SEMCOL(int i) {
			return getToken(PivotParser.SEMCOL, i);
		}
		public List<DeclVarContext> declVar() {
			return getRuleContexts(DeclVarContext.class);
		}
		public DeclVarContext declVar(int i) {
			return getRuleContext(DeclVarContext.class,i);
		}
		public List<BrkContext> brk() {
			return getRuleContexts(BrkContext.class);
		}
		public BrkContext brk(int i) {
			return getRuleContext(BrkContext.class,i);
		}
		public List<RtnContext> rtn() {
			return getRuleContexts(RtnContext.class);
		}
		public RtnContext rtn(int i) {
			return getRuleContext(RtnContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (IF - 19)) | (1L << (WHILE - 19)) | (1L << (WAIT - 19)) | (1L << (STRINGKW - 19)) | (1L << (INTEGERKW - 19)) | (1L << (FLOATKW - 19)) | (1L << (SET - 19)) | (1L << (GET - 19)) | (1L << (RETURN - 19)) | (1L << (BREAK - 19)) | (1L << (ID - 19)))) != 0)) {
				{
				setState(276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(266);
					waitStmt();
					}
					break;
				case 2:
					{
					setState(267);
					assignment();
					}
					break;
				case 3:
					{
					setState(268);
					ifstmt();
					}
					break;
				case 4:
					{
					setState(269);
					whilestmt();
					}
					break;
				case 5:
					{
					setState(270);
					funcCall();
					setState(271);
					match(SEMCOL);
					}
					break;
				case 6:
					{
					setState(273);
					declVar();
					}
					break;
				case 7:
					{
					setState(274);
					brk();
					}
					break;
				case 8:
					{
					setState(275);
					rtn();
					}
					break;
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WaitStmtContext extends ParserRuleContext {
		public Token varID;
		public TerminalNode WAIT() { return getToken(PivotParser.WAIT, 0); }
		public TerminalNode INTEGER() { return getToken(PivotParser.INTEGER, 0); }
		public TimeFrameContext timeFrame() {
			return getRuleContext(TimeFrameContext.class,0);
		}
		public TerminalNode SEMCOL() { return getToken(PivotParser.SEMCOL, 0); }
		public TerminalNode ID() { return getToken(PivotParser.ID, 0); }
		public WaitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterWaitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitWaitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitWaitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaitStmtContext waitStmt() throws RecognitionException {
		WaitStmtContext _localctx = new WaitStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_waitStmt);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(WAIT);
				setState(282);
				match(INTEGER);
				setState(283);
				timeFrame();
				setState(284);
				match(SEMCOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(WAIT);
				setState(287);
				((WaitStmtContext)_localctx).varID = match(ID);
				setState(288);
				timeFrame();
				setState(289);
				match(SEMCOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Token varID;
		public TerminalNode EQUALS() { return getToken(PivotParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMCOL() { return getToken(PivotParser.SEMCOL, 0); }
		public TerminalNode ID() { return getToken(PivotParser.ID, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			((AssignmentContext)_localctx).varID = match(ID);
			setState(294);
			match(EQUALS);
			setState(295);
			expr(0);
			setState(296);
			match(SEMCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstmtContext extends ParserRuleContext {
		public BlockContext blck;
		public BlockContext elseblck;
		public TerminalNode IF() { return getToken(PivotParser.IF, 0); }
		public TerminalNode PARANBEG() { return getToken(PivotParser.PARANBEG, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode PARANEND() { return getToken(PivotParser.PARANEND, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PivotParser.ELSE, 0); }
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(IF);
			setState(299);
			match(PARANBEG);
			setState(300);
			logical_expr(0);
			setState(301);
			match(PARANEND);
			setState(302);
			((IfstmtContext)_localctx).blck = block();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(303);
				match(ELSE);
				setState(304);
				((IfstmtContext)_localctx).elseblck = block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhilestmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PivotParser.WHILE, 0); }
		public TerminalNode PARANBEG() { return getToken(PivotParser.PARANBEG, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode PARANEND() { return getToken(PivotParser.PARANEND, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitWhilestmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitWhilestmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(WHILE);
			setState(308);
			match(PARANBEG);
			setState(309);
			logical_expr(0);
			setState(310);
			match(PARANEND);
			setState(311);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public Token id;
		public Token deviceID;
		public Token signalID;
		public Token enumID;
		public TerminalNode PARANBEG() { return getToken(PivotParser.PARANBEG, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode PARANEND() { return getToken(PivotParser.PARANEND, 0); }
		public List<TerminalNode> ID() { return getTokens(PivotParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PivotParser.ID, i);
		}
		public TerminalNode SET() { return getToken(PivotParser.SET, 0); }
		public TerminalNode COL() { return getToken(PivotParser.COL, 0); }
		public LitValContext litVal() {
			return getRuleContext(LitValContext.class,0);
		}
		public TerminalNode GET() { return getToken(PivotParser.GET, 0); }
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_funcCall);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				((FuncCallContext)_localctx).id = match(ID);
				setState(314);
				match(PARANBEG);
				setState(315);
				arguments();
				setState(316);
				match(PARANEND);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(SET);
				setState(319);
				((FuncCallContext)_localctx).deviceID = match(ID);
				setState(320);
				((FuncCallContext)_localctx).signalID = match(ID);
				setState(321);
				match(COL);
				setState(324);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(322);
					((FuncCallContext)_localctx).enumID = match(ID);
					}
					break;
				case FLOAT:
				case INTEGER:
				case STRING:
					{
					setState(323);
					litVal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				match(GET);
				setState(327);
				((FuncCallContext)_localctx).deviceID = match(ID);
				setState(328);
				((FuncCallContext)_localctx).signalID = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> LISTSEP() { return getTokens(PivotParser.LISTSEP); }
		public TerminalNode LISTSEP(int i) {
			return getToken(PivotParser.LISTSEP, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (SET - 36)) | (1L << (GET - 36)) | (1L << (NOW - 36)) | (1L << (PARANBEG - 36)) | (1L << (FLOAT - 36)) | (1L << (INTEGER - 36)) | (1L << (STRING - 36)) | (1L << (ID - 36)))) != 0)) {
				{
				setState(331);
				expr(0);
				}
			}

			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LISTSEP) {
				{
				{
				setState(334);
				match(LISTSEP);
				setState(335);
				expr(0);
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclVarContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PivotParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(PivotParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMCOL() { return getToken(PivotParser.SEMCOL, 0); }
		public DeclVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterDeclVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitDeclVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitDeclVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclVarContext declVar() throws RecognitionException {
		DeclVarContext _localctx = new DeclVarContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_declVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			varType();
			setState(342);
			match(ID);
			setState(343);
			match(EQUALS);
			setState(344);
			expr(0);
			setState(345);
			match(SEMCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BrkContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(PivotParser.BREAK, 0); }
		public TerminalNode SEMCOL() { return getToken(PivotParser.SEMCOL, 0); }
		public BrkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterBrk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitBrk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitBrk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrkContext brk() throws RecognitionException {
		BrkContext _localctx = new BrkContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_brk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(BREAK);
			setState(348);
			match(SEMCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RtnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PivotParser.RETURN, 0); }
		public TerminalNode SEMCOL() { return getToken(PivotParser.SEMCOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RtnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rtn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterRtn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitRtn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitRtn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RtnContext rtn() throws RecognitionException {
		RtnContext _localctx = new RtnContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_rtn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(350);
			match(RETURN);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (SET - 36)) | (1L << (GET - 36)) | (1L << (NOW - 36)) | (1L << (PARANBEG - 36)) | (1L << (FLOAT - 36)) | (1L << (INTEGER - 36)) | (1L << (STRING - 36)) | (1L << (ID - 36)))) != 0)) {
				{
				setState(351);
				expr(0);
				}
			}

			setState(354);
			match(SEMCOL);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LitValContext extends ParserRuleContext {
		public LitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_litVal; }
	 
		public LitValContext() { }
		public void copyFrom(LitValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntValContext extends LitValContext {
		public TerminalNode INTEGER() { return getToken(PivotParser.INTEGER, 0); }
		public IntValContext(LitValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterIntVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitIntVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitIntVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringValContext extends LitValContext {
		public TerminalNode STRING() { return getToken(PivotParser.STRING, 0); }
		public StringValContext(LitValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterStringVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitStringVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitStringVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatValContext extends LitValContext {
		public TerminalNode FLOAT() { return getToken(PivotParser.FLOAT, 0); }
		public FloatValContext(LitValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterFloatVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitFloatVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitFloatVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LitValContext litVal() throws RecognitionException {
		LitValContext _localctx = new LitValContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_litVal);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new StringValContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiExprContext extends ExprContext {
		public ExprContext leftChild;
		public Token op;
		public ExprContext rightChild;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(PivotParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(PivotParser.MULT, 0); }
		public MultiExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterMultiExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitMultiExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitMultiExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanExprContext extends ExprContext {
		public TerminalNode PARANBEG() { return getToken(PivotParser.PARANBEG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARANEND() { return getToken(PivotParser.PARANEND, 0); }
		public ParanExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterParanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitParanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitParanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunCallContext extends ExprContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FunCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusExprContext extends ExprContext {
		public ExprContext leftChild;
		public Token op;
		public ExprContext rightChild;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PivotParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PivotParser.MINUS, 0); }
		public PlusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitPlusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				_localctx = new ParanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(362);
				match(PARANBEG);
				setState(363);
				expr(0);
				setState(364);
				match(PARANEND);
				}
				break;
			case 2:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				atom();
				}
				break;
			case 3:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(367);
				funcCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(376);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new MultiExprContext(new ExprContext(_parentctx, _parentState));
						((MultiExprContext)_localctx).leftChild = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(370);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(371);
						((MultiExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MULT) ) {
							((MultiExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(372);
						((MultiExprContext)_localctx).rightChild = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new PlusExprContext(new ExprContext(_parentctx, _parentState));
						((PlusExprContext)_localctx).leftChild = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(373);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(374);
						((PlusExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(375);
						((PlusExprContext)_localctx).rightChild = expr(5);
						}
						break;
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Logical_exprContext extends ParserRuleContext {
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
	 
		public Logical_exprContext() { }
		public void copyFrom(Logical_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalExpressionOrContext extends Logical_exprContext {
		public Logical_exprContext left;
		public Logical_exprContext right;
		public TerminalNode OR() { return getToken(PivotParser.OR, 0); }
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public LogicalExpressionOrContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterLogicalExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitLogicalExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitLogicalExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends Logical_exprContext {
		public Comparison_exprContext comparison_expr() {
			return getRuleContext(Comparison_exprContext.class,0);
		}
		public ComparisonExpressionContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalLiteralsContext extends Logical_exprContext {
		public TerminalNode TRUE() { return getToken(PivotParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PivotParser.FALSE, 0); }
		public LogicalLiteralsContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterLogicalLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitLogicalLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitLogicalLiterals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionAndContext extends Logical_exprContext {
		public Logical_exprContext left;
		public Logical_exprContext right;
		public TerminalNode AND() { return getToken(PivotParser.AND, 0); }
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public LogicalExpressionAndContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterLogicalExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitLogicalExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitLogicalExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionInParenContext extends Logical_exprContext {
		public TerminalNode PARANBEG() { return getToken(PivotParser.PARANBEG, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode PARANEND() { return getToken(PivotParser.PARANEND, 0); }
		public LogicalExpressionInParenContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterLogicalExpressionInParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitLogicalExpressionInParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitLogicalExpressionInParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		return logical_expr(0);
	}

	private Logical_exprContext logical_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, _parentState);
		Logical_exprContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_logical_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				_localctx = new ComparisonExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(382);
				comparison_expr();
				}
				break;
			case 2:
				{
				_localctx = new LogicalExpressionInParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(383);
				match(PARANBEG);
				setState(384);
				logical_expr(0);
				setState(385);
				match(PARANEND);
				}
				break;
			case 3:
				{
				_localctx = new LogicalLiteralsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(387);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(396);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionAndContext(new Logical_exprContext(_parentctx, _parentState));
						((LogicalExpressionAndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
						setState(390);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(391);
						match(AND);
						setState(392);
						((LogicalExpressionAndContext)_localctx).right = logical_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionOrContext(new Logical_exprContext(_parentctx, _parentState));
						((LogicalExpressionOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
						setState(393);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(394);
						match(OR);
						setState(395);
						((LogicalExpressionOrContext)_localctx).right = logical_expr(5);
						}
						break;
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comparison_exprContext extends ParserRuleContext {
		public Comparison_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expr; }
	 
		public Comparison_exprContext() { }
		public void copyFrom(Comparison_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonExpressionWithOperatorContext extends Comparison_exprContext {
		public Comparison_operandContext left;
		public Comp_operatorContext op;
		public Comparison_operandContext right;
		public List<Comparison_operandContext> comparison_operand() {
			return getRuleContexts(Comparison_operandContext.class);
		}
		public Comparison_operandContext comparison_operand(int i) {
			return getRuleContext(Comparison_operandContext.class,i);
		}
		public Comp_operatorContext comp_operator() {
			return getRuleContext(Comp_operatorContext.class,0);
		}
		public ComparisonExpressionWithOperatorContext(Comparison_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterComparisonExpressionWithOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitComparisonExpressionWithOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitComparisonExpressionWithOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionParensContext extends Comparison_exprContext {
		public TerminalNode PARANBEG() { return getToken(PivotParser.PARANBEG, 0); }
		public Comparison_exprContext comparison_expr() {
			return getRuleContext(Comparison_exprContext.class,0);
		}
		public TerminalNode PARANEND() { return getToken(PivotParser.PARANEND, 0); }
		public ComparisonExpressionParensContext(Comparison_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterComparisonExpressionParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitComparisonExpressionParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitComparisonExpressionParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_exprContext comparison_expr() throws RecognitionException {
		Comparison_exprContext _localctx = new Comparison_exprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_comparison_expr);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new ComparisonExpressionWithOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				((ComparisonExpressionWithOperatorContext)_localctx).left = comparison_operand();
				setState(402);
				((ComparisonExpressionWithOperatorContext)_localctx).op = comp_operator();
				setState(403);
				((ComparisonExpressionWithOperatorContext)_localctx).right = comparison_operand();
				}
				break;
			case 2:
				_localctx = new ComparisonExpressionParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(PARANBEG);
				setState(406);
				comparison_expr();
				setState(407);
				match(PARANEND);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_operandContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(PivotParser.TIME, 0); }
		public TerminalNode DATE() { return getToken(PivotParser.DATE, 0); }
		public TerminalNode DATEnoYEAR() { return getToken(PivotParser.DATEnoYEAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Comparison_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterComparison_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitComparison_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitComparison_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_operandContext comparison_operand() throws RecognitionException {
		Comparison_operandContext _localctx = new Comparison_operandContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_comparison_operand);
		int _la;
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIME:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(TIME);
				}
				break;
			case DATE:
			case DATEnoYEAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				_la = _input.LA(1);
				if ( !(_la==DATE || _la==DATEnoYEAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SET:
			case GET:
			case NOW:
			case PARANBEG:
			case FLOAT:
			case INTEGER:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_operatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(PivotParser.GT, 0); }
		public TerminalNode GE() { return getToken(PivotParser.GE, 0); }
		public TerminalNode ST() { return getToken(PivotParser.ST, 0); }
		public TerminalNode SE() { return getToken(PivotParser.SE, 0); }
		public TerminalNode EQ() { return getToken(PivotParser.EQ, 0); }
		public TerminalNode NE() { return getToken(PivotParser.NE, 0); }
		public Comp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterComp_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitComp_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitComp_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_operatorContext comp_operator() throws RecognitionException {
		Comp_operatorContext _localctx = new Comp_operatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_comp_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << ST) | (1L << SE) | (1L << EQ) | (1L << NE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public Token varID;
		public LitValContext litVal() {
			return getRuleContext(LitValContext.class,0);
		}
		public TerminalNode ID() { return getToken(PivotParser.ID, 0); }
		public TerminalNode NOW() { return getToken(PivotParser.NOW, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_atom);
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				litVal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				((AtomContext)_localctx).varID = match(ID);
				}
				break;
			case NOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				match(NOW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode STRINGKW() { return getToken(PivotParser.STRINGKW, 0); }
		public TerminalNode INTEGERKW() { return getToken(PivotParser.INTEGERKW, 0); }
		public TerminalNode FLOATKW() { return getToken(PivotParser.FLOATKW, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PivotListener ) ((PivotListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PivotVisitor ) return ((PivotVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRINGKW) | (1L << INTEGERKW) | (1L << FLOATKW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 34:
			return logical_expr_sempred((Logical_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean logical_expr_sempred(Logical_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u01ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\7\3^\n\3\f\3\16\3a\13\3\3\3\5\3d\n"+
		"\3\3\3\3\3\7\3h\n\3\f\3\16\3k\13\3\3\4\3\4\3\4\5\4p\n\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\5\5y\n\5\3\6\3\6\3\6\7\6~\n\6\f\6\16\6\u0081\13\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u008d\n\t\3\n\3\n\5\n\u0091\n\n"+
		"\3\13\3\13\3\13\5\13\u0096\n\13\3\13\3\13\5\13\u009a\n\13\3\13\5\13\u009d"+
		"\n\13\3\13\3\13\5\13\u00a1\n\13\5\13\u00a3\n\13\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00aa\n\f\f\f\16\f\u00ad\13\f\3\r\3\r\3\r\3\r\3\r\7\r\u00b4\n\r\f\r"+
		"\16\r\u00b7\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\5\20\u00c6\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\7\21\u00d1\n\21\f\21\16\21\u00d4\13\21\5\21\u00d6\n\21\3\22\3\22\3\22"+
		"\3\23\3\23\5\23\u00dd\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00e8\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f3"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0101\n\25\3\25\3\25\5\25\u0105\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0117\n\30\f\30"+
		"\16\30\u011a\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5"+
		"\31\u0126\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0134\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0147\n\35\3\35\3\35\3\35\5\35"+
		"\u014c\n\35\3\36\5\36\u014f\n\36\3\36\3\36\7\36\u0153\n\36\f\36\16\36"+
		"\u0156\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\5!\u0163\n!"+
		"\3!\3!\3\"\3\"\3\"\5\"\u016a\n\"\3#\3#\3#\3#\3#\3#\3#\5#\u0173\n#\3#\3"+
		"#\3#\3#\3#\3#\7#\u017b\n#\f#\16#\u017e\13#\3$\3$\3$\3$\3$\3$\3$\5$\u0187"+
		"\n$\3$\3$\3$\3$\3$\3$\7$\u018f\n$\f$\16$\u0192\13$\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\5%\u019c\n%\3&\3&\3&\5&\u01a1\n&\3\'\3\'\3(\3(\3(\5(\u01a8\n(\3)"+
		"\3)\3)\2\4DF*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNP\2\t\3\2\33!\3\2\678\3\2\65\66\3\2\16\17\3\2?@\3\2\b\r"+
		"\3\2#%\2\u01be\2R\3\2\2\2\4X\3\2\2\2\6l\3\2\2\2\bs\3\2\2\2\nz\3\2\2\2"+
		"\f\u0082\3\2\2\2\16\u0086\3\2\2\2\20\u008c\3\2\2\2\22\u0090\3\2\2\2\24"+
		"\u0092\3\2\2\2\26\u00a4\3\2\2\2\30\u00ae\3\2\2\2\32\u00b8\3\2\2\2\34\u00be"+
		"\3\2\2\2\36\u00c5\3\2\2\2 \u00d5\3\2\2\2\"\u00d7\3\2\2\2$\u00dc\3\2\2"+
		"\2&\u00f2\3\2\2\2(\u0104\3\2\2\2*\u0106\3\2\2\2,\u0108\3\2\2\2.\u0118"+
		"\3\2\2\2\60\u0125\3\2\2\2\62\u0127\3\2\2\2\64\u012c\3\2\2\2\66\u0135\3"+
		"\2\2\28\u014b\3\2\2\2:\u014e\3\2\2\2<\u0157\3\2\2\2>\u015d\3\2\2\2@\u0160"+
		"\3\2\2\2B\u0169\3\2\2\2D\u0172\3\2\2\2F\u0186\3\2\2\2H\u019b\3\2\2\2J"+
		"\u01a0\3\2\2\2L\u01a2\3\2\2\2N\u01a7\3\2\2\2P\u01a9\3\2\2\2RS\5\4\3\2"+
		"ST\7\2\2\3T\3\3\2\2\2UW\5\6\4\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2"+
		"\2Y_\3\2\2\2ZX\3\2\2\2[^\5<\37\2\\^\5\32\16\2][\3\2\2\2]\\\3\2\2\2^a\3"+
		"\2\2\2_]\3\2\2\2_`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bd\5\34\17\2cb\3\2\2\2c"+
		"d\3\2\2\2di\3\2\2\2eh\5\36\20\2fh\5$\23\2ge\3\2\2\2gf\3\2\2\2hk\3\2\2"+
		"\2ig\3\2\2\2ij\3\2\2\2j\5\3\2\2\2ki\3\2\2\2lo\7\24\2\2mp\5\b\5\2np\5\24"+
		"\13\2om\3\2\2\2on\3\2\2\2pq\3\2\2\2qr\7:\2\2r\7\3\2\2\2st\7\20\2\2tu\7"+
		"E\2\2ux\7=\2\2vy\5\16\b\2wy\5\n\6\2xv\3\2\2\2xw\3\2\2\2y\t\3\2\2\2z\177"+
		"\5\f\7\2{|\7;\2\2|~\5\f\7\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\13\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7E\2\2\u0083"+
		"\u0084\7\64\2\2\u0084\u0085\5B\"\2\u0085\r\3\2\2\2\u0086\u0087\5\20\t"+
		"\2\u0087\u0088\79\2\2\u0088\u0089\5\22\n\2\u0089\17\3\2\2\2\u008a\u008d"+
		"\7C\2\2\u008b\u008d\7A\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\21\3\2\2\2\u008e\u0091\7C\2\2\u008f\u0091\7A\2\2\u0090\u008e\3\2\2\2"+
		"\u0090\u008f\3\2\2\2\u0091\23\3\2\2\2\u0092\u0093\7\23\2\2\u0093\u00a2"+
		"\7E\2\2\u0094\u0096\5\26\f\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0098\7>\2\2\u0098\u009a\5\30\r\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u00a3\3\2\2\2\u009b\u009d\5\30\r\2\u009c"+
		"\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009f\7>"+
		"\2\2\u009f\u00a1\5\26\f\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u0095\3\2\2\2\u00a2\u009c\3\2\2\2\u00a3\25\3\2\2"+
		"\2\u00a4\u00a5\7\21\2\2\u00a5\u00a6\7=\2\2\u00a6\u00ab\7E\2\2\u00a7\u00a8"+
		"\7;\2\2\u00a8\u00aa\7E\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\27\3\2\2\2\u00ad\u00ab\3\2\2"+
		"\2\u00ae\u00af\7\22\2\2\u00af\u00b0\7=\2\2\u00b0\u00b5\7E\2\2\u00b1\u00b2"+
		"\7;\2\2\u00b2\u00b4\7E\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\31\3\2\2\2\u00b7\u00b5\3\2\2"+
		"\2\u00b8\u00b9\7E\2\2\u00b9\u00ba\7E\2\2\u00ba\u00bb\7\64\2\2\u00bb\u00bc"+
		"\7D\2\2\u00bc\u00bd\7:\2\2\u00bd\33\3\2\2\2\u00be\u00bf\7\27\2\2\u00bf"+
		"\u00c0\7\60\2\2\u00c0\u00c1\7\61\2\2\u00c1\u00c2\5,\27\2\u00c2\35\3\2"+
		"\2\2\u00c3\u00c6\5P)\2\u00c4\u00c6\7\30\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7E\2\2\u00c8\u00c9\7\60"+
		"\2\2\u00c9\u00ca\5 \21\2\u00ca\u00cb\7\61\2\2\u00cb\u00cc\5,\27\2\u00cc"+
		"\37\3\2\2\2\u00cd\u00d2\5\"\22\2\u00ce\u00cf\7;\2\2\u00cf\u00d1\5\"\22"+
		"\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00cd\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6!\3\2\2\2\u00d7\u00d8\5P)\2\u00d8\u00d9\7E\2\2\u00d9"+
		"#\3\2\2\2\u00da\u00dd\5&\24\2\u00db\u00dd\5(\25\2\u00dc\u00da\3\2\2\2"+
		"\u00dc\u00db\3\2\2\2\u00dd%\3\2\2\2\u00de\u00df\7\31\2\2\u00df\u00e0\7"+
		"E\2\2\u00e0\u00e1\7E\2\2\u00e1\u00e7\7=\2\2\u00e2\u00e8\7E\2\2\u00e3\u00e4"+
		"\7(\2\2\u00e4\u00e8\7C\2\2\u00e5\u00e6\7)\2\2\u00e6\u00e8\7C\2\2\u00e7"+
		"\u00e2\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00f3\5,\27\2\u00ea\u00eb\7\31\2\2\u00eb\u00ec\7?\2\2\u00ec"+
		"\u00ed\7.\2\2\u00ed\u00ee\7B\2\2\u00ee\u00f3\5,\27\2\u00ef\u00f0\7\31"+
		"\2\2\u00f0\u00f1\7B\2\2\u00f1\u00f3\5,\27\2\u00f2\u00de\3\2\2\2\u00f2"+
		"\u00ea\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f3\'\3\2\2\2\u00f4\u00f5\7\32\2"+
		"\2\u00f5\u00f6\7C\2\2\u00f6\u00f7\5*\26\2\u00f7\u00f8\5,\27\2\u00f8\u0105"+
		"\3\2\2\2\u00f9\u00fa\7\32\2\2\u00fa\u00fb\7C\2\2\u00fb\u00fc\5*\26\2\u00fc"+
		"\u00fd\7.\2\2\u00fd\u0100\7B\2\2\u00fe\u00ff\7/\2\2\u00ff\u0101\7?\2\2"+
		"\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103"+
		"\5,\27\2\u0103\u0105\3\2\2\2\u0104\u00f4\3\2\2\2\u0104\u00f9\3\2\2\2\u0105"+
		")\3\2\2\2\u0106\u0107\t\2\2\2\u0107+\3\2\2\2\u0108\u0109\7\62\2\2\u0109"+
		"\u010a\5.\30\2\u010a\u010b\7\63\2\2\u010b-\3\2\2\2\u010c\u0117\5\60\31"+
		"\2\u010d\u0117\5\62\32\2\u010e\u0117\5\64\33\2\u010f\u0117\5\66\34\2\u0110"+
		"\u0111\58\35\2\u0111\u0112\7:\2\2\u0112\u0117\3\2\2\2\u0113\u0117\5<\37"+
		"\2\u0114\u0117\5> \2\u0115\u0117\5@!\2\u0116\u010c\3\2\2\2\u0116\u010d"+
		"\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u010f\3\2\2\2\u0116\u0110\3\2\2\2\u0116"+
		"\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119/\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011b\u011c\7\"\2\2\u011c\u011d\7C\2\2\u011d\u011e\5*\26\2\u011e"+
		"\u011f\7:\2\2\u011f\u0126\3\2\2\2\u0120\u0121\7\"\2\2\u0121\u0122\7E\2"+
		"\2\u0122\u0123\5*\26\2\u0123\u0124\7:\2\2\u0124\u0126\3\2\2\2\u0125\u011b"+
		"\3\2\2\2\u0125\u0120\3\2\2\2\u0126\61\3\2\2\2\u0127\u0128\7E\2\2\u0128"+
		"\u0129\7\64\2\2\u0129\u012a\5D#\2\u012a\u012b\7:\2\2\u012b\63\3\2\2\2"+
		"\u012c\u012d\7\25\2\2\u012d\u012e\7\60\2\2\u012e\u012f\5F$\2\u012f\u0130"+
		"\7\61\2\2\u0130\u0133\5,\27\2\u0131\u0132\7+\2\2\u0132\u0134\5,\27\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\65\3\2\2\2\u0135\u0136\7\26\2"+
		"\2\u0136\u0137\7\60\2\2\u0137\u0138\5F$\2\u0138\u0139\7\61\2\2\u0139\u013a"+
		"\5,\27\2\u013a\67\3\2\2\2\u013b\u013c\7E\2\2\u013c\u013d\7\60\2\2\u013d"+
		"\u013e\5:\36\2\u013e\u013f\7\61\2\2\u013f\u014c\3\2\2\2\u0140\u0141\7"+
		"&\2\2\u0141\u0142\7E\2\2\u0142\u0143\7E\2\2\u0143\u0146\7=\2\2\u0144\u0147"+
		"\7E\2\2\u0145\u0147\5B\"\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u014c\3\2\2\2\u0148\u0149\7\'\2\2\u0149\u014a\7E\2\2\u014a\u014c\7E\2"+
		"\2\u014b\u013b\3\2\2\2\u014b\u0140\3\2\2\2\u014b\u0148\3\2\2\2\u014c9"+
		"\3\2\2\2\u014d\u014f\5D#\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0154\3\2\2\2\u0150\u0151\7;\2\2\u0151\u0153\5D#\2\u0152\u0150\3\2\2"+
		"\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155;"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\5P)\2\u0158\u0159\7E\2\2\u0159"+
		"\u015a\7\64\2\2\u015a\u015b\5D#\2\u015b\u015c\7:\2\2\u015c=\3\2\2\2\u015d"+
		"\u015e\7-\2\2\u015e\u015f\7:\2\2\u015f?\3\2\2\2\u0160\u0162\7,\2\2\u0161"+
		"\u0163\5D#\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2"+
		"\2\u0164\u0165\7:\2\2\u0165A\3\2\2\2\u0166\u016a\7C\2\2\u0167\u016a\7"+
		"A\2\2\u0168\u016a\7D\2\2\u0169\u0166\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u0168\3\2\2\2\u016aC\3\2\2\2\u016b\u016c\b#\1\2\u016c\u016d\7\60\2\2"+
		"\u016d\u016e\5D#\2\u016e\u016f\7\61\2\2\u016f\u0173\3\2\2\2\u0170\u0173"+
		"\5N(\2\u0171\u0173\58\35\2\u0172\u016b\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0171\3\2\2\2\u0173\u017c\3\2\2\2\u0174\u0175\f\7\2\2\u0175\u0176\t\3"+
		"\2\2\u0176\u017b\5D#\b\u0177\u0178\f\6\2\2\u0178\u0179\t\4\2\2\u0179\u017b"+
		"\5D#\7\u017a\u0174\3\2\2\2\u017a\u0177\3\2\2\2\u017b\u017e\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017dE\3\2\2\2\u017e\u017c\3\2\2\2"+
		"\u017f\u0180\b$\1\2\u0180\u0187\5H%\2\u0181\u0182\7\60\2\2\u0182\u0183"+
		"\5F$\2\u0183\u0184\7\61\2\2\u0184\u0187\3\2\2\2\u0185\u0187\t\5\2\2\u0186"+
		"\u017f\3\2\2\2\u0186\u0181\3\2\2\2\u0186\u0185\3\2\2\2\u0187\u0190\3\2"+
		"\2\2\u0188\u0189\f\7\2\2\u0189\u018a\7\6\2\2\u018a\u018f\5F$\b\u018b\u018c"+
		"\f\6\2\2\u018c\u018d\7\7\2\2\u018d\u018f\5F$\7\u018e\u0188\3\2\2\2\u018e"+
		"\u018b\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191G\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\5J&\2\u0194\u0195"+
		"\5L\'\2\u0195\u0196\5J&\2\u0196\u019c\3\2\2\2\u0197\u0198\7\60\2\2\u0198"+
		"\u0199\5H%\2\u0199\u019a\7\61\2\2\u019a\u019c\3\2\2\2\u019b\u0193\3\2"+
		"\2\2\u019b\u0197\3\2\2\2\u019cI\3\2\2\2\u019d\u01a1\7B\2\2\u019e\u01a1"+
		"\t\6\2\2\u019f\u01a1\5D#\2\u01a0\u019d\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0"+
		"\u019f\3\2\2\2\u01a1K\3\2\2\2\u01a2\u01a3\t\7\2\2\u01a3M\3\2\2\2\u01a4"+
		"\u01a8\5B\"\2\u01a5\u01a8\7E\2\2\u01a6\u01a8\7*\2\2\u01a7\u01a4\3\2\2"+
		"\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8O\3\2\2\2\u01a9\u01aa"+
		"\t\b\2\2\u01aaQ\3\2\2\2/X]_cgiox\177\u008c\u0090\u0095\u0099\u009c\u00a0"+
		"\u00a2\u00ab\u00b5\u00c5\u00d2\u00d5\u00dc\u00e7\u00f2\u0100\u0104\u0116"+
		"\u0118\u0125\u0133\u0146\u014b\u014e\u0154\u0162\u0169\u0172\u017a\u017c"+
		"\u0186\u018e\u0190\u019b\u01a0\u01a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}