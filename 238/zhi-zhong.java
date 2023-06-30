class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        int prod = 1;
        for (int i = nums.length - 1; i > -1; --i) { // ret serves as rightProduct
            ret[i] = prod;
            prod *= nums[i];
        }

        int prev = nums[0];
        nums[0] = 1;
        prod = 1;
        for (int i = 1; i < nums.length; ++i) { // nums serves as leftProduct
            prod *= prev;
            prev = nums[i];
            nums[i] = prod;
        }

        for (int i = 0; i < nums.length; ++i) {
            ret[i] *= nums[i];
        }

        return ret;
    }
}
