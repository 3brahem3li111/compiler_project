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
		OPEN_DIV=1, OPEN_P=2, OPEN_H1=3, OPEN_SPAN=4, OPEN_IMG=5, CLOSE_DIV=6, 
		CLOSE_P=7, CLOSE_H1=8, CLOSE_SPAN=9, TEXT=10, WS=11;
	public static final int
		RULE_document = 0, RULE_element = 1, RULE_content = 2, RULE_item = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "element", "content", "item"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<div>'", "'<p>'", "'<h1>'", "'<span>'", "'<img>'", "'</div>'", 
			"'</p>'", "'</h1>'", "'</span>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_DIV", "OPEN_P", "OPEN_H1", "OPEN_SPAN", "OPEN_IMG", "CLOSE_DIV", 
			"CLOSE_P", "CLOSE_H1", "CLOSE_SPAN", "TEXT", "WS"
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
			setState(8);
			element();
			setState(9);
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
		public TerminalNode OPEN_SPAN() { return getToken(HTMLParser.OPEN_SPAN, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode CLOSE_SPAN() { return getToken(HTMLParser.CLOSE_SPAN, 0); }
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
	public static class ImgElementContext extends ElementContext {
		public TerminalNode OPEN_IMG() { return getToken(HTMLParser.OPEN_IMG, 0); }
		public ImgElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterImgElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitImgElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitImgElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivElementContext extends ElementContext {
		public TerminalNode OPEN_DIV() { return getToken(HTMLParser.OPEN_DIV, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode CLOSE_DIV() { return getToken(HTMLParser.CLOSE_DIV, 0); }
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
		public TerminalNode OPEN_P() { return getToken(HTMLParser.OPEN_P, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode CLOSE_P() { return getToken(HTMLParser.CLOSE_P, 0); }
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
		public TerminalNode OPEN_H1() { return getToken(HTMLParser.OPEN_H1, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode CLOSE_H1() { return getToken(HTMLParser.CLOSE_H1, 0); }
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
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_DIV:
				_localctx = new DivElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(OPEN_DIV);
				setState(12);
				content();
				setState(13);
				match(CLOSE_DIV);
				}
				break;
			case OPEN_P:
				_localctx = new PElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(OPEN_P);
				setState(16);
				content();
				setState(17);
				match(CLOSE_P);
				}
				break;
			case OPEN_H1:
				_localctx = new H1ElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
				match(OPEN_H1);
				setState(20);
				content();
				setState(21);
				match(CLOSE_H1);
				}
				break;
			case OPEN_SPAN:
				_localctx = new SpanElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				match(OPEN_SPAN);
				setState(24);
				content();
				setState(25);
				match(CLOSE_SPAN);
				}
				break;
			case OPEN_IMG:
				_localctx = new ImgElementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				match(OPEN_IMG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1086L) != 0)) {
				{
				{
				setState(30);
				item();
				}
				}
				setState(35);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ItemContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(HTMLParser.TEXT, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_item);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_DIV:
			case OPEN_P:
			case OPEN_H1:
			case OPEN_SPAN:
			case OPEN_IMG:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				element();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(TEXT);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000b)\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001d\b\u0001\u0001\u0002\u0005\u0002 \b\u0002\n\u0002\f\u0002"+
		"#\t\u0002\u0001\u0003\u0001\u0003\u0003\u0003\'\b\u0003\u0001\u0003\u0000"+
		"\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0000*\u0000\b\u0001\u0000"+
		"\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000"+
		"\u0000\u0006&\u0001\u0000\u0000\u0000\b\t\u0003\u0002\u0001\u0000\t\n"+
		"\u0005\u0000\u0000\u0001\n\u0001\u0001\u0000\u0000\u0000\u000b\f\u0005"+
		"\u0001\u0000\u0000\f\r\u0003\u0004\u0002\u0000\r\u000e\u0005\u0006\u0000"+
		"\u0000\u000e\u001d\u0001\u0000\u0000\u0000\u000f\u0010\u0005\u0002\u0000"+
		"\u0000\u0010\u0011\u0003\u0004\u0002\u0000\u0011\u0012\u0005\u0007\u0000"+
		"\u0000\u0012\u001d\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0003\u0000"+
		"\u0000\u0014\u0015\u0003\u0004\u0002\u0000\u0015\u0016\u0005\b\u0000\u0000"+
		"\u0016\u001d\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0004\u0000\u0000"+
		"\u0018\u0019\u0003\u0004\u0002\u0000\u0019\u001a\u0005\t\u0000\u0000\u001a"+
		"\u001d\u0001\u0000\u0000\u0000\u001b\u001d\u0005\u0005\u0000\u0000\u001c"+
		"\u000b\u0001\u0000\u0000\u0000\u001c\u000f\u0001\u0000\u0000\u0000\u001c"+
		"\u0013\u0001\u0000\u0000\u0000\u001c\u0017\u0001\u0000\u0000\u0000\u001c"+
		"\u001b\u0001\u0000\u0000\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e"+
		" \u0003\u0006\u0003\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"\u0005\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$\'\u0003"+
		"\u0002\u0001\u0000%\'\u0005\n\u0000\u0000&$\u0001\u0000\u0000\u0000&%"+
		"\u0001\u0000\u0000\u0000\'\u0007\u0001\u0000\u0000\u0000\u0003\u001c!"+
		"&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}