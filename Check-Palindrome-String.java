/* Q. Determine if a given string ‘S’ is a palindrome using recursion. Return a Boolean value of true if it is a palindrome and false if it is not.

Note: You are not required to print anything, just implement the function. Example:
Input: s = "racecar"
Output: true
Explanation: "racecar" is a palindrome. */

public class Solution {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int left = 0;
        int right = str.length() - 1;
         return isPalindromeCheck(str , left , right );
        
    }
    public static boolean isPalindromeCheck(String str , int left , int right ){
        if(right <= left){
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        return isPalindromeCheck(str , left+1 , right-1 );

     }
}
