/* Q.A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.*/
class Solution {
    public void nextPermutation(int[] nums) {
        int breakpoint = -1 ;
        int[] temp = new int[nums.length];
        for(int i = nums.length - 2 ; i >=0 ; i--){
            if(nums[i] < nums[i+1]){
                breakpoint = i;
                break;
            }
        }
        if(breakpoint == -1){
            int a = 0;
            for(int m = nums.length-1 ; m >=0 ; m--){
                temp[a] = nums[m];
                a++;
            }
        }
        else{
            for(int j = nums.length -1 ; j >= 0 ; j--){
                if(nums[j] > nums[breakpoint]){
                    int swap  = nums[j];
                    nums[j] = nums[breakpoint];
                    nums[breakpoint] = swap;
                    break;
                }
            }
            int b = 0;
            for(int k = 0; k <= breakpoint ; k++){
                temp[b] = nums[k];
                b++;
            }
            for(int l = nums.length-1 ; l>=breakpoint + 1 ;l--){
                temp[b] = nums[l];
                b++;
            }
        }
        for(int c = 0 ; c < temp.length ; c++){
            nums[c] = temp[c];
        }
    }
}
