class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return split(nums, 0, nums.length);
    }
    
    private TreeNode split(int[] nums, int start, int end) { // [start, end)
        if (start == end) return null;
        if (start + 1 == end) return new TreeNode(nums[start]);
        
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid], split(nums, start, mid), split(nums, mid + 1, end));
        return node;
    }
}
