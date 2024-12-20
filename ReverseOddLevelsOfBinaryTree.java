class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class ReverseOddLevelsOfBinaryTree {
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) return null;
        reverseOddLevel(root.left, root.right, 1);
        return root;
    }

    private void reverseOddLevel(TreeNode left, TreeNode right, int level) {
        if (left == null || right == null) return;
        if (level % 2 != 0) {
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        reverseOddLevel(left.left, right.right, level + 1);
        reverseOddLevel(left.right, right.left, level + 1);
    }
}
