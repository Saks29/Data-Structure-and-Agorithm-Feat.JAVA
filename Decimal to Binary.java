// Q.Given a decimal number n, return its binary equivalent.
class Solution {
    static String decToBinary(int n) {
        // code here
        if(n==0) return "0";
        String answer = "";
        while( n>0 ){
            int bit = n%2;
            answer = bit + answer;
            n = n/2;
        }
        return answer;
    }
}
