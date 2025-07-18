/* Q.Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.*/
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxelement = 0;
        int result = 0;
        for(int i = 0 ; i < piles.length ; i++ ){
            if( piles[i] > maxelement) maxelement = piles[i];
        }
        int low = 1 ;
        int high = maxelement;
        while(low <= high){
            int mid = (low + high)/2;
            int time = timerequired ( piles , mid);

            if( time <= h ){
                high = mid-1;
                result = mid ;
            }
            else low = mid + 1;
        }
        return result;
    }
    public int timerequired(int[] piles , int mid){
        int sum = 0;
        for(int i = 0 ; i < piles.length ; i++){
            sum += Math.ceil( (double)(piles[i])/(double)(mid));
        }
        return sum;
    }
}
