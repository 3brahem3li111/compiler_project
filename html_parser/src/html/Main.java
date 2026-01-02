package html;

import html.HTMLLexer;
import html.HTMLParser;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        String input = "<p></p>";
        HTMLLexer lexer = new HTMLLexer(CharStreams.fromString(input));
        HTMLParser parser = new HTMLParser(new CommonTokenStream(lexer));
        var tree = parser.document();

        PrintVisitor visitor = new PrintVisitor();
        visitor.visit(tree);

        System.out.println("✅ AST طُبعت بنجاح!");
    }
}