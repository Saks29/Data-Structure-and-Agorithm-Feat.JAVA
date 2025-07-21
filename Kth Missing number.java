/* Q.Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.*/
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            int missingnumber = arr[mid] - (mid + 1);
            if( missingnumber < k){
                low=  mid + 1;
            }
            else{
                high = mid  - 1;
            }
        }
        return high + k + 1;
    }
}
