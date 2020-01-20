import java.util.*;
import java.util.regex.*;
import java.io.*;
import java.nio.file.*;

public class Lexer {
    /**
     * Constructs a lexer. 
     * The lexer should store the token patterns to be added later.
     */
    public Lexer() {
        // TODO
    }

    /**
     * Add a new token type.
     * A token type is characterized by the index, the name of the token type
     * and a regular expression.  This always assumes that the tokens with
     * this type should be included in the output of the analysis.
     */
    public void addTokenType(int typeIndex, String typeName, String pattern) {
        // TODO
    }
    /**
     * Add a new token type with the ignore flag.
     * If ignore=true, then tokens of this type will *not* be included
     * in the output of the analysis.
     */
    public void addTokenType(int typeIndex, String typeName, String pattern, boolean ignore) {
        // TODO
    }

    /**
     * Performs the analysis.
     * Returns the list of tokens of the given string.  This function
     * also throws exceptions when the string `code` cannot
     * be properly tokenized.
     */
    public List<Token> analyze(String code) throws Exception {
        // TODO
        return null;
    }
}
