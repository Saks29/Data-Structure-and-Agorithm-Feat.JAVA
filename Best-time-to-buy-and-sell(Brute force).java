/* Q.You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/
class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        for(int i = 0 ; i < prices.length-1 ; i++){
            for(int j = i+1 ; j< prices.length ; j++){
                int return_value = prices[j] - prices[i];
                if(return_value > max_profit){
                    max_profit = return_value;
                }
            }
        }
        return max_profit;
    }
}
