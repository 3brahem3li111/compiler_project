// Generated from C:/Users/Abrahem Ali/IdeaProjects/compiler_project/html_parser/grammars/HTMLParser.g4 by ANTLR 4.13.2
package html;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(HTMLParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(HTMLParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterDivElement(HTMLParser.DivElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitDivElement(HTMLParser.DivElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterPElement(HTMLParser.PElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitPElement(HTMLParser.PElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code H1Element}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterH1Element(HTMLParser.H1ElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code H1Element}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitH1Element(HTMLParser.H1ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SpanElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterSpanElement(HTMLParser.SpanElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SpanElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitSpanElement(HTMLParser.SpanElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImgElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterImgElement(HTMLParser.ImgElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImgElement}
	 * labeled alternative in {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitImgElement(HTMLParser.ImgElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(HTMLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(HTMLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(HTMLParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(HTMLParser.ItemContext ctx);
}