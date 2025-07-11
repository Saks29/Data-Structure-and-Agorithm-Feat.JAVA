/*Q.Given a sorted array arr[] and a number target, the task is to find the lower bound of the target in this given array. The lower bound of a number is defined as the smallest index in the sorted array where the element is greater than or equal to the given number.*/
import java.util.*;
class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int lower = 0;
        int high = arr.length-1;
        int answer = arr.length;
        while(lower <= high){
            int mid = (lower+high)/2;
            if(arr[mid] >= target){
                answer = mid;
                high = mid - 1;
            }
            else{
                lower = mid+1;
            }
        }
        return answer;
    }
}
