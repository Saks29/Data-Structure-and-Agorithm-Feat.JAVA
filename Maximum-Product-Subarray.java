/* Q.Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.*/
import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
        int forward= 1;
        int backward = 1;
        int answer = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i ++){
            if( forward == 0) forward = 1;
            if( backward == 0) backward = 1;
            forward *= nums[i];
            backward *= nums[ nums.length - i - 1];
            answer = Math.max( answer , Math.max(forward , backward));
        }
        return answer;
    }
}
