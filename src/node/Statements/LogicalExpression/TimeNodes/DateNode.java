package node.Statements.LogicalExpression.TimeNodes;

import node.Statements.LogicalExpression.LogicalExprNode;
import utils.StringUtils;

public class DateNode extends LogicalExprNode {

    @Override
    public String getTreeString(int indentation) {
        return StringUtils.getIndentedString(indentation) +
                this.toString() + "\n";
    }

    @Override
    public String toString() {
        return "DateNode()";
    }
}
