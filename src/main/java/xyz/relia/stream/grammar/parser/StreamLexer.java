// Generated from /Users/bytedance/Projects/Java/Stream/src/main/java/xyz/relia/stream/antlr/Stream.g4 by ANTLR 4.9.2

    package xyz.relia.stream.grammar.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StreamLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, ID=8, STRING=9, 
		NUMBER=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "WS", "ID", "STRING", 
			"ESC", "UNICODE", "HEX", "SAFECODEPOINT", "CHAR", "UNDERLINE", "NUMBER", 
			"INT", "EXP", "DIGIT", "DIGIT_P"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'->'", "'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "WS", "ID", "STRING", "NUMBER"
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


	public StreamLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Stream.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u008b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\6\b:\n\b\r\b\16\b;\3\b\3\b\3\t\3\t\5\tB\n\t\3\t\3\t\3"+
		"\t\7\tG\n\t\f\t\16\tJ\13\t\3\n\3\n\3\n\7\nO\n\n\f\n\16\nR\13\n\3\n\3\n"+
		"\3\13\3\13\3\13\5\13Y\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\5\21j\n\21\3\21\3\21\3\21\6\21o\n\21\r\21\16\21"+
		"p\5\21s\n\21\3\21\5\21v\n\21\3\22\3\22\3\22\7\22{\n\22\f\22\16\22~\13"+
		"\22\5\22\u0080\n\22\3\23\3\23\5\23\u0084\n\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\2\33"+
		"\2\35\2\37\2!\f#\2%\2\'\2)\2\3\2\f\5\2\13\f\17\17\"\"\n\2$$\61\61^^dd"+
		"hhppttvv\5\2\62;CHch\5\2\2!$$^^\4\2C\\c|\3\2aa\4\2GGgg\4\2--//\3\2\62"+
		";\3\2\63;\2\u008f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2!\3\2\2\2"+
		"\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\62\3\2\2\2\13\64\3\2\2\2\r\66\3\2"+
		"\2\2\179\3\2\2\2\21A\3\2\2\2\23K\3\2\2\2\25U\3\2\2\2\27Z\3\2\2\2\31`\3"+
		"\2\2\2\33b\3\2\2\2\35d\3\2\2\2\37f\3\2\2\2!i\3\2\2\2#\177\3\2\2\2%\u0081"+
		"\3\2\2\2\'\u0087\3\2\2\2)\u0089\3\2\2\2+,\7]\2\2,\4\3\2\2\2-.\7_\2\2."+
		"\6\3\2\2\2/\60\7/\2\2\60\61\7@\2\2\61\b\3\2\2\2\62\63\7}\2\2\63\n\3\2"+
		"\2\2\64\65\7\177\2\2\65\f\3\2\2\2\66\67\7.\2\2\67\16\3\2\2\28:\t\2\2\2"+
		"98\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\b\b\2\2>\20\3\2\2"+
		"\2?B\5\37\20\2@B\5\35\17\2A?\3\2\2\2A@\3\2\2\2BH\3\2\2\2CG\5\35\17\2D"+
		"G\5\'\24\2EG\5\37\20\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2"+
		"\2HI\3\2\2\2I\22\3\2\2\2JH\3\2\2\2KP\7$\2\2LO\5\25\13\2MO\5\33\16\2NL"+
		"\3\2\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2S"+
		"T\7$\2\2T\24\3\2\2\2UX\7^\2\2VY\t\3\2\2WY\5\27\f\2XV\3\2\2\2XW\3\2\2\2"+
		"Y\26\3\2\2\2Z[\7w\2\2[\\\5\31\r\2\\]\5\31\r\2]^\5\31\r\2^_\5\31\r\2_\30"+
		"\3\2\2\2`a\t\4\2\2a\32\3\2\2\2bc\n\5\2\2c\34\3\2\2\2de\t\6\2\2e\36\3\2"+
		"\2\2fg\t\7\2\2g \3\2\2\2hj\7/\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kr\5#\22"+
		"\2ln\7\60\2\2mo\5\'\24\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2"+
		"\2\2rl\3\2\2\2rs\3\2\2\2su\3\2\2\2tv\5%\23\2ut\3\2\2\2uv\3\2\2\2v\"\3"+
		"\2\2\2w\u0080\7\62\2\2x|\5)\25\2y{\5\'\24\2zy\3\2\2\2{~\3\2\2\2|z\3\2"+
		"\2\2|}\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177w\3\2\2\2\177x\3\2\2\2\u0080"+
		"$\3\2\2\2\u0081\u0083\t\b\2\2\u0082\u0084\t\t\2\2\u0083\u0082\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\5#\22\2\u0086&\3"+
		"\2\2\2\u0087\u0088\t\n\2\2\u0088(\3\2\2\2\u0089\u008a\t\13\2\2\u008a*"+
		"\3\2\2\2\21\2;AFHNPXipru|\177\u0083\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}