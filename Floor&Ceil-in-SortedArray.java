/* Q.You're given a sorted array 'a' of 'n' integers and an integer 'x'.
Find the floor and ceiling of 'x' in 'a[0..n-1]'. */
import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int lower = 0;
      int high = n-1;
      int ceil = -1;
      int floor = -1;
      while(lower<=high){
        int mid = (lower+high)/2;
        if(a[mid] == x){
          return new int[]{x,x};
        }
        else if( a[mid] > x){
          ceil = a[mid];
          high = mid-1;
        }
        else{
          floor = a[mid];
          lower = mid+1;
        }
      }
      return new int[]{floor,ceil};
    }
    
}
