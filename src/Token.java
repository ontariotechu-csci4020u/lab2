public class Token {
    public TokenType type;
    public String lexeme;
    public int start;
    public int end;

    public Token(TokenType t, String lexeme, int s, int e) {
        this.type = t;
        this.lexeme = lexeme;
        this.start = s;
        this.end = e;
    }

    public int length() {
        return this.end - this.start;
    }

    @Override
    public String toString() {
        return String.format("%s:\"%s\"[%d-%d]", type.name, lexeme, start, end);
    }
}
