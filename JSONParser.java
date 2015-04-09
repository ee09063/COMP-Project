// Generated from JSON.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, NAME=2, OPBR=3, CLBR=4, OPSQBR=5, CLSQBR=6, COMMA=7, COLON=8, QUOTATION=9, 
		NAMELIT=10, GROUPLIT=11, NODELIT=12, LINKLIT=13, SOURCELIT=14, TARGETLIT=15, 
		VALUELIT=16, WS=17;
	public static final int
		RULE_start = 0, RULE_json = 1, RULE_nodelist = 2, RULE_linklist = 3, RULE_node = 4, 
		RULE_link = 5;
	public static final String[] ruleNames = {
		"start", "json", "nodelist", "linklist", "node", "link"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'{'", "'}'", "'['", "']'", "','", "':'", "'\"'", "'\"name\"'", 
		"'\"group\"'", "'\"nodes\"'", "'\"links\"'", "'\"source\"'", "'\"target\"'", 
		"'\"value\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "NAME", "OPBR", "CLBR", "OPSQBR", "CLSQBR", "COMMA", "COLON", 
		"QUOTATION", "NAMELIT", "GROUPLIT", "NODELIT", "LINKLIT", "SOURCELIT", 
		"TARGETLIT", "VALUELIT", "WS"
	};
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
	public String getGrammarFileName() { return "JSON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JSONParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			json();
			setState(13);
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

	public static class JsonContext extends ParserRuleContext {
		public TerminalNode OPBR() { return getToken(JSONParser.OPBR, 0); }
		public TerminalNode NODELIT() { return getToken(JSONParser.NODELIT, 0); }
		public List<TerminalNode> COLON() { return getTokens(JSONParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JSONParser.COLON, i);
		}
		public List<TerminalNode> OPSQBR() { return getTokens(JSONParser.OPSQBR); }
		public TerminalNode OPSQBR(int i) {
			return getToken(JSONParser.OPSQBR, i);
		}
		public NodelistContext nodelist() {
			return getRuleContext(NodelistContext.class,0);
		}
		public List<TerminalNode> CLSQBR() { return getTokens(JSONParser.CLSQBR); }
		public TerminalNode CLSQBR(int i) {
			return getToken(JSONParser.CLSQBR, i);
		}
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public TerminalNode LINKLIT() { return getToken(JSONParser.LINKLIT, 0); }
		public LinklistContext linklist() {
			return getRuleContext(LinklistContext.class,0);
		}
		public TerminalNode CLBR() { return getToken(JSONParser.CLBR, 0); }
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitJson(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(OPBR);
			setState(16);
			match(NODELIT);
			setState(17);
			match(COLON);
			setState(18);
			match(OPSQBR);
			setState(19);
			nodelist();
			setState(20);
			match(CLSQBR);
			setState(21);
			match(COMMA);
			setState(22);
			match(LINKLIT);
			setState(23);
			match(COLON);
			setState(24);
			match(OPSQBR);
			setState(25);
			linklist();
			setState(26);
			match(CLSQBR);
			setState(27);
			match(CLBR);
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

	public static class NodelistContext extends ParserRuleContext {
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public NodelistContext nodelist() {
			return getRuleContext(NodelistContext.class,0);
		}
		public NodelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterNodelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitNodelist(this);
		}
	}

	public final NodelistContext nodelist() throws RecognitionException {
		NodelistContext _localctx = new NodelistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nodelist);
		try {
			setState(34);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				node();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				node();
				setState(31);
				match(COMMA);
				setState(32);
				nodelist();
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

	public static class LinklistContext extends ParserRuleContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public LinklistContext linklist() {
			return getRuleContext(LinklistContext.class,0);
		}
		public LinklistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linklist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterLinklist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitLinklist(this);
		}
	}

	public final LinklistContext linklist() throws RecognitionException {
		LinklistContext _localctx = new LinklistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_linklist);
		try {
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				link();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				link();
				setState(38);
				match(COMMA);
				setState(39);
				linklist();
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

	public static class NodeContext extends ParserRuleContext {
		public TerminalNode OPBR() { return getToken(JSONParser.OPBR, 0); }
		public TerminalNode NAMELIT() { return getToken(JSONParser.NAMELIT, 0); }
		public List<TerminalNode> COLON() { return getTokens(JSONParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JSONParser.COLON, i);
		}
		public List<TerminalNode> QUOTATION() { return getTokens(JSONParser.QUOTATION); }
		public TerminalNode QUOTATION(int i) {
			return getToken(JSONParser.QUOTATION, i);
		}
		public TerminalNode NAME() { return getToken(JSONParser.NAME, 0); }
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public TerminalNode GROUPLIT() { return getToken(JSONParser.GROUPLIT, 0); }
		public TerminalNode INT() { return getToken(JSONParser.INT, 0); }
		public TerminalNode CLBR() { return getToken(JSONParser.CLBR, 0); }
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitNode(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(OPBR);
			setState(44);
			match(NAMELIT);
			setState(45);
			match(COLON);
			setState(46);
			match(QUOTATION);
			setState(47);
			match(NAME);
			setState(48);
			match(QUOTATION);
			setState(49);
			match(COMMA);
			setState(50);
			match(GROUPLIT);
			setState(51);
			match(COLON);
			setState(52);
			match(INT);
			setState(53);
			match(CLBR);
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

	public static class LinkContext extends ParserRuleContext {
		public TerminalNode OPBR() { return getToken(JSONParser.OPBR, 0); }
		public TerminalNode SOURCELIT() { return getToken(JSONParser.SOURCELIT, 0); }
		public List<TerminalNode> COLON() { return getTokens(JSONParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JSONParser.COLON, i);
		}
		public List<TerminalNode> INT() { return getTokens(JSONParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(JSONParser.INT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSONParser.COMMA, i);
		}
		public TerminalNode TARGETLIT() { return getToken(JSONParser.TARGETLIT, 0); }
		public TerminalNode VALUELIT() { return getToken(JSONParser.VALUELIT, 0); }
		public TerminalNode CLBR() { return getToken(JSONParser.CLBR, 0); }
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitLink(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(OPBR);
			setState(56);
			match(SOURCELIT);
			setState(57);
			match(COLON);
			setState(58);
			match(INT);
			setState(59);
			match(COMMA);
			setState(60);
			match(TARGETLIT);
			setState(61);
			match(COLON);
			setState(62);
			match(INT);
			setState(63);
			match(COMMA);
			setState(64);
			match(VALUELIT);
			setState(65);
			match(COLON);
			setState(66);
			match(INT);
			setState(67);
			match(CLBR);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23H\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4%\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\5\5,\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4"+
		"\6\b\n\f\2\2C\2\16\3\2\2\2\4\21\3\2\2\2\6$\3\2\2\2\b+\3\2\2\2\n-\3\2\2"+
		"\2\f9\3\2\2\2\16\17\5\4\3\2\17\20\7\2\2\3\20\3\3\2\2\2\21\22\7\5\2\2\22"+
		"\23\7\16\2\2\23\24\7\n\2\2\24\25\7\7\2\2\25\26\5\6\4\2\26\27\7\b\2\2\27"+
		"\30\7\t\2\2\30\31\7\17\2\2\31\32\7\n\2\2\32\33\7\7\2\2\33\34\5\b\5\2\34"+
		"\35\7\b\2\2\35\36\7\6\2\2\36\5\3\2\2\2\37%\5\n\6\2 !\5\n\6\2!\"\7\t\2"+
		"\2\"#\5\6\4\2#%\3\2\2\2$\37\3\2\2\2$ \3\2\2\2%\7\3\2\2\2&,\5\f\7\2\'("+
		"\5\f\7\2()\7\t\2\2)*\5\b\5\2*,\3\2\2\2+&\3\2\2\2+\'\3\2\2\2,\t\3\2\2\2"+
		"-.\7\5\2\2./\7\f\2\2/\60\7\n\2\2\60\61\7\13\2\2\61\62\7\4\2\2\62\63\7"+
		"\13\2\2\63\64\7\t\2\2\64\65\7\r\2\2\65\66\7\n\2\2\66\67\7\3\2\2\678\7"+
		"\6\2\28\13\3\2\2\29:\7\5\2\2:;\7\20\2\2;<\7\n\2\2<=\7\3\2\2=>\7\t\2\2"+
		">?\7\21\2\2?@\7\n\2\2@A\7\3\2\2AB\7\t\2\2BC\7\22\2\2CD\7\n\2\2DE\7\3\2"+
		"\2EF\7\6\2\2F\r\3\2\2\2\4$+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}