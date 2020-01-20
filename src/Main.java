import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Lexer lexer = new Lexer();
        lexer.addTokenType(0, "word", "\\w+");
        lexer.addTokenType(1, "space", "\\s+");

        List<Token> tokens = lexer.analyze("hello world     again and again");
        for(Token t: tokens) {
            System.out.println(t);
        }
    }
}
