// Q.Print GFG n times without the loop.

class Solution {

    void printGfg(int N) {
        // code here
        if(N < 1){
            return;
        }
        System.out.print("GFG ");
        printGfg( N-1);
    }
}
