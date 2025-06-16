/* Q.You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.*/

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int negative = 1;
        int positive = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > 0){
                temp[positive] = nums[i];
                positive = positive + 2;
            }
            else{
                temp[negative] = nums[i];
                negative = negative + 2;
            }
        }
        return temp;
    }
}
