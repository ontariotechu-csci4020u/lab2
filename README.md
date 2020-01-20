# Lab 2: Lexical Analysis using Regular Expressions.

In this lab, we will be implementing a lexical analyzer that makes use of the Java regular expression library.

## Description

The lab provides several files:

```
.
├── Makefile
├── README.md
├── reference.json
└── src
    ├── Lexer.java      <=== to be completed
    ├── Main.java
    ├── Testcases.java
    ├── Token.java
    └── TokenType.java
```

You are to complete the `Lexer.java` file which implements a regular expression based lexical analyzer.  The `Lexer` object has several key methods:

**Add token types**

```java
public void addTokenType(int typeIndex, String typeName, String pattern);
public void addTokenType(int typeIndex, String typeName, String pattern, boolean ignore);
```

The `addTokenType` method adds a token type to the `Lexer` so that the lexer can recognize such tokens in the character stream.  Each added `TokenType` has an unique `typeIndex`.  It also has a name, and a pattern which must be a valid regular expression.

A variant of `addTokenType` has an extra flag `boolean ignore`.  If `ignore` is set to `true`, then the lexer will recognize tokens of this type, __but will not__ include the recognized tokens in the output token stream.

**Perform analysis**

```java
public List<Token> analyze(String code) throws Exception
```

The `analyze(...)` method performs the actual lexical analysis, namely converting the String parameter to a sequence of tokens.  Refer to `Token.java` to see the structure of each token.

The analysis must respect the following rules:

- All all the added token types during the token recognition.
- If *two or more* types match a part of the input character stream, then the longest match is the result.
- During the recognition, if *no* type matches the input character stream, then this is a recognition error, and the method must throw an Exception with an error message that indicates the character stream position and the character at that position.

  ```
  throw new Exception(String.format("Lexer error: position=%d, char='%c'", pos, character));
  ```

## Evaluation

A basic `Main.java` program is provided to illustrate how your lexer will be used in practice.
You are **free** to modify this however you wish to assist in the development of your lexer implementation.

A testcase suite `Testcases.java` is given.  **You must NOT make changes to this file.**  This file contains the
testcases that will be applied to your program.
