class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lp = new int[nums.length], rp = new int[nums.length], ret = new int[nums.length];
        int prod = 1;
        for (int i = 0; i < nums.length; ++i) {
            lp[i] = prod;
            prod *= nums[i];
        }
        prod = 1;
        for (int i = nums.length - 1; i > -1; --i) {
            rp[i] = prod;
            prod *= nums[i];
        }
        for (int i = 0; i < nums.length; ++i) {
            ret[i] = lp[i] * rp[i];
        }
        return ret;
    }
}
