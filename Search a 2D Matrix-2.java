/* Q.Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom. */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        if(n == 0) return false;
        int m = matrix[0].length;
        if(m == 0) return false;

        int row = 0;
        int col = m-1;
        while( row < n  && col >= 0){
            if( matrix[row][col] == target ){
                return true;
            }
            else if( matrix[row][col] > target){
                if( binarysearch_row( matrix , row , col , target ) == true){
                    return true;
                }
            }
            else {
                if( binarysearch_col( matrix , row , col , target ) == true){
                    return true;
                }
            }
            row++;
            col--;
        }
        return false;
    }
    public boolean binarysearch_row( int[][] matrix , int row , int col , int target ){
        int low = 0 ;
        int high = col-1;
        while(low <= high){
            int mid = (low+high)/2;
            if( matrix[row][mid] == target) return true;
            else if( matrix[row][mid] < target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
    public boolean binarysearch_col(int[][] matrix ,int row , int col , int target ){
        int low = row + 1;
        int high = matrix.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if( matrix[mid][col] == target) return true;
            else if( matrix[mid][col] < target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}
 
