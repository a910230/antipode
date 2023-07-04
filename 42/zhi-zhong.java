class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 1) return 0;

        int[] leftMax = new int[n], rightMax = new int[n];
        leftMax[0] = 0;
        for (int i = 1; i < n; ++i) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i - 1]);
        }
        rightMax[n - 1] = 0;
        for (int i = n - 2; i > -1; --i) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i + 1]);
        }

        int total = 0;
        for (int i = 0; i < n; ++i) {
            int bound = Math.min(leftMax[i], rightMax[i]);
            if (height[i] < bound) total += bound - height[i];
        }

        return total;
    }
}
