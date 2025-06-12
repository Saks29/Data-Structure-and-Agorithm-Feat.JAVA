// Q.Given a binary array nums, return the maximum number of consecutive 1's in the array.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0; 
        int frequency = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                count=0;
            }
            else{
                count++;
            }
            if ( count > frequency){
                frequency = count ;
            }

        }
        return frequency;
    }
}
