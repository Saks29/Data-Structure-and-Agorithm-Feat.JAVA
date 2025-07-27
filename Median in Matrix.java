/* Q.Given a row-wise sorted matrix having N number of rows and M number of columns. Your task is to find the median of the given matrix.
Note :Assume that the size of the matrix N*M is always odd.*/
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findMedian(int arr[][], int n, int m) {
        // Write your code here.
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                list.add(arr[i][j]);
            }
        }
        Collections.sort(list);
        int length = list.size();
        int median = length/2;
        return list.get(median);
    }
}
