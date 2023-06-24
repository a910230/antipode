class Solution {
    public void moveZeroes(int[] nums) {
        int s = 0;
        for (int f = 0; f < nums.length; ++f) {
            if (nums[f] == 0) continue;
            nums[s] = nums[f];
            ++s;
        }
        for (; s < nums.length; ++s) {
            nums[s] = 0;
        }
    }
}
