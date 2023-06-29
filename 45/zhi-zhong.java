class Solution {
    public int jump(int[] nums) {
        int i = 0, step = 1, len = nums.length;
        if (len == 1) return 0;
        while (nums[i] + i < len - 1) {
            ++step;
            i = maxI(nums, i + 1, i + nums[i] + 1);
        }
        return step;
    }

    private int maxI(int[] nums, int begin, int end) {
        int max = 0, maxI = begin, len = nums.length;
        for (int i = end - 1; i > begin - 1; --i) {
            if (nums[i] + i > len - 2) return i;
            if (nums[i] + i > max) {
                max = nums[i] + i;
                maxI = i;
            }
        }
        return maxI;
    }
}
