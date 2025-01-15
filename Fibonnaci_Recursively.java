// Q.The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1.

class Solution {
    public int fib(int n) {
        if( n <= 1){
            return n;
        }
        int Last = fib(n-1);
        int SecondLast = fib(n-2);
        return Last + SecondLast ; 
    }
}
