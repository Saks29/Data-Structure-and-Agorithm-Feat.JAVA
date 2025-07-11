/* Q.Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int lower = 0;
        int high = nums.length - 1;
        int answer = nums.length ;
        while(lower <= high){
            int mid = (lower+high)/2;
            if( nums[mid] >= target){
                answer = mid;
                high = mid-1;
            }
            else{
                lower = mid+1;
            }
        }
        return answer;
    }
}
