grammar Query;

@header {
package mp5
}

@members {
    // This method makes the lexer or parser stop running if it encounters
    // invalid input and throw a RuntimeException.
    public void reportErrorsAsExceptions() {
        //removeErrorListeners();

        addErrorListener(new ExceptionThrowingErrorListener());
    }

    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                Object offendingSymbol, int line, int charPositionInLine,
                String msg, RecognitionException e) {
            throw new RuntimeException(msg);
        }
    }
}

/* Entry point of parser */
query : orExpr;

/* Have lowest precedence */
orExpr : andExpr(OR andExpr)*;

/* Have higher precedence */
andExpr : atom ( AND atom)*;

atom : in|category|rating|price|name|LPAREN orExpr RPAREN;


in : 'in' LPAREN STRING RPAREN;
category : 'category' LPAREN STRING RPAREN;
name : 'name' LPAREN STRING RPAREN;
rating : 'rating' LPAREN RANGE RPAREN;
price : 'price' LPAREN RANGE RPAREN;

RANGE : [1-5]'..'[1-5];
LPAREN : '(';
RPAREN : ')';
OR : '||';
AND : '&&';
STRING : '"' ([a-zA-Z0-9]|' ')* '"';
WS : [ \t\r\n]+ -> skip ;
