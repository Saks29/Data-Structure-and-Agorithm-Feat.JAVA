/* Q.You are given an integer array bloomDay, an integer m and an integer k.
You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.
The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.
Return the minimum number of days you need to wait to be able to make m bouquets from the garden. If it is impossible to make m bouquets return -1
*/
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        int result = -1;
        if( bloomDay.length < m*k) return -1;
        for(int i = 0 ; i < bloomDay.length ; i++){
            low = Math.min( low , bloomDay[i]);
            high = Math.max( high , bloomDay[i]);
        }
        while(low <= high){
            int mid = (low+high)/2;
            int totalbouquet = countbouquet(bloomDay , mid , k);
            
            if( totalbouquet >= m){
                result = mid;
                high = mid -1;
            }
            else low = mid+1;
        }
        return result;
    }
    public int countbouquet(int[] bloomDay , int mid , int k){
        int sum = 0;
        int bouquet = 0;
        for(int i = 0 ; i < bloomDay.length ; i++){
            if( bloomDay[i] <= mid){
                sum += 1;
                if( sum == k){
                    bouquet ++;
                    sum = 0;
                }
            }
            else{
                sum = 0;
            }
        }
        return bouquet;
    }
}
