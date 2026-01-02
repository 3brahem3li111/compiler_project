package html;

import html.HTMLLexer;
import html.HTMLParser;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        String input = "<div><p></p></div>";
        HTMLLexer lexer = new HTMLLexer(CharStreams.fromString(input));
        HTMLParser parser = new HTMLParser(new CommonTokenStream(lexer));
        parser.document();
        System.out.println("✅ نجاح!");
    }
}