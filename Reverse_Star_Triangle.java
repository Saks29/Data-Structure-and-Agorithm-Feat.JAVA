/* Q.Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the Reverse N-Star Triangle.

Example:
Input: ‘N’ = 3

Output: 

*****
 ***
  *
  */

public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        int len = n;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            int m = len*2 - 1;
            for(int k = 0 ; k < m ; k++){
                System.out.print("*");
            }
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            len--;
            System.out.println("");
        }
    }
}
