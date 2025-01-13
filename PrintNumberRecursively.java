// Q. Print numbers from 1 to n without the help of loops. You only need to complete the function printNos() that takes n as a parameter and prints the number from 1 to n recursively.

class Solution {

    public void printNos(int n) {
        // Your code here
        
        if ( n == 0){
            return;
        }
        
        printNos( n-1);
        System.out.print(n + " ");
    }
}
