package node.define_nodes.Signal;

import node.Statements.Expression.LiteralValues.LiteralValueNode;
import node.base.LeafNode;
import node.base.Node;
import node.base.UnaryNode;
import org.antlr.v4.runtime.ParserRuleContext;
import semantics.VarType;
import visitor.AbstractVisitor;

public class EnumNode extends UnaryNode {
    private String ID;

    public EnumNode(ParserRuleContext ctx, String ID, Node val) {
        super(ctx,val);
        this.ID = ID;
    }

    public EnumNode(ParserRuleContext ctx, Node child, String ID) {
        super(ctx, child);
        this.ID = ID;
    }

    @Override
    public String getTreeString(int indentation) {
        return super.getTreeString(indentation);
    }

    @Override
    public String toString() {
        return "EnumNode(" +
                "ID='" + ID + '\'' +
                ')';
    }
}
