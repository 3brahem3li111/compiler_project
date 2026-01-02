package css;

import css.CSSLexer;
import css.CSSParser;
import org.antlr.v4.runtime.*;

public class MainCSS {
    public static void main(String[] args) {
        String input = """
            div { background-color: white; padding: 10px; }
            h1 { color: black; font-size: 24px; }
            .price { color: green; font-weight: bold; }
            """;

        CSSLexer lexer = new CSSLexer(CharStreams.fromString(input));
        CSSParser parser = new CSSParser(new CommonTokenStream(lexer));
        var tree = parser.stylesheet();

        PrintCSSVisitor visitor = new PrintCSSVisitor();
        visitor.visit(tree);

        System.out.println("✅ CSS AST طُبعت بنجاح!");
    }
}