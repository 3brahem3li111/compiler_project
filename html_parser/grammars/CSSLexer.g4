lexer grammar CSSLexer;

WS      : [ \t\r\n]+ -> skip ;
LBRACE  : '{' ;
RBRACE  : '}' ;
SEMI    : ';' ;
COLON   : ':' ;
DOT     : '.' ;

// Covers: div, color, red, bold, 10px, 24px, price, etc.
IDENTIFIER : [a-zA-Z0-9_-]+ ;