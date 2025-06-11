//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missing=0;
        for(int i = 0 ; i<= n ; i++){
            missing = 0;
            for(int j = 0 ; j < n ; j++){
                if(nums[j] == i){
                    missing = 1;
                    continue;
                }
            }
            if(missing == 0){
                missing = i;
                break;
            }
        }
        return missing;
    }
}
