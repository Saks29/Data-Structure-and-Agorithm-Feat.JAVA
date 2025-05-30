// Q.Given an integer n, your task is to compute the sum of all natural numbers from 1 to n (inclusive). If n is 0, the sum should be 0.


class Solution {
    public static int seriesSum(int n) {
        // code here
        if(n<1){
            return n;
        }
        else{
            int sum = n + seriesSum(n-1);
            return sum;
        }
    }
}
