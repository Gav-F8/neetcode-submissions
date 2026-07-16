class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int min = prices[0];
        for(int i = 0; i < prices.length; i++){
            int profit = prices[i] - min;
            min = Math.min(min, prices[i]);
            res = Math.max(res, profit);
        }
        return res;
    }
}
