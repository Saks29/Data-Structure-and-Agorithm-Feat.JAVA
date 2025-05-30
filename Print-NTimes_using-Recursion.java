/* Q. Given an positive integer n, print numbers from 1 to n without using loops.

Implement the function printTillN() to print the numbers from 1 to n as space-separated integers. */

class Solution {
    static void printTillN(int N) {
        // code here
        if(N<1){
            return ;
        }
        else {
        printTillN(N-1);
        System.out.print(N+" ");
        }
    }
}
