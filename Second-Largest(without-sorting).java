/* Q.Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element. */

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int largest = -1;
        int Secondlargest = -1;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > largest){
                Secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest){
                if(arr[i] > Secondlargest){
                    Secondlargest = arr[i];
                }
            }
        }
        return Secondlargest;
    }
}
