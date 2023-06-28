class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0] == val? 0: 1;
        
        int i = 0, j = n - 1;
        while (nums[j] == val && j > 0) --j;
        while (i < j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                --j;
                while (nums[j] == val && j > i) --j;
            }
            ++i;
        }
        if (i == j && nums[i] != val) ++i;
        
        return i;
    }
}
