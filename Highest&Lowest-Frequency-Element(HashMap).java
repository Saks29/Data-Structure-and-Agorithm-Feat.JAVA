/* Q.Given an array 'v' of 'n' numbers.
Your task is to find and return the highest and lowest frequency elements.
If there are multiple elements that have the highest frequency or lowest frequency, pick the smallest element. */

import java.util.Map;
import java.util.HashMap;
public class Solution {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        int l = v.length;
        return FindFrequency(v,l);
    }

    public static int[] FindFrequency(int[]v,int l){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i <l ; i++){
            map.put(v[i],map.getOrDefault(v[i],0)+1);
        }
        int MinFreq = l;
        int Low = Integer.MAX_VALUE;
        int MaxFreq = 0;
        int High = 0;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int Value = entry.getValue();
            int Key = entry.getKey();

            if( Value < MinFreq || Value == MinFreq && Key < Low ){
                MinFreq = Value;
                Low = Key;
            }
            if( Value > MaxFreq || Value == MaxFreq && Key < High ){
                MaxFreq = Value;
                High = Key;
            }
        }
        int[] result = {High , Low };
        return result;
    }
}
