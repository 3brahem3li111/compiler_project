// Generated from C:/Users/Abrahem Ali/IdeaProjects/compiler_project/html_parser/grammars/CSSParser.g4 by ANTLR 4.13.2
package css;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSSParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSSParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(CSSParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(CSSParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementSelector}
	 * labeled alternative in {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementSelector(CSSParser.ElementSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassSelector}
	 * labeled alternative in {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSelector(CSSParser.ClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSSParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CSSParser.DeclarationContext ctx);
}