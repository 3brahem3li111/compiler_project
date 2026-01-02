parser grammar HTMLParser;

options { tokenVocab = HTMLLexer; }

document: element EOF;

element
    : OPEN_DIV content CLOSE_DIV    # DivElement
    | OPEN_P content CLOSE_P        # PElement
    | OPEN_H1 content CLOSE_H1      # H1Element
    | OPEN_SPAN content CLOSE_SPAN  # SpanElement
    | OPEN_IMG                      # ImgElement
    ;

content
    : item*
    ;

item
    : element
    | TEXT
    ;