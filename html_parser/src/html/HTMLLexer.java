// Generated from C:/Users/Abrahem Ali/IdeaProjects/compiler_project/html_parser/grammars/HTMLLexer.g4 by ANTLR 4.13.2
package html;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_DIV=1, OPEN_P=2, OPEN_H1=3, OPEN_SPAN=4, OPEN_IMG=5, CLOSE_DIV=6, 
		CLOSE_P=7, CLOSE_H1=8, CLOSE_SPAN=9, TEXT=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPEN_DIV", "OPEN_P", "OPEN_H1", "OPEN_SPAN", "OPEN_IMG", "CLOSE_DIV", 
			"CLOSE_P", "CLOSE_H1", "CLOSE_SPAN", "TEXT", "WS"
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


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

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
		"\u0004\u0000\u000bY\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004\tO\b\t\u000b\t\f\tP\u0001\n\u0004"+
		"\nT\b\n\u000b\n\f\nU\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0001\u0000\u0002\u0004\u0000\n\n\r\r<<>>\u0003"+
		"\u0000\t\n\r\r  Z\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000"+
		"\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000"+
		"\u0007&\u0001\u0000\u0000\u0000\t-\u0001\u0000\u0000\u0000\u000b3\u0001"+
		"\u0000\u0000\u0000\r:\u0001\u0000\u0000\u0000\u000f?\u0001\u0000\u0000"+
		"\u0000\u0011E\u0001\u0000\u0000\u0000\u0013N\u0001\u0000\u0000\u0000\u0015"+
		"S\u0001\u0000\u0000\u0000\u0017\u0018\u0005<\u0000\u0000\u0018\u0019\u0005"+
		"d\u0000\u0000\u0019\u001a\u0005i\u0000\u0000\u001a\u001b\u0005v\u0000"+
		"\u0000\u001b\u001c\u0005>\u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005<\u0000\u0000\u001e\u001f\u0005p\u0000\u0000\u001f "+
		"\u0005>\u0000\u0000 \u0004\u0001\u0000\u0000\u0000!\"\u0005<\u0000\u0000"+
		"\"#\u0005h\u0000\u0000#$\u00051\u0000\u0000$%\u0005>\u0000\u0000%\u0006"+
		"\u0001\u0000\u0000\u0000&\'\u0005<\u0000\u0000\'(\u0005s\u0000\u0000("+
		")\u0005p\u0000\u0000)*\u0005a\u0000\u0000*+\u0005n\u0000\u0000+,\u0005"+
		">\u0000\u0000,\b\u0001\u0000\u0000\u0000-.\u0005<\u0000\u0000./\u0005"+
		"i\u0000\u0000/0\u0005m\u0000\u000001\u0005g\u0000\u000012\u0005>\u0000"+
		"\u00002\n\u0001\u0000\u0000\u000034\u0005<\u0000\u000045\u0005/\u0000"+
		"\u000056\u0005d\u0000\u000067\u0005i\u0000\u000078\u0005v\u0000\u0000"+
		"89\u0005>\u0000\u00009\f\u0001\u0000\u0000\u0000:;\u0005<\u0000\u0000"+
		";<\u0005/\u0000\u0000<=\u0005p\u0000\u0000=>\u0005>\u0000\u0000>\u000e"+
		"\u0001\u0000\u0000\u0000?@\u0005<\u0000\u0000@A\u0005/\u0000\u0000AB\u0005"+
		"h\u0000\u0000BC\u00051\u0000\u0000CD\u0005>\u0000\u0000D\u0010\u0001\u0000"+
		"\u0000\u0000EF\u0005<\u0000\u0000FG\u0005/\u0000\u0000GH\u0005s\u0000"+
		"\u0000HI\u0005p\u0000\u0000IJ\u0005a\u0000\u0000JK\u0005n\u0000\u0000"+
		"KL\u0005>\u0000\u0000L\u0012\u0001\u0000\u0000\u0000MO\b\u0000\u0000\u0000"+
		"NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000Q\u0014\u0001\u0000\u0000\u0000RT\u0007"+
		"\u0001\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WX\u0006\n\u0000\u0000X\u0016\u0001\u0000\u0000\u0000\u0003\u0000"+
		"PU\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}