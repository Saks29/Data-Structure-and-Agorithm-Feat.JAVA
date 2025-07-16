/* Q.A peak element is an element that is strictly greater than its neighbors.
Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
You must write an algorithm that runs in O(log n) time. */
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 1;
        int high = n-2;
        if( n == 1) return 0;
        if( nums[0] > nums[1] && n>1) return 0;
        if( nums[n-1] > nums[n-2]) return n-1;
        return binarySearch( nums , low , high);
    }
    public int binarySearch( int[] nums , int low , int high){
        while(low<=high){
            int mid = (low+high)/2;
            if( nums[mid] > nums[mid-1] && nums[mid]  > nums[mid+1]){
                return mid;
            }
            else if( nums[mid] < nums[mid+1]){
                return binarySearch(nums,mid+1,high);
            }
            else return binarySearch( nums , low , mid-1);
        }
        return -1;
    }
}
