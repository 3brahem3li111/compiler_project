lexer grammar HTMLLexer;

LT : '<' ;
GT : '>' ;
SLASH : '/' ;

DIV : 'div' ;
P : 'p' ;

WS : [ \t\r\n]+ -> skip ;