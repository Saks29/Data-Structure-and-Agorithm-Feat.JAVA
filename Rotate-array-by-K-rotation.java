// Q.Given an integer array nums, rotate the array to the right by k steps, where k is non-negative. //

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int m = n-k;
        int L = 0;
        reverse(nums , L , m-1);
        reverse(nums , m , n-1);
        reverse(nums , L , n-1);
        System.out.print(nums);
    }
    public void reverse( int[] nums , int lower , int higher){
        int temp = 0 ;
        while(lower < higher){
            temp = nums[lower];
            nums[lower] = nums[higher];
            nums[higher] = temp;
            lower++;
            higher--;
        }
    }
}
