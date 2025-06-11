/* Q.Given an array, arr of n integers, and an integer element x, find whether element x is present in the array. Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.*/

class Solution {

    static int search(int arr[], int x) {

        // Your code here
        int n = arr.length;
        int found = -1;
        for(int i = 0 ; i < n ;i++){
            if(arr[i] == x){
                found = i ;
                break;
            }
        }
        return found;
    }
}
