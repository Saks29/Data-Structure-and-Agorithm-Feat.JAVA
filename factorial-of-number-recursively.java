// Q.Given a positive integer, n. Find the factorial of n.

class Solution {
    static int factorial(int n) {
        // code here
        int result;
        if(n<1){
            return 1;
        }
        result = n*factorial(n-1);
        return result;
    }
}
