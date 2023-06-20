class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> trav = new ArrayList<Integer>();
        if (root != null) put(root, trav);
        
        return trav;
    }
    
    private void put(TreeNode node, List<Integer> trav) {
        if (node.left != null) put(node.left, trav);
        trav.add(node.val);
        if (node.right != null) put(node.right, trav);
    }
}
