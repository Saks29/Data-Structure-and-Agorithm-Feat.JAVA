//Q.Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

import java.util.HashMap;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        int length = nums.length;
        int required = length/3;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i = 0; i < length ; i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry : freq.entrySet()){
            if(entry.getValue() > required){
                answer.add(entry.getKey());
            }
        }
        return answer;
    }
}
