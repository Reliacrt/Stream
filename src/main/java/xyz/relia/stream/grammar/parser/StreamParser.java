// Generated from /Users/bytedance/Projects/Java/Stream/src/main/java/xyz/relia/stream/antlr/Stream.g4 by ANTLR 4.9.2

    package xyz.relia.stream.grammar.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StreamParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, ID=8, STRING=9, 
		NUMBER=10;
	public static final int
		RULE_stream = 0, RULE_streamDef = 1, RULE_operateDef = 2, RULE_operateDec = 3, 
		RULE_operateImp = 4, RULE_statements = 5, RULE_dataStream = 6, RULE_valueStream = 7, 
		RULE_switchStream = 8, RULE_unwrapStream = 9, RULE_typedNames = 10, RULE_typedName = 11, 
		RULE_names = 12, RULE_name = 13, RULE_values = 14, RULE_value = 15, RULE_types = 16, 
		RULE_type = 17, RULE_originalType = 18, RULE_streamType = 19, RULE_structType = 20, 
		RULE_functionType = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"stream", "streamDef", "operateDef", "operateDec", "operateImp", "statements", 
			"dataStream", "valueStream", "switchStream", "unwrapStream", "typedNames", 
			"typedName", "names", "name", "values", "value", "types", "type", "originalType", 
			"streamType", "structType", "functionType"
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

	@Override
	public String getGrammarFileName() { return "Stream.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StreamParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StreamContext extends ParserRuleContext {
		public OperateDefContext operateDef() {
			return getRuleContext(OperateDefContext.class,0);
		}
		public List<StreamDefContext> streamDef() {
			return getRuleContexts(StreamDefContext.class);
		}
		public StreamDefContext streamDef(int i) {
			return getRuleContext(StreamDefContext.class,i);
		}
		public StreamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitStream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamContext stream() throws RecognitionException {
		StreamContext _localctx = new StreamContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stream);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(44);
					streamDef();
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(50);
			operateDef();
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

	public static class StreamDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StreamParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StreamDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterStreamDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitStreamDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitStreamDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamDefContext streamDef() throws RecognitionException {
		StreamDefContext _localctx = new StreamDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_streamDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			match(ID);
			setState(54);
			match(T__1);
			setState(55);
			type();
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

	public static class OperateDefContext extends ParserRuleContext {
		public OperateDecContext operateDec() {
			return getRuleContext(OperateDecContext.class,0);
		}
		public OperateImpContext operateImp() {
			return getRuleContext(OperateImpContext.class,0);
		}
		public OperateDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operateDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterOperateDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitOperateDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitOperateDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperateDefContext operateDef() throws RecognitionException {
		OperateDefContext _localctx = new OperateDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operateDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			operateDec();
			setState(58);
			operateImp();
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

	public static class OperateDecContext extends ParserRuleContext {
		public List<TypedNamesContext> typedNames() {
			return getRuleContexts(TypedNamesContext.class);
		}
		public TypedNamesContext typedNames(int i) {
			return getRuleContext(TypedNamesContext.class,i);
		}
		public TerminalNode ID() { return getToken(StreamParser.ID, 0); }
		public OperateDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operateDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterOperateDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitOperateDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitOperateDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperateDecContext operateDec() throws RecognitionException {
		OperateDecContext _localctx = new OperateDecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operateDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__0);
			setState(61);
			typedNames();
			setState(62);
			match(T__2);
			setState(63);
			match(ID);
			setState(64);
			match(T__2);
			setState(65);
			typedNames();
			setState(66);
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

	public static class OperateImpContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public OperateImpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operateImp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterOperateImp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitOperateImp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitOperateImp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperateImpContext operateImp() throws RecognitionException {
		OperateImpContext _localctx = new OperateImpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operateImp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__3);
			setState(69);
			statements();
			setState(70);
			match(T__4);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<DataStreamContext> dataStream() {
			return getRuleContexts(DataStreamContext.class);
		}
		public DataStreamContext dataStream(int i) {
			return getRuleContext(DataStreamContext.class,i);
		}
		public List<OperateDefContext> operateDef() {
			return getRuleContexts(OperateDefContext.class);
		}
		public OperateDefContext operateDef(int i) {
			return getRuleContext(OperateDefContext.class,i);
		}
		public List<ValueStreamContext> valueStream() {
			return getRuleContexts(ValueStreamContext.class);
		}
		public ValueStreamContext valueStream(int i) {
			return getRuleContext(ValueStreamContext.class,i);
		}
		public List<SwitchStreamContext> switchStream() {
			return getRuleContexts(SwitchStreamContext.class);
		}
		public SwitchStreamContext switchStream(int i) {
			return getRuleContext(SwitchStreamContext.class,i);
		}
		public List<UnwrapStreamContext> unwrapStream() {
			return getRuleContexts(UnwrapStreamContext.class);
		}
		public UnwrapStreamContext unwrapStream(int i) {
			return getRuleContext(UnwrapStreamContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ID) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(72);
					dataStream();
					}
					break;
				case 2:
					{
					setState(73);
					operateDef();
					}
					break;
				case 3:
					{
					setState(74);
					valueStream();
					}
					break;
				case 4:
					{
					setState(75);
					switchStream();
					}
					break;
				case 5:
					{
					setState(76);
					unwrapStream();
					}
					break;
				}
				}
				setState(81);
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

	public static class DataStreamContext extends ParserRuleContext {
		public List<NamesContext> names() {
			return getRuleContexts(NamesContext.class);
		}
		public NamesContext names(int i) {
			return getRuleContext(NamesContext.class,i);
		}
		public TerminalNode ID() { return getToken(StreamParser.ID, 0); }
		public DataStreamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataStream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterDataStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitDataStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitDataStream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataStreamContext dataStream() throws RecognitionException {
		DataStreamContext _localctx = new DataStreamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dataStream);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			names();
			setState(83);
			match(T__2);
			setState(84);
			match(ID);
			setState(85);
			match(T__2);
			setState(86);
			names();
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

	public static class ValueStreamContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public ValueStreamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueStream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterValueStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitValueStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitValueStream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueStreamContext valueStream() throws RecognitionException {
		ValueStreamContext _localctx = new ValueStreamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valueStream);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			values();
			setState(89);
			match(T__2);
			setState(90);
			names();
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

	public static class SwitchStreamContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypedNamesContext typedNames() {
			return getRuleContext(TypedNamesContext.class,0);
		}
		public SwitchStreamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterSwitchStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitSwitchStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitSwitchStream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStreamContext switchStream() throws RecognitionException {
		SwitchStreamContext _localctx = new SwitchStreamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_switchStream);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			name();
			setState(93);
			match(T__2);
			setState(94);
			typedNames();
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

	public static class UnwrapStreamContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypedNamesContext typedNames() {
			return getRuleContext(TypedNamesContext.class,0);
		}
		public UnwrapStreamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unwrapStream; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterUnwrapStream(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitUnwrapStream(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitUnwrapStream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnwrapStreamContext unwrapStream() throws RecognitionException {
		UnwrapStreamContext _localctx = new UnwrapStreamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unwrapStream);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			name();
			setState(97);
			match(T__2);
			setState(98);
			match(T__0);
			setState(99);
			typedNames();
			setState(100);
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

	public static class TypedNamesContext extends ParserRuleContext {
		public List<TypedNameContext> typedName() {
			return getRuleContexts(TypedNameContext.class);
		}
		public TypedNameContext typedName(int i) {
			return getRuleContext(TypedNameContext.class,i);
		}
		public TypedNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterTypedNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitTypedNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitTypedNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedNamesContext typedNames() throws RecognitionException {
		TypedNamesContext _localctx = new TypedNamesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typedNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			typedName();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(103);
				match(T__5);
				setState(104);
				typedName();
				}
				}
				setState(109);
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

	public static class TypedNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(StreamParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(StreamParser.ID, i);
		}
		public TypedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterTypedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitTypedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitTypedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedNameContext typedName() throws RecognitionException {
		TypedNameContext _localctx = new TypedNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ID);
			setState(111);
			match(ID);
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

	public static class NamesContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public NamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamesContext names() throws RecognitionException {
		NamesContext _localctx = new NamesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			name();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(114);
				match(T__5);
				setState(115);
				name();
				}
				}
				setState(120);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StreamParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ID);
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

	public static class ValuesContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			value();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(124);
				match(T__5);
				setState(125);
				value();
				}
				}
				setState(130);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(StreamParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(StreamParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUMBER) ) {
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

	public static class TypesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			type();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(134);
				match(T__5);
				setState(135);
				type();
				}
				}
				setState(140);
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

	public static class TypeContext extends ParserRuleContext {
		public OriginalTypeContext originalType() {
			return getRuleContext(OriginalTypeContext.class,0);
		}
		public StreamTypeContext streamType() {
			return getRuleContext(StreamTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				originalType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				streamType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				structType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				functionType();
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

	public static class OriginalTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StreamParser.ID, 0); }
		public OriginalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterOriginalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitOriginalType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitOriginalType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginalTypeContext originalType() throws RecognitionException {
		OriginalTypeContext _localctx = new OriginalTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_originalType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ID);
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

	public static class StreamTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StreamTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_streamType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterStreamType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitStreamType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitStreamType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamTypeContext streamType() throws RecognitionException {
		StreamTypeContext _localctx = new StreamTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_streamType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__3);
			setState(150);
			type();
			setState(151);
			match(T__4);
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

	public static class StructTypeContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitStructType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__0);
			setState(154);
			types();
			setState(155);
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamListener ) ((StreamListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamVisitor ) return ((StreamVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__0);
			setState(158);
			types();
			setState(159);
			match(T__2);
			setState(160);
			types();
			setState(161);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\u00a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7P\n\7\f\7\16\7"+
		"S\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\fl\n\f\f\f\16\fo\13\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\7\16w\n\16\f\16\16\16z\13\16\3\17\3\17\3\20\3\20\3\20"+
		"\7\20\u0081\n\20\f\20\16\20\u0084\13\20\3\21\3\21\3\22\3\22\3\22\7\22"+
		"\u008b\n\22\f\22\16\22\u008e\13\22\3\23\3\23\3\23\3\23\5\23\u0094\n\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		"\2\3\3\2\13\f\2\u009c\2\61\3\2\2\2\4\66\3\2\2\2\6;\3\2\2\2\b>\3\2\2\2"+
		"\nF\3\2\2\2\fQ\3\2\2\2\16T\3\2\2\2\20Z\3\2\2\2\22^\3\2\2\2\24b\3\2\2\2"+
		"\26h\3\2\2\2\30p\3\2\2\2\32s\3\2\2\2\34{\3\2\2\2\36}\3\2\2\2 \u0085\3"+
		"\2\2\2\"\u0087\3\2\2\2$\u0093\3\2\2\2&\u0095\3\2\2\2(\u0097\3\2\2\2*\u009b"+
		"\3\2\2\2,\u009f\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2"+
		"\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\5\6\4\2\65\3\3\2\2"+
		"\2\66\67\7\3\2\2\678\7\n\2\289\7\4\2\29:\5$\23\2:\5\3\2\2\2;<\5\b\5\2"+
		"<=\5\n\6\2=\7\3\2\2\2>?\7\3\2\2?@\5\26\f\2@A\7\5\2\2AB\7\n\2\2BC\7\5\2"+
		"\2CD\5\26\f\2DE\7\4\2\2E\t\3\2\2\2FG\7\6\2\2GH\5\f\7\2HI\7\7\2\2I\13\3"+
		"\2\2\2JP\5\16\b\2KP\5\6\4\2LP\5\20\t\2MP\5\22\n\2NP\5\24\13\2OJ\3\2\2"+
		"\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2"+
		"\2R\r\3\2\2\2SQ\3\2\2\2TU\5\32\16\2UV\7\5\2\2VW\7\n\2\2WX\7\5\2\2XY\5"+
		"\32\16\2Y\17\3\2\2\2Z[\5\36\20\2[\\\7\5\2\2\\]\5\32\16\2]\21\3\2\2\2^"+
		"_\5\34\17\2_`\7\5\2\2`a\5\26\f\2a\23\3\2\2\2bc\5\34\17\2cd\7\5\2\2de\7"+
		"\3\2\2ef\5\26\f\2fg\7\4\2\2g\25\3\2\2\2hm\5\30\r\2ij\7\b\2\2jl\5\30\r"+
		"\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\27\3\2\2\2om\3\2\2\2pq\7\n"+
		"\2\2qr\7\n\2\2r\31\3\2\2\2sx\5\34\17\2tu\7\b\2\2uw\5\34\17\2vt\3\2\2\2"+
		"wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\33\3\2\2\2zx\3\2\2\2{|\7\n\2\2|\35\3\2"+
		"\2\2}\u0082\5 \21\2~\177\7\b\2\2\177\u0081\5 \21\2\u0080~\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\37\3\2\2"+
		"\2\u0084\u0082\3\2\2\2\u0085\u0086\t\2\2\2\u0086!\3\2\2\2\u0087\u008c"+
		"\5$\23\2\u0088\u0089\7\b\2\2\u0089\u008b\5$\23\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d#\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008f\u0094\5&\24\2\u0090\u0094\5(\25\2\u0091\u0094"+
		"\5*\26\2\u0092\u0094\5,\27\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094%\3\2\2\2\u0095\u0096\7\n\2\2"+
		"\u0096\'\3\2\2\2\u0097\u0098\7\6\2\2\u0098\u0099\5$\23\2\u0099\u009a\7"+
		"\7\2\2\u009a)\3\2\2\2\u009b\u009c\7\3\2\2\u009c\u009d\5\"\22\2\u009d\u009e"+
		"\7\4\2\2\u009e+\3\2\2\2\u009f\u00a0\7\3\2\2\u00a0\u00a1\5\"\22\2\u00a1"+
		"\u00a2\7\5\2\2\u00a2\u00a3\5\"\22\2\u00a3\u00a4\7\4\2\2\u00a4-\3\2\2\2"+
		"\n\61OQmx\u0082\u008c\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}