class Solution {    
    public int climbStairs(int n) {
        int[] ways = new int[n + 1];
        ways[0] = ways[1] = 1;
        
        for (int i = 2; i < n + 1; ++i) {
            ways[i] = climb(i, ways);
        }
        
        return ways[n];
    }
    
    private int climb(int n, int[] ways)  {
        return ways[n - 1] + ways[n - 2];
    }
}
