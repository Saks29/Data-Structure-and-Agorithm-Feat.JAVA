/* Q.Given an integer array nums, find the subarray with the largest sum, and return its sum. */
import java.util.Arrays;
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++ ){
            sum += nums[i];
            if(sum < 1){
                sum = 0;
            }
            if( sum > max ){
                max = sum;
            }
        }
        if(max < 1){
            int maxi = Integer.MIN_VALUE ;
           for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] > maxi){
                maxi = nums[j];
            }
            max = maxi;
           }
        }
        return max;
    }
}
