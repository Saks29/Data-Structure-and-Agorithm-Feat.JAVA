/* Q.Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space. */
class Solution {
    public int singleNumber(int[] nums) {
        int XOR = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            XOR = XOR ^ nums[i];
        }
        return XOR;
    }
}
