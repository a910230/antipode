class Solution {
    public boolean canJump(int[] nums) {
        int pos = 0;
        int reach = nums[0];
        while (pos != reach) {
            ++pos;
            if (reach > nums.length - 2) return true;
            reach = Math.max(reach, nums[pos] + pos);
        }
        return pos == nums.length - 1;
    }
}
