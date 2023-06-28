class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        reverse(nums, 0, len - k);
        reverse(nums, len - k, len);
        reverse(nums, 0, len);
    }
    
    private void reverse(int[] nums, int begin, int end) {
        int tmp;
        --end;
        while (begin < end) {
            tmp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = tmp;
            ++begin;
            --end;            
        }
    }
}
