package ca.ece.ubc.cpen221.mp5.antlr;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Author: Dooj
 * Date: 2015-12-01.
 */
public class MyQueryVisitor implements QueryVisitor {
    public MyQueryVisitor(){

    }

    @Override
    public Object visitQuery(QueryParser.QueryContext ctx) {
        return null;
    }

    @Override
    public Object visitOrExpr(QueryParser.OrExprContext ctx) {
        return null;
    }

    @Override
    public Object visitAndExpr(QueryParser.AndExprContext ctx) {
        System.out.println(ctx.children);
        return null;
    }

    @Override
    public Object visitAtom(QueryParser.AtomContext ctx) {
        return null;
    }

    @Override
    public Object visitIn(QueryParser.InContext ctx) {
        return null;
    }

    @Override
    public Object visitCategory(QueryParser.CategoryContext ctx) {
        return null;
    }

    @Override
    public Object visitName(QueryParser.NameContext ctx) {
        return null;
    }

    @Override
    public Object visitRating(QueryParser.RatingContext ctx) {
        return null;
    }

    @Override
    public Object visitPrice(QueryParser.PriceContext ctx) {
        System.out.println(ctx.getParent());
        return null;
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
