/* Q.You're given two sorted arrays 'arr1' and 'arr2' of size 'n' and 'm' respectively and an element 'k'.
Find the element that would be at the 'kth' position of the combined sorted array.
Position 'k' is given according to 1 - based indexing, but arrays 'arr1' and 'arr2' are using 0 - based indexing. */
import java.util.ArrayList;
public class Solution {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        // Write your coder here
        return findMedianSortedArrays(arr1 , arr2 , n , m , k);
    }
    public static int findMedianSortedArrays(ArrayList<Integer> nums1, ArrayList<Integer> nums2, int n, int m, int k) {
        int i = 0;
        int j = 0;
        int l = 0;
        int[] temp = new int[n+m];
        while( i < n && j < m){
            if(nums1.get(i) <= nums2.get(j)){
                temp[l] = nums1.get(i);
                l++;
                i++;
            }
            else {
                temp[l] = nums2.get(j);
                j++;
                l++;
            }
        }
        while( i < n ){
            temp[l] = nums1.get(i);
            l++;
            i++;
        }
        while( j < m){
            temp[l] = nums2.get(j);
            j++;
            l++;
        }
        return temp[k-1];
    }
}
