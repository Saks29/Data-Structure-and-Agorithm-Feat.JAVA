/* Q.You are given 2 numbers n and m, the task is to find n√m (nth root of m). If the root is not integer then returns -1. */
// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int low = 0 ; 
        int high = m;
        while(low <= high){
            int mid = (low + high )/2;
            long answer =  1;
            for(int i = 1 ; i <= n ; i++){
                answer = answer*mid;
            }
            if( answer == m){
                return mid;
            }
            else if( answer < m){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return -1 ;
    }
}
