// Generated from /Users/bytedance/Projects/Java/Stream/src/main/java/xyz/relia/stream/antlr/Stream.g4 by ANTLR 4.9.2

    package xyz.relia.stream.grammar.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StreamParser}.
 */
public interface StreamListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StreamParser#stream}.
	 * @param ctx the parse tree
	 */
	void enterStream(StreamParser.StreamContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#stream}.
	 * @param ctx the parse tree
	 */
	void exitStream(StreamParser.StreamContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#streamDef}.
	 * @param ctx the parse tree
	 */
	void enterStreamDef(StreamParser.StreamDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#streamDef}.
	 * @param ctx the parse tree
	 */
	void exitStreamDef(StreamParser.StreamDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#operateDef}.
	 * @param ctx the parse tree
	 */
	void enterOperateDef(StreamParser.OperateDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#operateDef}.
	 * @param ctx the parse tree
	 */
	void exitOperateDef(StreamParser.OperateDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#operateDec}.
	 * @param ctx the parse tree
	 */
	void enterOperateDec(StreamParser.OperateDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#operateDec}.
	 * @param ctx the parse tree
	 */
	void exitOperateDec(StreamParser.OperateDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#operateImp}.
	 * @param ctx the parse tree
	 */
	void enterOperateImp(StreamParser.OperateImpContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#operateImp}.
	 * @param ctx the parse tree
	 */
	void exitOperateImp(StreamParser.OperateImpContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(StreamParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(StreamParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#dataStream}.
	 * @param ctx the parse tree
	 */
	void enterDataStream(StreamParser.DataStreamContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#dataStream}.
	 * @param ctx the parse tree
	 */
	void exitDataStream(StreamParser.DataStreamContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#valueStream}.
	 * @param ctx the parse tree
	 */
	void enterValueStream(StreamParser.ValueStreamContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#valueStream}.
	 * @param ctx the parse tree
	 */
	void exitValueStream(StreamParser.ValueStreamContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#switchStream}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStream(StreamParser.SwitchStreamContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#switchStream}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStream(StreamParser.SwitchStreamContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#unwrapStream}.
	 * @param ctx the parse tree
	 */
	void enterUnwrapStream(StreamParser.UnwrapStreamContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#unwrapStream}.
	 * @param ctx the parse tree
	 */
	void exitUnwrapStream(StreamParser.UnwrapStreamContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#typedNames}.
	 * @param ctx the parse tree
	 */
	void enterTypedNames(StreamParser.TypedNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#typedNames}.
	 * @param ctx the parse tree
	 */
	void exitTypedNames(StreamParser.TypedNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#typedName}.
	 * @param ctx the parse tree
	 */
	void enterTypedName(StreamParser.TypedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#typedName}.
	 * @param ctx the parse tree
	 */
	void exitTypedName(StreamParser.TypedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#names}.
	 * @param ctx the parse tree
	 */
	void enterNames(StreamParser.NamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#names}.
	 * @param ctx the parse tree
	 */
	void exitNames(StreamParser.NamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(StreamParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(StreamParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(StreamParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(StreamParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(StreamParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(StreamParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(StreamParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(StreamParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(StreamParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(StreamParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#originalType}.
	 * @param ctx the parse tree
	 */
	void enterOriginalType(StreamParser.OriginalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#originalType}.
	 * @param ctx the parse tree
	 */
	void exitOriginalType(StreamParser.OriginalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#streamType}.
	 * @param ctx the parse tree
	 */
	void enterStreamType(StreamParser.StreamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#streamType}.
	 * @param ctx the parse tree
	 */
	void exitStreamType(StreamParser.StreamTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#structType}.
	 * @param ctx the parse tree
	 */
	void enterStructType(StreamParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#structType}.
	 * @param ctx the parse tree
	 */
	void exitStructType(StreamParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(StreamParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(StreamParser.FunctionTypeContext ctx);
}