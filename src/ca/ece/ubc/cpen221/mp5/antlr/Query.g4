grammar Query;

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
rating : 'rating' LPAREN STRING RPAREN;
price : 'price' LPAREN STRING RPAREN;

RANGE : [1-5]'..'[1-5];
LPAREN : '(';
RPAREN : ')';
OR : '||';
AND : '&&';
STRING : '"' ([a-z]|[0-9])* '"';
WS : [ \t\r\n]+ -> skip ;
