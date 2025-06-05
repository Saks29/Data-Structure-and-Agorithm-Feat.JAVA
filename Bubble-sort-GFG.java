// Q.Given an array, arr[]. Sort the array using bubble sort algorithm.

class Solution {
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) {
        // code here
        int n = arr.length;
        for(int i = n-1 ; i > 0 ; i--){
            int SwapCount = 0;
            for(int j = 0 ; j < i ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    SwapCount ++;
                }
            }
            if(SwapCount==0){
                break;
            }
        }
    }
}
