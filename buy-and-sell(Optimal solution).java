//Q.You are given an array prices where prices[i] is the price of a given stock on the ith day.

import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int mini = prices[0];
        for(int i = 1 ; i < prices.length ; i++){
            int profit = prices[i] - mini;
            if(profit > max_profit){
                max_profit = profit;
            }
            mini = Math.min(mini,prices[i]);
        }
        return max_profit;
    }
}
