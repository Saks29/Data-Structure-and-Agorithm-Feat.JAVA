/* Q.You are given an array arr[] of integers, where each element arr[i]
represents the number of pages in the ith book. You also have an integer k representing the number of students. The task is to allocate books to each student such that:
Each student receives atleast one book.
Each student is assigned a contiguous sequence of books.
No book is assigned to more than one student.
The objective is to minimize the maximum number of pages assigned to any student. In other words, out of all possible allocations, find the arrangement where the student who receives the 
most pages still has the smallest possible maximum. */

//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if( k > n) return -1;
        int sum = 0;
        int max = 0;
        for(int i = 0 ; i < n ; i ++){
            sum += arr[i];
            max = Math.max( max , arr[i]);
        }
        int low = max;
        int high = sum;
        int result = -1;
        while(low<=high){
            int mid = (low + high)/2;
            int students = numberofstudents( arr , mid);
            if( students > k ){
                low = mid +1;
            }
            else{
                result = mid;   
                high = mid -1;
            }
        }
        return result;
    }
    public static int numberofstudents(int[] arr , int mid){
        int total = 1;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            if( sum > mid){
                total++;
                sum = arr[i];
            }
        }
        return total;
    }
}
