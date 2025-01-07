/* Q. Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.*/

class Solution {
    public int reverse(int x) {
        int ReverseNumber = 0;
        while(x != 0){
            int LastDigit = x % 10 ;
            if(ReverseNumber<Integer.MIN_VALUE/10 || ReverseNumber >Integer.MAX_VALUE/10){
                return 0;
            }
            ReverseNumber = ReverseNumber*10 + LastDigit;
            x = x/10;
        }
        return ReverseNumber;
    }
}
