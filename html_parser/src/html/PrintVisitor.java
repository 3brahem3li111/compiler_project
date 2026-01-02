package html;

import html.HTMLParser.*;
import org.antlr.v4.runtime.Token;
import java.util.List;

public class PrintVisitor extends HTMLParserBaseVisitor<Void> {

    private int indent = 0;

    private void print(String text) {
        System.out.println("  ".repeat(indent) + text);
    }

    @Override
    public Void visitDivElement(DivElementContext ctx) {
        Token startToken = ctx.start;
        print("Element: div (line " + startToken.getLine() + ")");
        indent++;
        List<ElementContext> children = ctx.children;
        if (children != null) {
            for (ElementContext child : children) {
                visit(child);
            }
        }
        indent--;
        return null;
    }

    @Override
    public Void visitSpanElement(SpanElementContext ctx) {
        Token startToken = ctx.start;
        print("Element: span (line " + startToken.getLine() + ")");
        indent++;
        List<ElementContext> children = ctx.children;
        if (children != null) {
            for (ElementContext child : children) {
                visit(child);
            }
        }
        indent--;
        return null;
    }

    @Override
    public Void visitH1Element(H1ElementContext ctx) {
        Token startToken = ctx.start;
        print("Element: h1 (line " + startToken.getLine() + ")");
        indent++;
        List<ElementContext> children = ctx.children;
        if (children != null) {
            for (ElementContext child : children) {
                visit(child);
            }
        }
        indent--;
        return null;
    }

    @Override
    public Void visitPElement(PElementContext ctx) {
        Token startToken = ctx.start;
        print("Element: p (line " + startToken.getLine() + ")");
        indent++;
        List<ElementContext> children = ctx.children;
        if (children != null) {
            for (ElementContext child : children) {
                visit(child);
            }
        }
        indent--;
        return null;
    }
}