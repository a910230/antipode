// Optimization needed
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        
        // nums.length is guaranteed to be at least 3
        int len = nums.length;
        
        int i = 0;
        while (nums[i] <= 0) {
            int j = i + 1;
            if (nums[i] + nums[j] > 0) break;
            int k = len - 1;
            if (nums[k] < 0) break;
            
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> sol = new ArrayList<>();
                    sol.add(nums[i]);
                    sol.add(nums[j]);
                    sol.add(nums[k]);
                    ret.add(sol);
                    
                    while (nums[j] == sol.get(1)) {
                        ++j; 
                        if (j == k) break;
                    }
                } else if (sum < 0) {
                    int curJ = nums[j];
                    while (nums[j] == curJ) {
                        ++j;
                        if (j == k) break;
                    }
                } else { // sum > 0
                    int curK = nums[k];
                    while (nums[k] == curK) {
                        --k;
                        if (j == k) break;
                    }
                }
            }
            
            int curI = nums[i];
            while (nums[i] == curI) {
                ++i;
                if (i == len - 2) return ret;
            }
        }
        
        return ret;
    }
}
