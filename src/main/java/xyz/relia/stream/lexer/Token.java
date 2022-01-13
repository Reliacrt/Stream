package xyz.relia.stream.lexer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Token {
    private final char[] identity;
    private final TokenType type;

    public enum TokenType {
        UNKNOWN,
        SPACE,
        RIGHT_ARROW,
        LEFT_SQUARE_BRACKET,
        RIGHT_SQUARE_BRACKET,
        LEFT_CURLY_BRACKET,
        RIGHT_CURLY_BRACKET,
        COMMA,
        IDENTITY,
        CHARACTER_VALUE,
        STRING_VALUE,
        DIGIT_VALUE
    }

    static {
    }

    public Token() {
        this.identity = new char[]{};
        this.type = TokenType.UNKNOWN;
    }

    public Token(TokenType type, char[] identity) {
        this.type = type;
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "Token{" +
                "identity=" + String.valueOf(identity) +
                ", type=" + type +
                '}';
    }

    public char[] getIdentity() {
        return identity;
    }

    public TokenType getType() {
        return type;
    }

    public static List<Token> toTokenList(char[] chars) {
        int index = 0;
        int len = chars.length;
        List<Token> tokenList = new ArrayList<>();
        while (index < len) {
            int start = index;
            char c = chars[index];
            switch (c) {
                case ' ', '\t', '\n', '\r' -> index += 1;
                case '-' -> {
                    index += 1;
                    if (chars[index] == '>') {
                        tokenList.add(new Token(TokenType.RIGHT_ARROW, new char[]{'-', '>'}));
                        index += 1;
                    } else {
                        index = getIndex(chars, index, len, tokenList, start);
                    }
                } case '[' -> {
                    tokenList.add(new Token(TokenType.LEFT_SQUARE_BRACKET, new char[]{'['}));
                    index += 1;
                }
                case ']' -> {
                    tokenList.add(new Token(TokenType.RIGHT_SQUARE_BRACKET, new char[]{']'}));
                    index += 1;
                }
                case '{' -> {
                    tokenList.add(new Token(TokenType.LEFT_CURLY_BRACKET, new char[]{'{'}));
                    index += 1;
                }
                case '}' -> {
                    tokenList.add(new Token(TokenType.RIGHT_CURLY_BRACKET, new char[]{'}'}));
                    index += 1;
                }
                case ',' -> {
                    tokenList.add(new Token(TokenType.COMMA, new char[]{','}));
                    index += 1;
                }
                case '\'' -> {
                    index += 1;
                    for (; index < len; index++) {
                        char ch = chars[index];
                        if (ch == '\'') {
                            break;
                        }
                    }
                    index += 1;
                    tokenList.add(new Token(TokenType.CHARACTER_VALUE, Arrays.copyOfRange(chars, start, index)));
                }
                case '\"' -> {
                    index += 1;
                    for (; index < len; index++) {
                        char ch = chars[index];
                        if (ch == '\"') {
                            break;
                        }
                    }
                    index += 1;
                    tokenList.add(new Token(TokenType.STRING_VALUE, Arrays.copyOfRange(chars, start, index)));
                }
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
                    for (; index < len; index++) {
                        char ch = chars[index];
                        if (ch != '0' && ch != '1' && ch != '2' && ch != '3' && ch != '4' &&
                                ch != '5' && ch != '6' && ch != '7' && ch != '8' && ch != '9') {
                            break;
                        }
                    }
                    tokenList.add(new Token(TokenType.DIGIT_VALUE, Arrays.copyOfRange(chars, start, index)));
                }
                default -> {
                    index = getIndex(chars, index, len, tokenList, start);
                }
            }
        }
        return tokenList;
    }

    private static int getIndex(char[] chars, int index, int len, List<Token> tokenList, int start) {
        for (; index < len; index++) {
            char ch = chars[index];
            if (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r' ||
                    ch == '[' || ch == ']' ||
                    ch == '{' || ch == '}' ||
                    ch == ',' || ch == '-') {
                break;
            }
        }
        tokenList.add(new Token(TokenType.IDENTITY, Arrays.copyOfRange(chars, start, index)));
        return index;
    }

}
