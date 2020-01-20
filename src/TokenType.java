import java.util.regex.*;

public class TokenType {
    int index;
    String name;
    Pattern pattern;
    boolean ignore;

    public TokenType(int index, String name, String re, boolean ignore) {
        this.index = index;
        this.name = name;
        this.pattern = Pattern.compile(re);
        this.ignore = ignore;
    }
}
