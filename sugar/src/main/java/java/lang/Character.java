package java.lang;

public abstract class Character implements java.io.Serializable, Comparable<Character> {
    public static int compare(char a, char b) {
        throw new RuntimeException();
    }

    public static int hashCode(char i) {
        throw new RuntimeException();
    }

    public static String toString(int i) {
        throw new RuntimeException();
    }
}
