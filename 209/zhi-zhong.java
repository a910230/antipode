class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0, sum = nums[0], min = nums.length + 1;
        while (true) {
            if (sum < target) {
                ++j;
                if (j == nums.length) break;
                sum += nums[j];
            }
            else if (i == j) return 1;
            else {
                min = Math.min(min, j - i + 1);
                sum -= nums[i];
                ++i;
            }
        }
        if (min == nums.length + 1) return 0;
        return min;
    }
}
