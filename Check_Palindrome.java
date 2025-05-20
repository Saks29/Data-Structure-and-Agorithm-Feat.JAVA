// Q.Given an integer x, return true if x is a palindrome, and false otherwise.

class Solution {
    public boolean isPalindrome(int x) {
        int Rev = 0 ;
        int num = x;
        while(num>0){
        Rev = Rev*10 + (num%10);
        num/=10;
        }
        if(Rev == x){
            return true ;
        }
        else{
            return false ;
        }
    }
}
