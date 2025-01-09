/* You are given a natural number ‘N’. Find all the divisors of the number ‘N’. Print them in increasing order.*/

import java.io.*;

import java.util.* ;
 

import java.util.*;

public class Solution {
	public static ArrayList<Integer> getAllDivisors(int n){
	 // Write your code here.
	 ArrayList<Integer> list = new ArrayList<>();
	 for(int i=1;i*i<=n;i++){
	   if(n%i == 0){
	     list.add(i);
	      if (i != n / i) { 
           list.add(n / i);}
	   }
	  } 
	  list.sort(null);  
	  return list;
   }
	
}
