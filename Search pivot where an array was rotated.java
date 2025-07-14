/* Q.There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might
be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
  class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length ;
        int result = -1;
        if(nums[0] == target){
            result = 0;
        }
        for(int i = 1 ; i < n ; i++ ){
            if(nums[i] == target){
                result = i;
                break;
            }
        }
        return result;
    }
}
