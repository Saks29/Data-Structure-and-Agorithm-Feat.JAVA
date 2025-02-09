/*Q. The Lost Page Numbers

Problem Statement:
A book contains N pages, but a few pages were torn out. A scribe is listing all remaining page numbers from 1 to N.

Write a recursive function to print all numbers from 1 to N but skip a given forbidden page F.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public void printPages(int current, int N, int F) {
       //Write Code Here
       if(current > N){
        return;
       }
       else{
        if(current != F){
            System.out.print(current + " ");
        }
        printPages(current+1,N,F);
       }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split(" ");
        int N = Integer.parseInt(input[0]);
        int F = Integer.parseInt(input[1]);

        Solution solution = new Solution();
        solution.printPages(1, N, F);
    }
}
