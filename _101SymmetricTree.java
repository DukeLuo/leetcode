class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class _101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode leftTree, TreeNode rightTree) {
        if (leftTree == null && rightTree == null) {
            return true;
        }
        if (leftTree == null || rightTree == null) {
            return false;
        }
        return leftTree.val == rightTree.val && isMirror(leftTree.left, rightTree.right) && isMirror(leftTree.right, rightTree.left);
    }

    public static void main(String[] args) {
        TreeNode leftTree = new TreeNode(2);
        TreeNode rightTree = new TreeNode(2);
        TreeNode root = new TreeNode(1, leftTree, rightTree);
        _101SymmetricTree solution = new _101SymmetricTree();
        System.out.println(solution.isSymmetric(root));
    }
}
