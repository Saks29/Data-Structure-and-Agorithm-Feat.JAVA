/* Q.Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.*/

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
         bubblesort( nums , n );
    }
    public void bubblesort ( int[] nums , int n){
        if(n==1){
            return;
        }
        int count = 0;
        for(int i = 0 ; i < n-1 ; i++){
            if(nums[i] > nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
                count++;
            }
        }
        if(count == 0){
            return;
        }
        bubblesort(nums,n-1);
    }
}
