/* Q.Given an array arr[] containing both positive and negative integers, the task is to find the length of the largest subarray with a sum equal to 0. */

import java.util.HashMap;

class Solution {
    int maxLen(int arr[]) {
        // code here
        HashMap< Integer , Integer >presum = new HashMap<>();
        int maxlen = 0;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            int len = 0;
            if( sum == 0){
                maxlen = i+1;
            }
            else if( presum.containsKey(sum)){
                len = i - presum.get(sum) ;
                if( len > maxlen){
                    maxlen = len;
                }
            }
            else if( !presum.containsKey(sum)){
                presum.put(sum , i);
            }
        }
        return maxlen;
    }
}
