/* Q.Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0.

 

Example 1:

Input: num = 7
Output: 1
Explanation: 7 divides itself, hence the answer is 1. */

class Solution {
    public int countDigits(int num) {
        int sum = 0;
        int number = num;
        while(number>0){
            int n = number%10;
            if(num%n==0){
                sum++;
            }
            number=number/10;
        }
        return sum;
    }
}
