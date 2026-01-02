// Generated from C:/Users/Abrahem Ali/IdeaProjects/compiler_project/html_parser/grammars/HTMLParser.g4 by ANTLR 4.13.2
package html;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LT=1, GT=2, SLASH=3, DIV=4, P=5, H1=6, SPAN=7, WS=8;
	public static final int
		RULE_document = 0, RULE_element = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "element"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'/'", "'div'", "'p'", "'h1'", "'span'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LT", "GT", "SLASH", "DIV", "P", "H1", "SPAN", "WS"
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
	public String getGrammarFileName() { return "HTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HTMLParser.EOF, 0); }
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			element();
			setState(5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpanElementContext extends ElementContext {
		public ElementContext element;
		public List<ElementContext> children = new ArrayList<ElementContext>();
		public List<TerminalNode> LT() { return getTokens(HTMLParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(HTMLParser.LT, i);
		}
		public List<TerminalNode> SPAN() { return getTokens(HTMLParser.SPAN); }
		public TerminalNode SPAN(int i) {
			return getToken(HTMLParser.SPAN, i);
		}
		public List<TerminalNode> GT() { return getTokens(HTMLParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(HTMLParser.GT, i);
		}
		public TerminalNode SLASH() { return getToken(HTMLParser.SLASH, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public SpanElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSpanElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSpanElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSpanElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivElementContext extends ElementContext {
		public ElementContext element;
		public List<ElementContext> children = new ArrayList<ElementContext>();
		public List<TerminalNode> LT() { return getTokens(HTMLParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(HTMLParser.LT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(HTMLParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(HTMLParser.DIV, i);
		}
		public List<TerminalNode> GT() { return getTokens(HTMLParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(HTMLParser.GT, i);
		}
		public TerminalNode SLASH() { return getToken(HTMLParser.SLASH, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public DivElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDivElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDivElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDivElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PElementContext extends ElementContext {
		public ElementContext element;
		public List<ElementContext> children = new ArrayList<ElementContext>();
		public List<TerminalNode> LT() { return getTokens(HTMLParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(HTMLParser.LT, i);
		}
		public List<TerminalNode> P() { return getTokens(HTMLParser.P); }
		public TerminalNode P(int i) {
			return getToken(HTMLParser.P, i);
		}
		public List<TerminalNode> GT() { return getTokens(HTMLParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(HTMLParser.GT, i);
		}
		public TerminalNode SLASH() { return getToken(HTMLParser.SLASH, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public PElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class H1ElementContext extends ElementContext {
		public ElementContext element;
		public List<ElementContext> children = new ArrayList<ElementContext>();
		public List<TerminalNode> LT() { return getTokens(HTMLParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(HTMLParser.LT, i);
		}
		public List<TerminalNode> H1() { return getTokens(HTMLParser.H1); }
		public TerminalNode H1(int i) {
			return getToken(HTMLParser.H1, i);
		}
		public List<TerminalNode> GT() { return getTokens(HTMLParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(HTMLParser.GT, i);
		}
		public TerminalNode SLASH() { return getToken(HTMLParser.SLASH, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public H1ElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterH1Element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitH1Element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitH1Element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			int _alt;
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DivElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				match(LT);
				setState(8);
				match(DIV);
				setState(9);
				match(GT);
				setState(13);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(10);
						((DivElementContext)_localctx).element = element();
						((DivElementContext)_localctx).children.add(((DivElementContext)_localctx).element);
						}
						} 
					}
					setState(15);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(16);
				match(LT);
				setState(17);
				match(SLASH);
				setState(18);
				match(DIV);
				setState(19);
				match(GT);
				}
				break;
			case 2:
				_localctx = new SpanElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(LT);
				setState(21);
				match(SPAN);
				setState(22);
				match(GT);
				setState(26);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(23);
						((SpanElementContext)_localctx).element = element();
						((SpanElementContext)_localctx).children.add(((SpanElementContext)_localctx).element);
						}
						} 
					}
					setState(28);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(29);
				match(LT);
				setState(30);
				match(SLASH);
				setState(31);
				match(SPAN);
				setState(32);
				match(GT);
				}
				break;
			case 3:
				_localctx = new H1ElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(LT);
				setState(34);
				match(H1);
				setState(35);
				match(GT);
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(36);
						((H1ElementContext)_localctx).element = element();
						((H1ElementContext)_localctx).children.add(((H1ElementContext)_localctx).element);
						}
						} 
					}
					setState(41);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(42);
				match(LT);
				setState(43);
				match(SLASH);
				setState(44);
				match(H1);
				setState(45);
				match(GT);
				}
				break;
			case 4:
				_localctx = new PElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(LT);
				setState(47);
				match(P);
				setState(48);
				match(GT);
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(49);
						((PElementContext)_localctx).element = element();
						((PElementContext)_localctx).children.add(((PElementContext)_localctx).element);
						}
						} 
					}
					setState(54);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(55);
				match(LT);
				setState(56);
				match(SLASH);
				setState(57);
				match(P);
				setState(58);
				match(GT);
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

	public static final String _serializedATN =
		"\u0004\u0001\b>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\f\b\u0001\n\u0001\f\u0001\u000f\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u0019\b\u0001\n\u0001\f\u0001\u001c\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u00013\b\u0001\n\u0001\f\u00016\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001"+
		"\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000B\u0000\u0004\u0001\u0000"+
		"\u0000\u0000\u0002;\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001"+
		"\u0000\u0005\u0006\u0005\u0000\u0000\u0001\u0006\u0001\u0001\u0000\u0000"+
		"\u0000\u0007\b\u0005\u0001\u0000\u0000\b\t\u0005\u0004\u0000\u0000\t\r"+
		"\u0005\u0002\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000"+
		"\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000"+
		"\u000f\r\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0001\u0000\u0000\u0011"+
		"\u0012\u0005\u0003\u0000\u0000\u0012\u0013\u0005\u0004\u0000\u0000\u0013"+
		"<\u0005\u0002\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0016"+
		"\u0005\u0007\u0000\u0000\u0016\u001a\u0005\u0002\u0000\u0000\u0017\u0019"+
		"\u0003\u0002\u0001\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001c"+
		"\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0001\u0000\u0000\u0000\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u001a"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e\u001f"+
		"\u0005\u0003\u0000\u0000\u001f \u0005\u0007\u0000\u0000 <\u0005\u0002"+
		"\u0000\u0000!\"\u0005\u0001\u0000\u0000\"#\u0005\u0006\u0000\u0000#\'"+
		"\u0005\u0002\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001\u0000\u0000"+
		"\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005"+
		"\u0001\u0000\u0000+,\u0005\u0003\u0000\u0000,-\u0005\u0006\u0000\u0000"+
		"-<\u0005\u0002\u0000\u0000./\u0005\u0001\u0000\u0000/0\u0005\u0005\u0000"+
		"\u000004\u0005\u0002\u0000\u000013\u0003\u0002\u0001\u000021\u0001\u0000"+
		"\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u0000"+
		"78\u0005\u0001\u0000\u000089\u0005\u0003\u0000\u00009:\u0005\u0005\u0000"+
		"\u0000:<\u0005\u0002\u0000\u0000;\u0007\u0001\u0000\u0000\u0000;\u0014"+
		"\u0001\u0000\u0000\u0000;!\u0001\u0000\u0000\u0000;.\u0001\u0000\u0000"+
		"\u0000<\u0003\u0001\u0000\u0000\u0000\u0005\r\u001a\'4;";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}