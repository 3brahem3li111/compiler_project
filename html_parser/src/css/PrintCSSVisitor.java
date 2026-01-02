package css;

import css.CSSParser.*;
import org.antlr.v4.runtime.Token;

public class PrintCSSVisitor extends CSSParserBaseVisitor<Void> {

    private int indent = 0;

    private void print(String text) {
        System.out.println("  ".repeat(indent) + text);
    }

    @Override
    public Void visitRule(RuleContext ctx) {
        // Visit selector to print rule name
        visit(ctx.selector());
        indent++;
        // Visit all declarations
        for (DeclarationContext decl : ctx.declaration()) {
            Token propToken = decl.IDENTIFIER(0).getSymbol(); // property name
            Token valueToken = decl.IDENTIFIER(1).getSymbol(); // value
            print("Property: " + propToken.getText() + " = " + valueToken.getText() + " (line " + propToken.getLine() + ")");
        }
        indent--;
        return null;
    }

    @Override
    public Void visitElementSelector(ElementSelectorContext ctx) {
        Token token = ctx.IDENTIFIER().getSymbol();
        print("Rule: " + token.getText() + " (line " + token.getLine() + ")");
        return null;
    }

    @Override
    public Void visitClassSelector(ClassSelectorContext ctx) {
        Token token = ctx.IDENTIFIER().getSymbol();
        print("Rule: ." + token.getText() + " (line " + token.getLine() + ")");
        return null;
    }
}