parser grammar HTMLParser;

options { tokenVocab = HTMLLexer; }

document: element EOF;

element
    : LT DIV GT element LT SLASH DIV GT
    | LT P GT LT SLASH P GT
    ;