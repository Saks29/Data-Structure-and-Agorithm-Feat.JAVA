/* Q.Given an unsorted array arr of positive integers. One number a from the set [1, 2,....,n] is missing and one number b occurs twice in the array. Find numbers a and b.
Note: The test cases are generated such that there always exists one missing and one repeating number within the range [1,n]. */

// User function Template for Java
import java.util.*;
class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int missing = -1;
        int repeat = -1;
        Arrays.sort(arr);
        for(int i = 1 ; i < arr.length ; i ++){
            if( arr[i] == arr[i-1]){
                repeat = arr[i];
            }
            else if( arr[i] > arr[i-1] + 1){
                missing = arr[i-1] + 1;
            }
        }
        if( arr[0] != 1){
            missing = 1;
        }
        if(missing == -1){
           int n = arr.length;
           missing = n;
        }
        result.add(repeat);
        result.add(missing);
        return result;
    }
}
