class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        
        // nums.length is guaranteed to be at least 3
        int len = nums.length;
            
        int j, k, sum;
        for (int i = 0; i < len - 2; ++i) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            j = i + 1;
            k = len - 1;
            
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> sol = Arrays.asList(nums[i], nums[j], nums[k]);
                    ret.add(sol);
                    
                    ++j;
                    while (j < k && nums[j] == nums[j - 1]) ++j;
                } 
                else if (sum < 0) ++j;
                else --k;
            }
        }
        
        return ret;
    }
}
