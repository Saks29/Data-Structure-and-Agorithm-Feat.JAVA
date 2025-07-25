/* Q.You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = n-1;
        int i = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(matrix[mid][0] == target){
                return true; 
            }
            else if( matrix[mid][0] < target){
                i = mid; 
                low = mid+1;

            }
            else high = mid-1;
        }
        if(i == -1) return false;
        low = 0;
        high = m-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(matrix[i][mid] == target){
                return true; 
            }
            else if( matrix[i][mid] < target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}
