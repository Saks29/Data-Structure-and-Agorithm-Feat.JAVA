// Q.A mysterious parchment contains a single letter repeated N times. Given a character and a number N, write a recursive function to print that character N times in a row.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
    public void repeatChar(char ch, int N) {
      //Write Code Here
      if(N==0){
        return;
      }
      else{
        System.out.print(ch);
        repeatChar(ch,N-1);
      }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split(" ");
        char ch = input[0].charAt(0);
        int N = Integer.parseInt(input[1]);

        Solution solution = new Solution();
        solution.repeatChar(ch, N);
    }
}
