/* Q.Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.*/
class Solution {
    public int splitArray(int[] nums, int k) {
        return findPages( nums , k);
    }
    public static int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if( k > n) return -1;
        int sum = 0;
        int max = 0;
        for(int i = 0 ; i < n ; i ++){
            sum += arr[i];
            max = Math.max( max , arr[i]);
        }
        int low = max;
        int high = sum;
        int result = -1;
        while(low<=high){
            int mid = (low + high)/2;
            int students = numberofstudents( arr , mid);
            if( students > k ){
                low = mid +1;
            }
            else{
                result = mid;   
                high = mid -1;
            }
        }
        return result;
    }
    public static int numberofstudents(int[] arr , int mid){
        int total = 1;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            if( sum > mid){
                total++;
                sum = arr[i];
            }
        }
        return total;
    }
}
