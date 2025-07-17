/* Q.Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.
Floor value of any number is the greatest Integer which is less than or equal to that number. */
class Solution {
    int floorSqrt(int n) {
        // code here
        int low = 0 ; 
        int high = n;
        int floor = -1;
        while( low<=high){
            int mid = (low+high)/2;
            
            if( mid*mid == n){
                return mid;
            }
            else if( mid*mid > n){
                high = mid-1;
            }   
            else{
                floor = mid;
                low = mid+1;
            }
        }
        return floor;
    }
}
