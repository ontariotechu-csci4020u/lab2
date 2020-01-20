// ============================================
// DO NOT MODIFY THIS FILE
// ============================================
//
/**
 * The testcases
 */
public class Testcases {
    public void basic1() throws Exception {
        Lexer lexer = new Lexer();
        lexer.addTokenType(0, "Word", "\\w+");
        lexer.addTokenType(1, "Whitespace", "[ \\t]+");
        for(Token t : lexer.analyze("Hello my name is albert einstein")) {
            System.out.println(t);
        }
    }
    public void basic2() throws Exception {
        Lexer lexer = new Lexer();
        lexer.addTokenType(0, "Whitespace", "[ \\t]+");
        lexer.addTokenType(1, "Keyword", "for|while|if");
        lexer.addTokenType(2, "Number", "[0-9]+(.[0-9]+)?");
        lexer.addTokenType(3, "Operator", "+|-|*|/");

        String code = "if 9.4 + 0.12 while 0 * 1 for 2";
        for(Token t : lexer.analyze(code)) {
            System.out.println(t);
        }
    }

    public void ignoreTokens() throws Exception {
        Lexer lexer = new Lexer();
        lexer.addTokenType(0, "Word", "\\w+");
        lexer.addTokenType(1, "Whitespace", "[ \\t]+", true);
        for(Token t : lexer.analyze("Hello my name is albert einstein")) {
            System.out.println(t);
        }
    }

    public void badSource1() throws Exception {
        Lexer lexer = new Lexer();
        lexer.addTokenType(0, "Word", "\\w+");
        lexer.addTokenType(1, "Whitespace", "[ \\t]+", true);
        for(Token t : lexer.analyze("Hello my (name) is albert einstein.")) {
            System.out.println(t);
        }
    }

    public void badSource2() throws Exception {
        Lexer lexer = new Lexer();
        lexer.addTokenType(0, "Word", "\\w+");
        lexer.addTokenType(1, "Whitespace", "[ \\t]+", true);
        lexer.analyze("hello, my name is albert einstein");
    }

    public void ambiguity1() throws Exception {
        Lexer lexer = new Lexer();
        lexer.addTokenType(0, "Whitespace", "[ \\t]+", true);
        lexer.addTokenType(1, "INT", "int");
        lexer.addTokenType(2, "ID", "[a-z_]+");

        String code = "int interval";

        for(Token t : lexer.analyze(code))
            System.out.println(t);
    }

    public void ambiguity2() throws Exception {
        Lexer lexer = new Lexer();
        lexer.addTokenType(0, "Whitespace", "[ \\t]+", true);
        lexer.addTokenType(1, "INT", "int");
        lexer.addTokenType(2, "FLOAT", "float");
        lexer.addTokenType(3, "DOUBLE", "DOUBLE");
        lexer.addTokenType(4, "ID", "[a-z_]+");

        String code = "double_value double";

        for(Token t : lexer.analyze(code))
            System.out.println(t);
    }
    public void ambiguity3() throws Exception {
        Lexer lexer = new Lexer();
        lexer.addTokenType(0, "Whitespace", "[ \\t]+", true);
        lexer.addTokenType(1, "INT", "int");
        lexer.addTokenType(2, "FLOAT", "float");
        lexer.addTokenType(3, "DOUBLE", "DOUBLE");
        lexer.addTokenType(4, "ID", "[a-z_]+");

        String code = "int interval double_value double floating_point float x y z";

        for(Token t : lexer.analyze(code))
            System.out.println(t);
    }

}
