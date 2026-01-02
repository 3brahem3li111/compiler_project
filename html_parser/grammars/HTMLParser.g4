parser grammar HTMLParser;

options { tokenVocab = HTMLLexer; }

document: element EOF;

element
    : LT DIV GT (children+=element)* LT SLASH DIV GT    # DivElement
    | LT SPAN GT (children+=element)* LT SLASH SPAN GT  # SpanElement
    | LT H1 GT (children+=element)* LT SLASH H1 GT      # H1Element
    | LT P GT (children+=element)* LT SLASH P GT        # PElement
    | LT IMG GT                                         # ImgElement
    ;