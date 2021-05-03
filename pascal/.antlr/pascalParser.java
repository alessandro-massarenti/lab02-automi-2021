// Generated from /home/alessandro/Scrivania/lab02-automi-2021/pascal/pascal.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, PLUS=20, MINUS=21, PER=22, DIV=23, MOD=24, EQ=25, 
		LT=26, LEQ=27, GT=28, GEQ=29, NEQ=30, ID=31, STRING=32, NUMBER=33, R_COMMENT=34, 
		C_COMMENT=35, LINE_COMMENT=36, WS=37, ErrorChar=38;
	public static final int
		RULE_start = 0, RULE_decl_list = 1, RULE_decl = 2, RULE_var = 3, RULE_main_code = 4, 
		RULE_code_block = 5, RULE_st_list = 6, RULE_statement = 7, RULE_assign = 8, 
		RULE_out = 9, RULE_in = 10, RULE_branch = 11, RULE_repeat = 12, RULE_expr = 13, 
		RULE_relation = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "decl_list", "decl", "var", "main_code", "code_block", "st_list", 
			"statement", "assign", "out", "in", "branch", "repeat", "expr", "relation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'var'", "':'", "'integer'", "','", "'begin'", 
			"'end'", "'.'", "':='", "'writeln'", "'('", "')'", "'readln'", "'if'", 
			"'then'", "'else'", "'repeat'", "'until'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "PLUS", "MINUS", "PER", 
			"DIV", "MOD", "EQ", "LT", "LEQ", "GT", "GEQ", "NEQ", "ID", "STRING", 
			"NUMBER", "R_COMMENT", "C_COMMENT", "LINE_COMMENT", "WS", "ErrorChar"
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
	public String getGrammarFileName() { return "pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Main_codeContext main_code() {
			return getRuleContext(Main_codeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(pascalParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			match(ID);
			setState(32);
			match(T__1);
			setState(33);
			match(T__2);
			setState(34);
			decl_list();
			setState(35);
			main_code();
			setState(36);
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

	public static class Decl_listContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl_list);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				decl();
				setState(40);
				decl_list();
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

	public static class DeclContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			var(0);
			setState(45);
			match(T__3);
			setState(46);
			match(T__4);
			setState(47);
			match(T__1);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		return var(0);
	}

	private VarContext var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarContext _localctx = new VarContext(_ctx, _parentState);
		VarContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_var, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(50);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_var);
					setState(52);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(53);
					match(T__5);
					setState(54);
					match(ID);
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class Main_codeContext extends ParserRuleContext {
		public St_listContext st_list() {
			return getRuleContext(St_listContext.class,0);
		}
		public Main_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_code; }
	}

	public final Main_codeContext main_code() throws RecognitionException {
		Main_codeContext _localctx = new Main_codeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_main_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__6);
			setState(61);
			st_list();
			setState(62);
			match(T__7);
			setState(63);
			match(T__8);
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

	public static class Code_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public St_listContext st_list() {
			return getRuleContext(St_listContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_code_block);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__13:
			case T__14:
			case T__17:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				statement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__6);
				setState(67);
				st_list();
				setState(68);
				match(T__7);
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

	public static class St_listContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public St_listContext st_list() {
			return getRuleContext(St_listContext.class,0);
		}
		public St_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_list; }
	}

	public final St_listContext st_list() throws RecognitionException {
		St_listContext _localctx = new St_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_st_list);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				statement();
				setState(73);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				statement();
				setState(76);
				match(T__1);
				setState(77);
				st_list();
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

	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public OutContext out() {
			return getRuleContext(OutContext.class,0);
		}
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				assign();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				branch();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				repeat();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				out();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				in();
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(89);
			match(T__9);
			setState(90);
			expr();
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

	public static class OutContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(pascalParser.STRING, 0); }
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_out);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__10);
				setState(93);
				match(T__11);
				setState(94);
				expr();
				setState(95);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__10);
				setState(98);
				match(T__11);
				setState(99);
				match(STRING);
				setState(100);
				match(T__12);
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

	public static class InContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__13);
			setState(104);
			match(T__11);
			setState(105);
			match(ID);
			setState(106);
			match(T__12);
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

	public static class BranchContext extends ParserRuleContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public List<Code_blockContext> code_block() {
			return getRuleContexts(Code_blockContext.class);
		}
		public Code_blockContext code_block(int i) {
			return getRuleContext(Code_blockContext.class,i);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_branch);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(T__14);
				setState(109);
				relation();
				setState(110);
				match(T__15);
				setState(111);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__14);
				setState(114);
				relation();
				setState(115);
				match(T__15);
				setState(116);
				code_block();
				setState(117);
				match(T__16);
				setState(118);
				code_block();
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

	public static class RepeatContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__17);
			setState(123);
			code_block();
			setState(124);
			match(T__18);
			setState(125);
			relation();
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
		public TerminalNode NUMBER() { return getToken(pascalParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(pascalParser.ID, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
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

	public static class RelationContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(pascalParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(pascalParser.LEQ, 0); }
		public TerminalNode EQ() { return getToken(pascalParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(pascalParser.NEQ, 0); }
		public TerminalNode GEQ() { return getToken(pascalParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(pascalParser.GT, 0); }
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_relation);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				expr();
				setState(130);
				match(LT);
				setState(131);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				expr();
				setState(134);
				match(LEQ);
				setState(135);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				expr();
				setState(138);
				match(EQ);
				setState(139);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				expr();
				setState(142);
				match(NEQ);
				setState(143);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				expr();
				setState(146);
				match(GEQ);
				setState(147);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				expr();
				setState(150);
				match(GT);
				setState(151);
				expr();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return var_sempred((VarContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean var_sempred(VarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u009e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\5\7I\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bR\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\5\tY\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13h\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r{\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009c\n\20\3\20\2\3\b\21\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\4\2!!##\2\u009d\2 \3\2\2\2\4,"+
		"\3\2\2\2\6.\3\2\2\2\b\63\3\2\2\2\n>\3\2\2\2\fH\3\2\2\2\16Q\3\2\2\2\20"+
		"X\3\2\2\2\22Z\3\2\2\2\24g\3\2\2\2\26i\3\2\2\2\30z\3\2\2\2\32|\3\2\2\2"+
		"\34\u0081\3\2\2\2\36\u009b\3\2\2\2 !\7\3\2\2!\"\7!\2\2\"#\7\4\2\2#$\7"+
		"\5\2\2$%\5\4\3\2%&\5\n\6\2&\'\7\2\2\3\'\3\3\2\2\2(-\5\6\4\2)*\5\6\4\2"+
		"*+\5\4\3\2+-\3\2\2\2,(\3\2\2\2,)\3\2\2\2-\5\3\2\2\2./\5\b\5\2/\60\7\6"+
		"\2\2\60\61\7\7\2\2\61\62\7\4\2\2\62\7\3\2\2\2\63\64\b\5\1\2\64\65\7!\2"+
		"\2\65;\3\2\2\2\66\67\f\3\2\2\678\7\b\2\28:\7!\2\29\66\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<\t\3\2\2\2=;\3\2\2\2>?\7\t\2\2?@\5\16\b\2@A\7\n"+
		"\2\2AB\7\13\2\2B\13\3\2\2\2CI\5\20\t\2DE\7\t\2\2EF\5\16\b\2FG\7\n\2\2"+
		"GI\3\2\2\2HC\3\2\2\2HD\3\2\2\2I\r\3\2\2\2JK\5\20\t\2KL\7\4\2\2LR\3\2\2"+
		"\2MN\5\20\t\2NO\7\4\2\2OP\5\16\b\2PR\3\2\2\2QJ\3\2\2\2QM\3\2\2\2R\17\3"+
		"\2\2\2SY\5\22\n\2TY\5\30\r\2UY\5\32\16\2VY\5\24\13\2WY\5\26\f\2XS\3\2"+
		"\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\21\3\2\2\2Z[\7!\2\2[\\\7"+
		"\f\2\2\\]\5\34\17\2]\23\3\2\2\2^_\7\r\2\2_`\7\16\2\2`a\5\34\17\2ab\7\17"+
		"\2\2bh\3\2\2\2cd\7\r\2\2de\7\16\2\2ef\7\"\2\2fh\7\17\2\2g^\3\2\2\2gc\3"+
		"\2\2\2h\25\3\2\2\2ij\7\20\2\2jk\7\16\2\2kl\7!\2\2lm\7\17\2\2m\27\3\2\2"+
		"\2no\7\21\2\2op\5\36\20\2pq\7\22\2\2qr\5\f\7\2r{\3\2\2\2st\7\21\2\2tu"+
		"\5\36\20\2uv\7\22\2\2vw\5\f\7\2wx\7\23\2\2xy\5\f\7\2y{\3\2\2\2zn\3\2\2"+
		"\2zs\3\2\2\2{\31\3\2\2\2|}\7\24\2\2}~\5\f\7\2~\177\7\25\2\2\177\u0080"+
		"\5\36\20\2\u0080\33\3\2\2\2\u0081\u0082\t\2\2\2\u0082\35\3\2\2\2\u0083"+
		"\u0084\5\34\17\2\u0084\u0085\7\34\2\2\u0085\u0086\5\34\17\2\u0086\u009c"+
		"\3\2\2\2\u0087\u0088\5\34\17\2\u0088\u0089\7\35\2\2\u0089\u008a\5\34\17"+
		"\2\u008a\u009c\3\2\2\2\u008b\u008c\5\34\17\2\u008c\u008d\7\33\2\2\u008d"+
		"\u008e\5\34\17\2\u008e\u009c\3\2\2\2\u008f\u0090\5\34\17\2\u0090\u0091"+
		"\7 \2\2\u0091\u0092\5\34\17\2\u0092\u009c\3\2\2\2\u0093\u0094\5\34\17"+
		"\2\u0094\u0095\7\37\2\2\u0095\u0096\5\34\17\2\u0096\u009c\3\2\2\2\u0097"+
		"\u0098\5\34\17\2\u0098\u0099\7\36\2\2\u0099\u009a\5\34\17\2\u009a\u009c"+
		"\3\2\2\2\u009b\u0083\3\2\2\2\u009b\u0087\3\2\2\2\u009b\u008b\3\2\2\2\u009b"+
		"\u008f\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u0097\3\2\2\2\u009c\37\3\2\2"+
		"\2\n,;HQXgz\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}