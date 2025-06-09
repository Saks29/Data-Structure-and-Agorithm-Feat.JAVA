/* Q.Implement Quick Sort, a Divide and Conquer algorithm, to sort an array, arr[] in ascending order. Given an array, arr[], with starting index low and ending index high, complete the functions partition() and quickSort(). Use the last element as the pivot so that all elements less than or equal to the pivot come before it, and elements greater than the pivot follow it.*/
class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(high<=low){
            return;
        }
        int part_index = partition(arr,low,high);
        quickSort(arr , low , part_index - 1);
        quickSort(arr , part_index + 1 , high);
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low ;
        int j = high ;
        while(i<j){
            while(arr[i]< pivot && i<= high-1){
                i++;
            }
            while(arr[j]>= pivot && j>= low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
}
