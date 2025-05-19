/*Q. Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Triangle.

Example:
Input: ‘N’ = 3

Output: 

  *
 ***
***** */
for (int i = 0 ; i < n ; i++){
            for ( int j =0 ; j < n-1 ; j++){
                System.out.print(" ");
            }
            int m = 2*i + 1;
            for(int j = 0 ; j < m ; j++){
                System.out.print("*");
            }
            for ( int j =0 ; j < n-1 ; j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
