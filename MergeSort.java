//Given an array arr[], its starting position l and its ending position r. Sort the array using the merge sort algorithm.

class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if( l >= r){
            return;
        }
        else{
        int mid = (l+r)/2;
        mergeSort(arr , l , mid);
        mergeSort(arr, mid+1 , r);
        merge(arr , l , mid , r);
        }
    }
    
    void merge(int[] arr , int l , int mid ,int r){
        int i = 0;
        int temp[] = new int[r-l+1];
        int left = l;
        int right = mid+1;
        while( left <= mid && right <= r){
            if(arr[left]<= arr[right]){
                temp[i] = arr[left];
                i++;
                left ++ ; 
            }
            else{
                temp[i] = arr[right];
                i++ ; 
                right ++;
            }
        }
        while(left <= mid){
            temp[i] = arr[left];
            i++;
            left++;
        }
        while(right <= r){
            temp[i] = arr[right];
            i++;
            right++;
            
        }
        for( int j=0;j<temp.length;j++){
            arr[l+j]= temp[j];
        }
    }
}
