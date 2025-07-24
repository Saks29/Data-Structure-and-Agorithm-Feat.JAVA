/* Q.Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum count of ones, and the number of ones in that row.

In case there are multiple rows that have the maximum count of ones, the row with the smallest row number should be selected.

Return an array containing the index of the row, and the number of ones in it.*/
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int maxcount = 0;
        int row = 0;

        int i = 0; // row
        int j = 0; // column
        int count = 0;

        while (i < n) {
            // Add current cell value to count
            count += mat[i][j];

            // If we reach end of the current row
            if (j == m - 1) {
                if (count > maxcount) {
                    maxcount = count;
                    row = i;
                }

                // Move to next row
                i++;
                j = 0;
                count = 0; // Reset count for the new row
            } else {
                // Move to next column
                j++;
            }
        }

        return new int[]{row, maxcount};
    }
}
