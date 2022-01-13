package xyz.relia.stream.grammar.visitor;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import xyz.relia.stream.grammar.parser.StreamParser;
import xyz.relia.stream.grammar.parser.StreamVisitor;

public class StreamVisitorImpl implements StreamVisitor<String> {
    @Override
    public String visitStream(StreamParser.StreamContext ctx) {
        System.out.println(StreamParser.ruleNames[ctx.getRuleIndex()]);
        return null;
    }

    @Override
    public String visitStreamDef(StreamParser.StreamDefContext ctx) {
        return null;
    }

    @Override
    public String visitOperateDef(StreamParser.OperateDefContext ctx) {
        return null;
    }

    @Override
    public String visitOperateDec(StreamParser.OperateDecContext ctx) {
        return null;
    }

    @Override
    public String visitOperateImp(StreamParser.OperateImpContext ctx) {
        return null;
    }

    @Override
    public String visitStatements(StreamParser.StatementsContext ctx) {
        return null;
    }

    @Override
    public String visitDataStream(StreamParser.DataStreamContext ctx) {
        return null;
    }

    @Override
    public String visitValueStream(StreamParser.ValueStreamContext ctx) {
        return null;
    }

    @Override
    public String visitSwitchStream(StreamParser.SwitchStreamContext ctx) {
        return null;
    }

    @Override
    public String visitUnwrapStream(StreamParser.UnwrapStreamContext ctx) {
        return null;
    }

    @Override
    public String visitTypedNames(StreamParser.TypedNamesContext ctx) {
        return null;
    }

    @Override
    public String visitTypedName(StreamParser.TypedNameContext ctx) {
        return null;
    }

    @Override
    public String visitNames(StreamParser.NamesContext ctx) {
        return null;
    }

    @Override
    public String visitName(StreamParser.NameContext ctx) {
        return null;
    }

    @Override
    public String visitValues(StreamParser.ValuesContext ctx) {
        return null;
    }

    @Override
    public String visitValue(StreamParser.ValueContext ctx) {
        return null;
    }

    @Override
    public String visitTypes(StreamParser.TypesContext ctx) {
        return null;
    }

    @Override
    public String visitType(StreamParser.TypeContext ctx) {
        if (ctx.originalType() != null) {
            visitOriginalType(ctx.originalType());
        }
        if (ctx.streamType() != null) {
            visitStreamType(ctx.streamType());
        }
        if (ctx.structType() != null) {
            visitStructType(ctx.structType());
        }
        if (ctx.functionType() != null) {
            visitFunctionType(ctx.functionType());
        }
        return null;
    }

    @Override
    public String visitOriginalType(StreamParser.OriginalTypeContext ctx) {
        return null;
    }

    @Override
    public String visitStreamType(StreamParser.StreamTypeContext ctx) {
        return null;
    }

    @Override
    public String visitStructType(StreamParser.StructTypeContext ctx) {
        return null;
    }

    @Override
    public String visitFunctionType(StreamParser.FunctionTypeContext ctx) {
        return null;
    }

    @Override
    public String visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public String visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public String visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public String visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
