/* Q.Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array. */
import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {
      int n = nums.length;
      int count = 0;
      HashMap <Integer , Integer> presumfun = new HashMap<>();
      presumfun.put(0,1);
      int sum = 0;
      for(int i = 0 ; i < n ; i++){
         sum = sum + nums[i];
         int rem = sum-k ;
         if(presumfun.containsKey(rem)){
             count = count + presumfun.get(rem);
            }
            presumfun.put( sum , presumfun.getOrDefault(sum,0) + 1);
        }
        return count;
    }
}
