/* Q.Problem statement
Given a sequence of numbers. Find all leaders in sequence. An element is a leader if it is strictly greater than all the elements on its right side.

Note:
1. Rightmost element is always a leader.

2. The order of elements in the return sequence must be the same as the given sequence
Example:
The given sequence is 13, 14, 3, 8, 2 .

13 Not a leader because on the right side 14 is greater than 13.

14 lt is a leader because no one greater element in the right side.

3 Not a leader because on the right side 8 are greater than 3.

8 It is a leader because no one greater element on the right side.

2 It is a leader because it is the rightmost element in a sequence.

Hence there are 3 leaders in the above sequence which are 14, 8, 2.*/
import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {
		// Write your code here.
		ArrayList<Integer> leader = new ArrayList<>();
        int maximum = elements.get(n-1);
        leader.add(elements.get(n-1));
        int i = n-2;
        while( i >= 0 ){
            if(elements.get(i) > maximum){
                leader.add(elements.get(i));
            }
            maximum = Math.max(maximum , elements.get(i));
            i--;
        }
        Collections.reverse(leader);
        return leader;
	}
}
