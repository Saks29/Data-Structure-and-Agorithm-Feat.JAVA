/* Q.A conveyor belt has packages that must be shipped from one port to another within days days.
The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.
Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.*/
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int sum = 0;
        int maximum = 0;
        for(int i = 0 ; i < n ; i ++){
            maximum = Math.max(maximum , weights[i]);
            sum += weights[i];
        }
        int low = maximum;
        int high = sum;
        int result = sum;
        while(low<=high){
            int mid = (low+high)/2;
            int daysrequired = daysrequired(weights , mid );
            if( daysrequired <= days){
                result = mid;
                high = mid-1;
            } 
            else low = mid+1;      
        }
        return result;
    }
    public int daysrequired(int[] weights , int mid){
        int sum = 0;
        int capacity = mid;
        int dayscount = 1 ;
        for(int i = 0; i < weights.length ; i++){
            if( sum + weights[i] > capacity){
                dayscount++ ;
                sum = weights[i];
            }
            else{
                sum += weights[i];
            }
        }
        return dayscount;
    }
}
