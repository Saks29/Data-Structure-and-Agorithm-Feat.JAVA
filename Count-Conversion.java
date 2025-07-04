/* Q.Given an array of integers arr[]. Find the Inversion Count in the array.
Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.
Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum.*/
// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        int n = arr.length;
        return mergesortcounting( arr , 0 , n-1 );
    }
    static int mergesortcounting(int arr[] , int start , int end){
        int count = 0;
        if( start < end){
            int mid = (start + end)/2;
           count = count +  mergesortcounting( arr , start , mid);
           count = count + mergesortcounting( arr , mid+1 , end);
            count = count + merge( arr , start , mid , end);
        }
        return count;
    }
    static int merge( int[] arr, int start , int mid , int end){
        int low = start;
        int high = mid+1;
        int[] temp = new int[end - start + 1];
        int count = 0;
        int i = 0;
        while( low <= mid && high <= end){
            if(arr[low] <= arr[high]){
                temp[i] = arr[low];
                i++;
                low++;
            }
            else {
                temp[i] = arr[high];
                i++;
                high++;
                count = count + ( mid - low + 1);
            }
        }
        while( low <= mid){
            temp[i] = arr[low];
            i++;
            low++;
        }
        while( high <= end){
            temp[i] = arr[high];
            i++;
            high++;
        }
        for( int j = 0 ; j < temp.length ; j++){
            arr[start + j] = temp[j];
        }
        return count;
    }
}
