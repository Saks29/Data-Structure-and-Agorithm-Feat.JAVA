/* Q.You have been given a sorted array/list of integers 'arr' of size 'n' and an integer 'x'.
Find the total number of occurrences of 'x' in the array/list. */
public class Solution {
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int starting = searchstartingelement(arr,x);
        int ending = searchendingelement(arr,x);
        int count = ending - starting + 1;
        if( ending == 0 && starting == 0) return 0;
        else return count;
    }
    public static int searchstartingelement(int[] nums , int target){
        int low = 0;
        int high = nums.length-1;
        int result = 0;
        while( low<= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                result = mid;
                high = mid-1;
            }
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return result;
    }
    public static int searchendingelement(int[] nums , int target){
        int low = 0;
        int high = nums.length-1;
        int result = 0;
        while( low<= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                result = mid;
                low = mid+1;
            }
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return result;
    }
}

