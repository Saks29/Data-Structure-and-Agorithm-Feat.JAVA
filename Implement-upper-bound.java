/* Q.You are given a sorted array ‘arr’ containing ‘n’ integers and an integer ‘x’.Implement the ‘upper bound’ function to find the index of the upper bound of 'x' in the array.*/
public class Solution {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int lower = 0 ;
        int high = n - 1;
        int result = n;
        while( lower<=high){
            int mid = (lower+high)/2;
            if( arr[mid] > x){
                result = mid;
                high = mid-1;
            }
            else{
                lower = mid+1;
            }
        }
        return result;
    }
}
