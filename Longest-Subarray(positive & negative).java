/* Q.Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. If there is no subarray with sum equal to k, return 0.*/
// User function Template for Java
import java.util.Map;
import java.util.HashMap;
import java.util.*;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        Map<Long , Integer> Cumalitive = new HashMap<>();
        long sum = 0;
        int maxlen = 0;
        for(int i = 0 ; i<n ; i++){
            sum = sum + arr[i];
            if(sum==k){
                maxlen = Math.max(maxlen , i+1);
            }
            long remainder = sum - k;
            
            if(Cumalitive.containsKey(remainder)){
                int length = i - Cumalitive.get(remainder);
                maxlen = Math.max(length , maxlen);
            }
            if(!Cumalitive.containsKey(remainder)){
                Cumalitive.put(sum,i);
            }
        }
        return maxlen;
    }
}
