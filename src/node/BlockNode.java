package node;

import node.base.ListNode;
import node.base.Node;
import visitor.AbstractVisitor;

import java.util.ArrayList;

public class BlockNode extends ListNode {

    public BlockNode(ArrayList<Node> children) {
        super(children);
    }

    public BlockNode() {
    }

    @Override
    public String toString() {
        return "BlockNode()";
    }
}
