/* Q.You are given an array 'arr' having 'n' distinct integers sorted in ascending order. The array is right rotated 'r' times
Find the minimum value of 'r'.
Right rotating an array means shifting the element at 'ith' index to (‘i+1') mod 'n' index, for all 'i' from 0 to ‘n-1'. */
public class Solution {
    public static int findKRotation(int []arr){
        // Write your code here.
        for( int i =  1 ; i < arr.length ; i++){
            if( arr[i] < arr[i-1]){
                return i;
            }
        }
        return 0;
    }
}
