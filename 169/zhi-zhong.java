class Solution {
    public int majorityElement(int[] nums) {
        int vote = 1;
        int cand = nums[0];
        
        for (int i = 1; i < nums.length; ++i) {
            if (vote == 0) {
                cand = nums[i];
            }
            
            if (cand == nums[i]) vote += 1;
            else vote -= 1;
        }
        
        return cand;
    }
}
