// Q.The task is to complete the insertsort() function which is used to implement Insertion Sort. 

class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int n = arr.length;
        for(int i = 1 ; i<n ; i++){
            while(i>0){
                if(arr[i]< arr[i-1]){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]= temp;
                    i--;
                }
                else{
                    break;
                }
            }
        }
    }
}
