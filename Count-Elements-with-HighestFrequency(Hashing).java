/* Q.You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array. */

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        return frequency( nums , n);
    }
    public int frequency(int[] nums , int n){
        HashMap<Integer , Integer> occurence = new HashMap<>();
         for(int i = 0 ; i < n ; i++){
            if( occurence.containsKey(nums[i])){
                occurence.put(nums[i],occurence.get(nums[i])+1);
            }
            else{
                occurence.put(nums[i],1);
            }
        }
        int Maximum = 0;
        for(Map.Entry<Integer , Integer> entry : occurence.entrySet()){
            if(entry.getValue() > Maximum){
                Maximum = entry.getValue();
            }
        }
        int MaxFrequency = 0;
        for(Map.Entry<Integer , Integer> entry : occurence.entrySet()){
            if(entry.getValue() == Maximum){
               MaxFrequency += entry.getValue() ;
            }
        }
        return MaxFrequency ;
    }
}
