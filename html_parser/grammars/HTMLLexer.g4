lexer grammar HTMLLexer;

LT : '<' ;
GT : '>' ;
SLASH : '/' ;

DIV  : 'div' ;
P    : 'p' ;
H1   : 'h1' ;
SPAN : 'span' ;
IMG  : 'img' ;

WS : [ \t\r\n]+ -> skip ;