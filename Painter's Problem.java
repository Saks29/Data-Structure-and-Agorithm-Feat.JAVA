/* Q.Given an array/list of length ‘n’, where the array/list represents the boards and each element
of the given array/list represents the length of each board. Some ‘k’ numbers of painters are available to paint 
these boards. Consider that each unit of a board takes 1 unit of time to paint.
You are supposed to return the area of the minimum time to get this job done of painting all the ‘n’ boards under a constraint that any painter will only 
paint the continuous sections of boards. */
import java.util.ArrayList;

public class Solution 
{
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        return findPages( boards , k);
    }
    public static int findPages(ArrayList<Integer> arr, int k) {
        // code here
        int n = arr.size();
        if( k > n) return -1;
        int sum = 0;
        int max = 0;
        for(int i = 0 ; i < n ; i ++){
            sum += arr.get(i);
            max = Math.max( max , arr.get(i));
        }
        int low = max;
        int high = sum;
        int result = -1;
        while(low<=high){
            int mid = (low + high)/2;
            int students = numberofstudents( arr , mid);
            if( students > k ){
                low = mid +1;
            }
            else{
                result = mid;   
                high = mid -1;
            }
        }
        return result;
    }
    public static int numberofstudents(ArrayList<Integer> arr , int mid){
        int total = 1;
        int sum = 0;
        for(int i = 0 ; i < arr.size() ; i++){
            sum += arr.get(i);
            if( sum > mid){
                total++;
                sum = arr.get(i);
            }
        }
        return total;
    }
}
