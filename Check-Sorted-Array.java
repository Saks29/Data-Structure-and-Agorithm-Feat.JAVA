/* Q.Problem statement
You have been given an array ‘a’ of ‘n’ non-negative integers.You have to check whether the given array is sorted in the non-decreasing order or not.



Your task is to return 1 if the given array is sorted. Else, return 0. */
public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        int flag = 1;
        for(int i = 0 ; i<n-1 ; i++){
            if(a[i]>a[i+1]){
                flag = 0;
                break;
            }
        }
        return flag;
    }
}
