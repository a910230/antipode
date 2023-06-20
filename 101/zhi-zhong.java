class Solution {
    public boolean isSymmetric(TreeNode root) {
        // root is not null
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null) return (node2 == null);
        if (node2 == null) return false; // node1 is not null
        
        if (node1.val != node2.val) return false;
        return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));
    }
}
