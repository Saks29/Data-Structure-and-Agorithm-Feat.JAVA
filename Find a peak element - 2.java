/* Q.A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbors to the left, right, top, and bottom.
Given a 0-indexed m x n matrix mat where no two adjacent cells are equal, find any peak element mat[i][j] and return the length 2 array [i,j].
You may assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.
You must write an algorithm that runs in O(m log(n)) or O(n log(m)) time.*/
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m-1;
        while(low<=high){
            int mid = (low + high)/2;
            int row = maximumvalue( mat , mid , n);
            int right = -1;
            int left  = -1;
            if( mid != 0 ) left = mat[row][mid-1];
            if( mid != m-1 ) right = mat[row][mid+1];
            if( mat[row][mid] > left && mat[row][mid] > right){
                return new int[]{ row , mid};
            }
            else if( mat[row][mid] < left) high = mid-1;
            else if( mat[row][mid] < right) low = mid+1;
        }
        return new int[]{-1,-1};
    }
    public int maximumvalue(int[][] mat , int mid , int n){
        int max = -1;
        int result = 0;
        for(int i= 0 ; i < n ; i++){
            if( mat[i][mid] > max){
                max = mat[i][mid];
                result  = i;
            }
        }
        return result;
    }
}
