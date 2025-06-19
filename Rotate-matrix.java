/* Q.You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 */
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [][] temp = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m; j++){
                int row = j;
                int col = m-i-1;
                temp[row][col] = matrix[i][j];
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j< m ;j++) matrix[i][j] = temp[i][j];
        }
    }
}
