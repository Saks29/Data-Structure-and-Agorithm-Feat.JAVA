/* Q.You are given an array 'arr' consisting of 'n' integers which denote the position of a stall.
You are also given an integer 'k' which denotes the number of aggressive cows.
You are given the task of assigning stalls to 'k' cows such that the minimum distance between any two of them is the maximum possible.
Print the maximum possible minimum distance. */
import java.util.Arrays;
public class Solution {
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1 ;
        int high = stalls[n-1] - stalls[0];
        int result = 0;
        while(low <= high){
            int mid = (low+high)/2;
            boolean distance = minimumdistance( stalls , k , mid , n );
            if(distance == true){
                result = mid;
                low = mid+1;
            }
            else if( distance == false){
                high = mid - 1;
            }
        }
        return result;
    }
    public static boolean minimumdistance(int[] stalls , int k , int mid , int n){
        int count = 1;
        int lastcow = 0;
        for(int i = 1 ; i < n ; i++){
            if( stalls[i] - stalls[lastcow] >= mid){
                lastcow = i;
                count ++;
            }
            if(count == k){
                return true;
            }
        }
        return false;
    }
}
