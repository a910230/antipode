class Solution {
    public int maxProfit(int[] prices) {
        int curBuy = prices[0];
        int potBuy = prices[0];
        int profit = 0;
        
        for (int i = 1; i < prices.length; ++i) {
            int p = prices[i];
            if (p < potBuy) potBuy = p;
            else if (p - potBuy > profit) {
                curBuy = potBuy;
                profit = p - curBuy;
            }
        }
        
        return profit;
    }
}
