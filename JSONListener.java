// Generated from JSON.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JSONParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JSONParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JSONParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JSONParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#nodelist}.
	 * @param ctx the parse tree
	 */
	void enterNodelist(JSONParser.NodelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#nodelist}.
	 * @param ctx the parse tree
	 */
	void exitNodelist(JSONParser.NodelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#linklist}.
	 * @param ctx the parse tree
	 */
	void enterLinklist(JSONParser.LinklistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#linklist}.
	 * @param ctx the parse tree
	 */
	void exitLinklist(JSONParser.LinklistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(JSONParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(JSONParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(JSONParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(JSONParser.LinkContext ctx);
}