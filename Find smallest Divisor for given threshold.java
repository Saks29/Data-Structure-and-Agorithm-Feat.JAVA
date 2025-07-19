/* Q.Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.

Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).

The test cases are generated so that there will be an answer.*/
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
       int low = 1;
       int high = 0;
       int divisor = -1;
       for(int i = 0 ; i < nums.length ; i++){
         high = Math.max(high , nums[i]);
       } 
       while(low<=high){
        int mid = (low+high)/2;
        int result = findingdivisor(nums , threshold , mid);
        if( result <= threshold){
            divisor = mid ;
            high = mid-1;
        }
        else{
            low = mid+1;
        }
        
       }
       return divisor;
    }
    public int findingdivisor(int[] nums , int threshold , int mid){
        int answer = 0;
        for(int i = 0 ; i <nums.length ; i++){
            answer += Math.ceil((double)nums[i]/mid);
        }
        return answer;
    }
}
