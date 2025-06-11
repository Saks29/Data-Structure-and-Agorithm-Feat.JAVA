/*Q.Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array. */

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int n = nums.length ;
        int pointer = 0;
        while(i < n){
            if(nums[i] != 0){
                nums[pointer] = nums[i];
                pointer++;
            }
            i++;
        }
        while(pointer < n){
            nums[pointer] = 0;
            pointer++;
        }
        System.out.print(nums);
    }
}
