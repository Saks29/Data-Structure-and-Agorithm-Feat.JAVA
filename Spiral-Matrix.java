// Q.Given an m x n matrix, return all elements of the matrix in spiral order.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralorder = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = m-1;
        int top = 0;
        int bottom = n-1;
        while( top <= bottom && left<= right){
            //left to right
            for(int i = top ; i <= right ; i++){
                spiralorder.add(matrix[top][i]);
            }
            top++;
            //top to bottom
            for(int i = top ; i <= bottom ; i++){
                spiralorder.add(matrix[i][right]);
            }
            right--;
            //right to left
            if(top<=bottom){
                for(int i = right ; i>=left ; i--){
                    spiralorder.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //bottom to up
            if(left<=right){
                for(int i = bottom; i>=top ; i--){
                    spiralorder.add(matrix[i][left]);
                }
                left++;
            }
        }
        return spiralorder;
    }
}
