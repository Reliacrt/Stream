package xyz.relia.stream.grammar;

import xyz.relia.stream.lexer.Token;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private final NodeType type;
    private final Token token;
    private final List<Node> children;
    private final static Pack fault = new Pack(null, -1);

    public enum NodeType { // PEG definition
        UNKNOWN,
        FILE,           // STREAM_DEF* OPERATE_DEF
        STATEMENTS,     // (DATA_STREAM|OPERATE_DEF)*
        STREAM_DEF,     // '[' ID ']' TYPE
        OPERATE_DEF,    // OPERATE_DEC OPERATE_IMP
        OPERATE_DEC,    // '[' TYPED_VALUES '->' ID '->' TYPED_VALUES ']'
        OPERATE_IMP,    // '{' STATEMENTS '}'
        DATA_STREAM,    // VALUES '->' ID '->' VALUES
        TYPED_VALUES,   // (TYPED_VALUE',')*TYPED_VALUE
        VALUES,         // (VALUE',')*VALUE
        TYPES,          // (TYPE',')*TYPE
        TYPED_VALUE,    // VALUE ID
        VALUE,          // ID | STRING | NUMBER
        TYPE,           // ID | OP | STRUCT | STREAM
        OP,             // '[' TYPES '->' TYPES ']'
        STRUCT,         // '[' TYPES ']'
        STREAM,         // '{' TYPE '}'
        ID,             //
        STRING,         //
        NUMBER,         //
    }

    public Node() {
        this.type = NodeType.UNKNOWN;
        this.token = new Token();
        this.children = new ArrayList<>();
    }

    public Node(NodeType type, Token token) {
        this.type = type;
        this.token = token;
        this.children = new ArrayList<>();
    }

    public NodeType getType() {
        return type;
    }

    public Token getToken() {
        return token;
    }

    public List<Node> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(type);
        stringBuilder.append("{");
        if (token != null) {
            stringBuilder.append(token.getIdentity());
        }
        if (children.size() > 0) {
            if (token != null) stringBuilder.append(",");
            stringBuilder.append(children);
        }
        stringBuilder.append("}");
        switch (type) {
            case STREAM_DEF:
            case OPERATE_DEF:
            case OPERATE_DEC:
            case OPERATE_IMP:
                stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public static Node buildGrammarTree(List<Token> tokens) {
        Pack pack = analyzeFile(tokens, 0);
        if (pack == fault) return null;
        return pack.a;
    }

    private static Pack analyzeFile(List<Token> tokens, int index) {
        Node node = new Node(NodeType.FILE, null);
        int len = tokens.size();
        if (index >= len) return fault;
        while (index < len) {
            Pack pack = analyzeStreamDef(tokens, index);
            if (pack == fault) {
                break;
            }
            node.children.add(pack.a);
            index = pack.b;
        }
        Pack pack = analyzeOperateDef(tokens, index);
        if (pack == fault) {
            return fault;
        }
        node.children.add(pack.a);
        index = pack.b;
        return new Pack(node, index);
    }

    private static Pack analyzeStatements(List<Token> tokens, int index) {
        int len = tokens.size();
        Node node = new Node(NodeType.STATEMENTS, null);
        if (index >= len) return fault;
        while (index < len) {
            Pack pack;
            pack = analyzeDataStream(tokens, index);
            if (pack != fault) {
                node.children.add(pack.a);
                index = pack.b;
                continue;
            }
            pack = analyzeOperateDef(tokens, index);
            if (pack != fault) {
                node.children.add(pack.a);
                index = pack.b;
                continue;
            }
            return new Pack(node, index);
        }
        return new Pack(node, index);
    }

    private static Pack analyzeStreamDef(List<Token> tokens, int index) {
        Node node = new Node(NodeType.STREAM_DEF, null);
        Pack pack;
        if (fail(tokens, index, Token.TokenType.LEFT_SQUARE_BRACKET)) return fault;
        index += 1;
        pack = analyzeId(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        if (fail(tokens, index, Token.TokenType.RIGHT_SQUARE_BRACKET)) return fault;
        index += 1;
        pack = analyzeType(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        return new Pack(node, index);
    }

    private static Pack analyzeOperateDef(List<Token> tokens, int index) {
        Node node = new Node(NodeType.OPERATE_DEF, null);
        Pack pack;
        pack = analyzeOperateDec(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        pack = analyzeOperateImp(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        return new Pack(node, index);
    }

    private static Pack analyzeOperateDec(List<Token> tokens, int index) {
        Node node = new Node(NodeType.OPERATE_DEC, null);
        Pack pack;
        if (fail(tokens, index, Token.TokenType.LEFT_SQUARE_BRACKET)) return fault;
        index += 1;
        pack = analyzeTypedValues(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        if (fail(tokens, index, Token.TokenType.RIGHT_ARROW)) return fault;
        index += 1;
        pack = analyzeId(tokens, index);
        node.children.add(pack.a);
        index = pack.b;
        if (fail(tokens, index, Token.TokenType.RIGHT_ARROW)) return fault;
        index += 1;
        pack = analyzeTypedValues(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        if (fail(tokens, index, Token.TokenType.RIGHT_SQUARE_BRACKET)) return fault;
        index += 1;
        return new Pack(node, index);
    }
    
    private static Pack analyzeOperateImp(List<Token> tokens, int index) {
        Node node = new Node(NodeType.OPERATE_IMP, null);
        Pack pack;
        if (fail(tokens, index, Token.TokenType.LEFT_CURLY_BRACKET)) return fault;
        index += 1;
        pack = analyzeStatements(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        if (fail(tokens, index, Token.TokenType.RIGHT_CURLY_BRACKET)) return fault;
        index += 1;
        return new Pack(node, index);
    }

    private static Pack analyzeDataStream(List<Token> tokens, int index) {
        Node node = new Node(NodeType.DATA_STREAM, null);
        Pack pack;
        pack = analyzeValues(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        if (fail(tokens, index, Token.TokenType.RIGHT_ARROW)) return fault;
        index += 1;
        pack = analyzeId(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        if (fail(tokens, index, Token.TokenType.RIGHT_ARROW)) return fault;
        index += 1;
        pack = analyzeValues(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        return new Pack(node, index);
    }

    private static Pack analyzeTypedValues(List<Token> tokens, int index) {
        Node node = new Node(NodeType.TYPED_VALUES, null);
        Pack pack;
        while (true) {
            pack = analyzeTypedValue(tokens, index);
            if (pack == fault) return fault;
            node.children.add(pack.a);
            index = pack.b;
            if (fail(tokens, index, Token.TokenType.COMMA)) {
                return new Pack(node, index);
            } else {
                index += 1;
            }
        }
    }

    private static Pack analyzeTypedValue(List<Token> tokens, int index) {
        Node node = new Node(NodeType.TYPED_VALUE, null);
        Pack pack;
        pack = analyzeValue(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        pack = analyzeId(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        return new Pack(node, index);
    }
    
    private static Pack analyzeValues(List<Token> tokens, int index) {
        Node node = new Node(NodeType.VALUES, null);
        Pack pack;
        while (true) {
            pack = analyzeValue(tokens, index);
            if (pack == fault) return fault;
            node.children.add(pack.a);
            index = pack.b;
            if (fail(tokens, index, Token.TokenType.COMMA)) {
                return new Pack(node, index);
            } else {
                index += 1;
            }
        }
    }

    private static Pack analyzeValue(List<Token> tokens, int index) {
        Node node = new Node(NodeType.VALUE, null);
        Pack pack;
        pack = analyzeId(tokens, index);
        if (pack != fault) {
            node.children.add(pack.a);
            index = pack.b;
            return new Pack(node, index);
        }
        pack = analyzeString(tokens, index);
        if (pack != fault) {
            node.children.add(pack.a);
            index = pack.b;
            return new Pack(node, index);
        }
        pack = analyzeNumber(tokens, index);
        if (pack != fault) {
            node.children.add(pack.a);
            index = pack.b;
            return new Pack(node, index);
        }
        return fault;
    }

    private static Pack analyzeTypes(List<Token> tokens, int index) {
        Node node = new Node(NodeType.TYPES, null);
        Pack pack;
        while (true) {
            pack = analyzeType(tokens, index);
            if (pack == fault) return fault;
            node.children.add(pack.a);
            index = pack.b;
            if (fail(tokens, index, Token.TokenType.COMMA)) {
                return new Pack(node, index);
            } else {
                index += 1;
            }
        }
    }

    private static Pack analyzeType(List<Token> tokens, int index) {
        Node node = new Node(NodeType.TYPE, null);
        Pack pack;
        // ID
        pack = analyzeId(tokens, index);
        if (pack != fault) {
            node.children.add(pack.a);
            index = pack.b;
            return new Pack(node, index);
        }
        // OP
        pack = analyzeOp(tokens, index);
        if (pack != fault) {
            node.children.add(pack.a);
            index = pack.b;
            return new Pack(node, index);
        }
        // STRUCT
        pack = analyzeStruct(tokens, index);
        if (pack != fault) {
            node.children.add(pack.a);
            index = pack.b;
            return new Pack(node, index);
        }
        // {TYPE}
        pack = analyzeStream(tokens, index);
        if (pack != fault) {
            node.children.add(pack.a);
            index = pack.b;
            return new Pack(node, index);
        }
        return fault;
    }

    private static Pack analyzeOp(List<Token> tokens, int index) {
        Node node = new Node(NodeType.OP, null);
        Pack pack;

        if (fail(tokens, index, Token.TokenType.LEFT_SQUARE_BRACKET)) return fault;
        index += 1;
        pack = analyzeTypes(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        if (fail(tokens, index, Token.TokenType.RIGHT_ARROW)) return fault;
        index += 1;
        pack = analyzeTypes(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        if (fail(tokens, index, Token.TokenType.RIGHT_SQUARE_BRACKET)) return fault;
        index += 1;

        return new Pack(node, index);
    }

    private static Pack analyzeStruct(List<Token> tokens, int index) {
        Node node = new Node(NodeType.STRUCT, null);
        Pack pack;
        if (fail(tokens, index, Token.TokenType.LEFT_SQUARE_BRACKET)) return fault;
        index += 1;
        pack = analyzeTypes(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        if (fail(tokens, index, Token.TokenType.RIGHT_SQUARE_BRACKET)) return fault;
        index += 1;
        return new Pack(node, index);
    }

    private static Pack analyzeStream(List<Token> tokens, int index) {
        Node node = new Node(NodeType.STREAM, null);
        Pack pack;

        if (fail(tokens, index, Token.TokenType.LEFT_CURLY_BRACKET)) return fault;
        index += 1;
        pack = analyzeType(tokens, index);
        if (pack == fault) return fault;
        node.children.add(pack.a);
        index = pack.b;
        if (fail(tokens, index, Token.TokenType.RIGHT_CURLY_BRACKET)) return fault;
        index += 1;
        return new Pack(node, index);
    }

    private static Pack analyzeId(List<Token> tokens, int index) {
        if (fail(tokens, index, Token.TokenType.IDENTITY)) return fault;
        return new Pack(new Node(NodeType.ID, tokens.get(index)), index + 1);
    }

    private static Pack analyzeString(List<Token> tokens, int index) {
        if (fail(tokens, index, Token.TokenType.STRING_VALUE)) return fault;
        return new Pack(new Node(NodeType.STRING, tokens.get(index)), index + 1);
    }

    private static Pack analyzeNumber(List<Token> tokens, int index) {
        if (fail(tokens, index, Token.TokenType.DIGIT_VALUE)) return fault;
        return new Pack(new Node(NodeType.NUMBER, tokens.get(index)), index + 1);
    }

    private static boolean fail(List<Token> tokens, int index, Token.TokenType type) {
        if (index >= tokens.size() || index < 0) return true;
        return tokens.get(index).getType() != type;
    }
    
    private static class Pack {
        private final Node a;
        private final int b;
        
        public Pack(Node node, int index) {
            this.a = node;
            this.b = index;
        }

        @Override
        public String toString() {
            return "Pack{" +
                    "Type=" + (a == null ? null : a.type) +
                    ", index=" + b +
                    '}';
        }
    }
}
