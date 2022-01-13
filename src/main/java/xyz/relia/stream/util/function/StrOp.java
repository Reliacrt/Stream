package xyz.relia.stream.util.function;

public interface StrOp {

    public static char[] stringToCharArray(String s) {
        int len = s.length();
        char[] chars = new char[len];
        s.getChars(0, len, chars, 0);
        return chars;
    }
}
