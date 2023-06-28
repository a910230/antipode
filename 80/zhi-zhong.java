class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int pos = 1;
        int count = 2;
        
        for (int i = 2; i < nums.length; ++i) {
            if (nums[i] == nums[pos] && nums[i] == nums[pos - 1]) continue;
            ++count;
            ++pos;
            nums[pos] = nums[i];
        }
        
        return count;
    }
}
