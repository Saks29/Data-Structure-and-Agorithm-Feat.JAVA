/*You are given an integer ‘NUM’ . Your task is to find out whether this number is an Armstrong number or not.

A k-digit number ‘NUM’ is an Armstrong number if and only if the k-th power of each digit sums to ‘NUM’.*/

import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean isArmstrong(int num)
	{
	    // wrtie your code here;
		long sum = 0;
		long n = num;
		while(n!=0){
			long LastDigit = n % 10 ;
	        sum = sum + (LastDigit*LastDigit*LastDigit);
			n = n/10;
		}
		return (sum == num);
	}
}

