// Q.Check if a given number N is the Fibonacci number. A Fibonacci number is a number that occurs in the Fibonacci series.

// User function Template for Java
class Solution {
    static String checkFibonacci(int N) {
        // code here
        int first = 0;
        int second = 1;
        return FibonacciSeries(N , first , second);
    }
    public static String FibonacciSeries(int N , int first , int second){
        if( second == N){
            return "Yes";
        }
        if( second < N ){
            int temp = first ;
            first = second ; 
            second = first + temp ;
        }
        if( second > N){
            return "No";
        }
        return FibonacciSeries( N , first , second);
        
    }
}
