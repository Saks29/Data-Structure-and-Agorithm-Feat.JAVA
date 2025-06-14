/* Q.Problem statement
You are given an array 'a' of size 'n' and an integer 'k'.
Find the length of the longest subarray of 'a' whose sum is equal to 'k'.*/
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int n = a.length;
        long sum = 0;
        int maxlength = 0;
        while(j<n){
            int length = 0;
            sum = sum + a[j];
            while(sum>k && i<=j){
                sum=sum-a[i];
                i++;
            }
            if(sum == k){
                length = j-i+1;
                if(length > maxlength){
                    maxlength = length;
                }
            }
            j++;
        }
        return maxlength;
    }
}
