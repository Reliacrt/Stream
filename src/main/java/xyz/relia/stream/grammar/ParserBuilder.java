package xyz.relia.stream.grammar;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import xyz.relia.stream.grammar.parser.StreamLexer;
import xyz.relia.stream.grammar.parser.StreamParser;

public interface ParserBuilder {

    static StreamParser from(String str) {
        var charStream = CharStreams.fromString(str);
        var lexer = new StreamLexer(charStream);
        var tokens = new CommonTokenStream(lexer);
        return new StreamParser(tokens);
    }
}
