lexer grammar HTMLLexer;

LT : '<' ;
GT : '>' ;
SLASH : '/' ;

DIV  : 'div' ;
P    : 'p' ;
H1   : 'h1' ;
SPAN : 'span' ;

WS : [ \t\r\n]+ -> skip ;