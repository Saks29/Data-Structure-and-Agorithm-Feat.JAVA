/* Q.Given an array ‘A’ consisting of ‘N’ integers and an integer ‘B’, find the number of subarrays of array ‘A’ whose bitwise XOR( ⊕ ) of all elements is equal to ‘B’.
A subarray of an array is obtained by removing some(zero or more) elements from the front and back of the array. */
public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int sum = 0;
        for(int i = 0 ; i < a.length ; i ++){
            int xor = a[i];
            if( xor == b){
                sum++;
            }
            for(int j = i+1 ; j < a.length ; j++){
                xor ^= a[j];
                if( xor == b){
                    sum++;
                }
            }
        }
        return sum;
    }
}
