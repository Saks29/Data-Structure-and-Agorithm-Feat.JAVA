/* Q.Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.*/
import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int half = n/2;
        int answer = 0 ;
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1);
                continue;
            }
            map.put(nums[i] , 1);
        }
        for(int j = 0 ; j < n ; j++){
            if(map.get(nums[j]) > half) {
                answer = nums[j];
                break;
            }
        }
        return answer;
    }
}
