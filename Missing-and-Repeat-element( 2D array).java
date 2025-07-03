/* Q.You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. Each integer appears exactly once except a which appears twice and b which is missing. The task is to find the repeating and missing numbers a and b.

Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.*/
import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] temp = new int[row*col ];
        int[] result = new int[2];
        int missing = -1;
        int repeat = -1;
        int k = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                temp[k++] = grid[i][j];
            }
        }
        Arrays.sort(temp);
        for(int i = 1 ; i < temp.length ; i++){
            if( temp[i] == temp[i-1]){
                repeat = temp[i];
            }
            else if( temp[i] != temp[i-1] + 1){
                missing = temp[i-1]+1;
            }
        }
        if( temp[0] != 1){
            missing = 1;
        }
        if( missing == -1){
            missing = temp.length;
        }
        result[0] = repeat;
        result[1] = missing;
        return result;
    }
}
