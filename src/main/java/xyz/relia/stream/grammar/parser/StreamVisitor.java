// Generated from /Users/bytedance/Projects/Java/Stream/src/main/java/xyz/relia/stream/antlr/Stream.g4 by ANTLR 4.9.2

    package xyz.relia.stream.grammar.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StreamParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StreamVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StreamParser#stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream(StreamParser.StreamContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#streamDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreamDef(StreamParser.StreamDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#operateDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperateDef(StreamParser.OperateDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#operateDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperateDec(StreamParser.OperateDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#operateImp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperateImp(StreamParser.OperateImpContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(StreamParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#dataStream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStream(StreamParser.DataStreamContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#valueStream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueStream(StreamParser.ValueStreamContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#switchStream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStream(StreamParser.SwitchStreamContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#unwrapStream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnwrapStream(StreamParser.UnwrapStreamContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#typedNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedNames(StreamParser.TypedNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#typedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedName(StreamParser.TypedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames(StreamParser.NamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(StreamParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(StreamParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(StreamParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(StreamParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(StreamParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#originalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginalType(StreamParser.OriginalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#streamType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreamType(StreamParser.StreamTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#structType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(StreamParser.StructTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(StreamParser.FunctionTypeContext ctx);
}