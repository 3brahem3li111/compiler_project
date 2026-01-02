package html;

import html.HTMLParser.*;
import org.antlr.v4.runtime.Token;

public class PrintHTMLVisitor extends HTMLParserBaseVisitor<Void> {

    private int indent = 0;

    private void print(String text) {
        System.out.println("  ".repeat(indent) + text);
    }

    @Override
    public Void visitDivElement(DivElementContext ctx) {
        Token startToken = ctx.OPEN_DIV().getSymbol();
        print("Element: div (line " + startToken.getLine() + ")");
        indent++;
        visit(ctx.content());
        indent--;
        return null;
    }

    @Override
    public Void visitPElement(PElementContext ctx) {
        Token startToken = ctx.OPEN_P().getSymbol();
        print("Element: p (line " + startToken.getLine() + ")");
        indent++;
        visit(ctx.content());
        indent--;
        return null;
    }

    @Override
    public Void visitH1Element(H1ElementContext ctx) {
        Token startToken = ctx.OPEN_H1().getSymbol();
        print("Element: h1 (line " + startToken.getLine() + ")");
        indent++;
        visit(ctx.content());
        indent--;
        return null;
    }

    @Override
    public Void visitSpanElement(SpanElementContext ctx) {
        Token startToken = ctx.OPEN_SPAN().getSymbol();
        print("Element: span (line " + startToken.getLine() + ")");
        indent++;
        visit(ctx.content());
        indent--;
        return null;
    }

    @Override
    public Void visitImgElement(ImgElementContext ctx) {
        Token startToken = ctx.OPEN_IMG().getSymbol();
        print("Element: img (line " + startToken.getLine() + ")");
        return null;
    }

    @Override
    public Void visitItem(ItemContext ctx) {
        if (ctx.TEXT() != null) {
            String text = ctx.TEXT().getText();
            if (!text.trim().isEmpty()) {
                print("Text: \"" + text.trim() + "\" (line " + ctx.TEXT().getSymbol().getLine() + ")");
            }
        } else if (ctx.element() != null) {
            visit(ctx.element());
        }
        return null;
    }
}