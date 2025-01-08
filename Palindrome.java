/* Problem statement
Check whether a given number ’n’ is a palindrome number.
Note :
Palindrome numbers are the numbers that don't change when reversed.
You don’t need to print anything. Just implement the given function. */

public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        if (n == 0) {
            return true;
        }
        int ReverseNumber = 0;
        int temp = n;
		while(temp != 0){
			int LastDigit = n % 10 ;
			ReverseNumber = (ReverseNumber*10) + LastDigit ;
			temp = temp/10;
		}
        return (ReverseNumber!= temp);
    }
    
}
