/* Q.You are given an integer ‘NUM’ . Your task is to find out whether this number is an Armstrong number or not.

A k-digit number ‘NUM’ is an Armstrong number if and only if the k-th power of each digit sums to ‘NUM’.

Example
153 = 1^3 + 5^3 + 3^3. */

import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean isArmstrong(int num)
	{
	    // wrtie your code here;
		int count = 0;
		int x=num;
		int Sum = 0;
		while(x>0){
			count ++;
			x/=10;
		}
		int y = num;
		while( y > 0){
			int n = y%10;
			int pow = 1;
			for(int i = 0 ; i < count ; i ++){
				pow = pow*n;
			}
			Sum = Sum + pow;
			y=y/10;

		}
		if(Sum == num){
			return true ;
		}
		else{
			return false;
		}
	}
}

