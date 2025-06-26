/* Q.Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets. */

import java.util.Arrays;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0 ; i < nums.length-2 ; i++){
            if( i > 0 && nums[i] == nums[i-1] ) continue;
            int j = i+1 ;
            int k = nums.length - 1;
            while( j<k ){
                int sum = nums[i] + nums[j] + nums[k];
                if( sum > 0 ){
                    k--;
                }
                else if( sum < 0){
                    j++;
                }
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    answer.add(temp);
                    j++;
                    k--;
                    while( j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                    while( k > j && nums[k] == nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return answer;
    }
}
