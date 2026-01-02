// Generated from C:/Users/Abrahem Ali/IdeaProjects/compiler_project/html_parser/grammars/CSSParser.g4 by ANTLR 4.13.2
package css;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSSParser}.
 */
public interface CSSParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(CSSParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(CSSParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(CSSParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(CSSParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementSelector}
	 * labeled alternative in {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterElementSelector(CSSParser.ElementSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementSelector}
	 * labeled alternative in {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitElementSelector(CSSParser.ElementSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(CSSParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(CSSParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CSSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CSSParser.DeclarationContext ctx);
}