/* Q.Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible. */

class Solution {
    public int[] sortArray(int[] nums) {
       int left = 0;
       int right = nums.length - 1;
       mergesort(nums,left ,right);
       return nums;
    }
    public int[] mergesort(int[] nums, int left , int right){
        if(left >= right){
            return nums;
        }
        int mid = (left+right)/2;
        mergesort(nums, left , mid);
        mergesort(nums, mid+1 ,right);
        merge(nums,left,mid,right);
        return nums;
    }
    public int[] merge( int[] nums , int left , int mid , int right){
        int n1 = left ;
        int n2 = mid+1 ;
        int[] temp = new int[right - left + 1];
        int i = 0;
        while( n1<=mid && n2<=right){
            if( nums[n1] <= nums[n2]){
                temp[i] = nums[n1];
                n1++;
                i++;
            }
            else{
                temp[i] = nums[n2];
                n2++;
                i++;
            }
        }
        while(n1 <= mid){
            temp[i] = nums[n1];
            n1++;
            i++;
        }
        while(n2 <= right){
            temp[i] = nums[n2];
            n2++;
            i++;
        }
        for(int j = 0 ; j < temp.length; j++){
            nums[left + j] = temp[j];
        }
        return nums;
    }

}
