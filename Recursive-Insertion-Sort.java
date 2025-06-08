/* Q.You are given ‘N’ integers in the form of an array ‘ARR’. Print the sorted array using the insertion sort.

Note :
No need to return anything. You should sort the array in-place.
For example :
Let ‘ARR’ be: [1, 4, 2]
The sorted array will be: [1, 2, 4]. */
import java.util.* ;
import java.io.*; 

public class Solution {

	public static void insertionSort(int n , int[] arr) {
		// Write your code here.
		int length = n-1;
		int i=1;
		RecursiveInsertion( arr , length , i );
	}
	public static void RecursiveInsertion(int[] arr , int length , int i ){
		if(i>length){
			return;
		}
		int j = i - 1 ;
		int key = arr[i];
		while( j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = key;
		RecursiveInsertion(arr , length , i+1);
	}
}
