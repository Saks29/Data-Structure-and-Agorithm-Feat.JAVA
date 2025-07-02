/* Q.Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input. */
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by starting time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Use a list to store merged intervals
        List<int[]> mergedList = new ArrayList<>();

        // Step 3: Loop through each interval
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // If list is empty or no overlap, just add it
            if (mergedList.isEmpty() || mergedList.get(mergedList.size() - 1)[1] < start) {
                mergedList.add(new int[]{start, end});
            } else {
                // Overlap: merge with the last interval
                mergedList.get(mergedList.size() - 1)[1] =
                    Math.max(mergedList.get(mergedList.size() - 1)[1], end);
            }
        }

        // Convert list to array and return
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
