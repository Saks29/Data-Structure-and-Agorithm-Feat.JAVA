/* Q.Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int starting = searchstartingelement(nums,target);
        int ending = searchendingelement(nums,target);
        return new int[]{starting , ending};
    }
    public int searchstartingelement(int[] nums , int target){
        int low = 0;
        int high = nums.length-1;
        int result = -1;
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
    public int searchendingelement(int[] nums , int target){
        int low = 0;
        int high = nums.length-1;
        int result = -1;
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
