/* Q.Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice. */
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int []temp = new int[2];
        HashMap <Integer , Integer> Map = new HashMap<>();
        for(int i = 0 ; i < n ;i++){
            int remaining = target - nums[i];
            if( Map.containsKey(remaining)){
                temp[0] = i;
                temp[1] = Map.get(remaining);
                break;
            }
            Map.put(nums[i] , i);
        }
        return temp;
    }
}
