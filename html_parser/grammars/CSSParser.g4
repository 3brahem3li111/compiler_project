parser grammar CSSParser;

options { tokenVocab = CSSLexer; }

stylesheet: rule* EOF;

rule
    : selector LBRACE declaration* RBRACE
    ;

selector
    : IDENTIFIER          # ElementSelector
    | DOT IDENTIFIER      # ClassSelector
    ;

declaration
    : IDENTIFIER COLON IDENTIFIER SEMI
    ;