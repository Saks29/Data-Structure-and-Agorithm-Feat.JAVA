/* Q.You are given an unsorted array/list 'ARR' of 'N' integers. Your task is to return the length of the longest consecutive sequence.

The consecutive sequence is in the form ['NUM', 'NUM' + 1, 'NUM' + 2, ..., 'NUM' + L] where 'NUM' is the starting integer of the sequence and 'L' + 1 is the length of the sequence.

Note:

If there are any duplicates in the given array we will count only one of them in the consecutive sequence. */
import java.io.*;
import java.util.* ;
import java.util.Arrays;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        Arrays.sort(arr);
        int longestlength = 1;
        int length = 1;
        for(int i = 1 ; i < N ; i++){
            if(arr[i] == arr[i-1] + 1){
                length++;
            }
            else if(arr[i] == arr[i-1]){
                continue;
            }
            else{
                length = 1;
            }
            if(length > longestlength){
                longestlength = length ;
            }
        }
        return longestlength;
    }
}
