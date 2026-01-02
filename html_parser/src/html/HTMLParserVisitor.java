// Generated from C:/Users/Abrahem Ali/IdeaProjects/compiler_project/html_parser/grammars/HTMLParser.g4 by ANTLR 4.13.2
package html;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(HTMLParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivElement(HTMLParser.DivElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SpanElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpanElement(HTMLParser.SpanElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code H1Element}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1Element(HTMLParser.H1ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPElement(HTMLParser.PElementContext ctx);
}