package t606;

public class Main {
    public static void main(String[] args) {

    }

    private StringBuilder stringBuilder = new StringBuilder();

    public String tree2str(TreeNode t) {
        preNode(t);
        return stringBuilder.toString();
    }

    private void preNode(TreeNode node) {
        if (node == null) {
            return;
        }
        stringBuilder.append(node.val);
        if (node.left != null && node.right != null) {
            stringBuilder.append("(");
            preNode(node.left);
            stringBuilder.append(")");

            stringBuilder.append("(");
            preNode(node.right);
            stringBuilder.append(")");
        } else if (node.left == null && node.right != null) {
            stringBuilder.append("(");
            preNode(node.left);
            stringBuilder.append(")");

            stringBuilder.append("(");
            preNode(node.right);
            stringBuilder.append(")");
        } else if (node.left != null && node.right == null) {
            stringBuilder.append("(");
            preNode(node.left);
            stringBuilder.append(")");
        }
    }
}

