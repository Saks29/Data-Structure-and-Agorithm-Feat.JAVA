Q5.Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
      for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                continue;
            }
            else{
                count = count +1;
            }
        }
        if( count > nums.length/2){
          return nums[i]; 
        }
      }
      return -1;
    }
}
