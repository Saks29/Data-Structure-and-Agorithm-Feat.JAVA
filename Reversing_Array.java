// Q.ou are given an array of integers arr[]. Your task is to reverse the given array.

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length ;
        int ReverseArray[] = new int[n];
        
        for(int i = 0 ; i < n ; i ++){
            ReverseArray[i] = arr[n-i-1];
        }
        
        for ( int i = 0 ; i < n ; i++){
            arr[i] = ReverseArray[i];
        }
    }
}
