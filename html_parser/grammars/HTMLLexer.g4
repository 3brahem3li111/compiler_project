lexer grammar HTMLLexer;

OPEN_DIV  : '<div>' ;
OPEN_P    : '<p>' ;
OPEN_H1   : '<h1>' ;
OPEN_SPAN : '<span>' ;
OPEN_IMG  : '<img>' ;

CLOSE_DIV : '</div>' ;
CLOSE_P   : '</p>' ;
CLOSE_H1  : '</h1>' ;
CLOSE_SPAN: '</span>' ;

TEXT : ~[<>\r\n]+ ;

WS : [ \t\r\n]+ -> skip ;