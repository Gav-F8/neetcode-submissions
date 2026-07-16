class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int buy = 0;
        int sell = 0;

        for(int i = 0; i < prices.length; i++){
            
            for(int j = i; j < prices.length; j++){
                res = Math.max(res, prices[j]-prices[i]);
            }
        }

        return res;
    }
}
