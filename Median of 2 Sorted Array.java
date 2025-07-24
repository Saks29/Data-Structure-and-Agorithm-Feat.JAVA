/* Q.Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] temp = new int[n+m];
        while( i < n && j <m){
            if(nums1[i] <= nums2[j]){
                temp[k] = nums1[i];
                k++;
                i++;
            }
            else {
                temp[k] = nums2[j];
                j++;
                k++;
            }
        }
        while( i < n ){
            temp[k] = nums1[i];
            k++;
            i++;
        }
        while( j < m){
            temp[k] = nums2[j];
            j++;
            k++;
        }
        int fulllength = temp.length;
        if( fulllength % 2 != 0){
            return (double)temp[fulllength/2];
        }
        else {
            return ((temp[fulllength/2 - 1] + temp[fulllength/2]) / 2.0);
        }
    }
}
