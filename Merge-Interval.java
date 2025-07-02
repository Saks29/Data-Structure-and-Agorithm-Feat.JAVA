/* Q.Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input. */
import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int row = intervals.length;
        int[][] temp = new int[row][2]; // Temporary array to hold merged intervals
        int j = 0; // Index for temp array

        // Step 2: Loop through intervals and merge
        for (int i = 0; i < row; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // Merge overlapping intervals
            while (i + 1 < row && intervals[i + 1][0] <= end) {
                i++;
                end = Math.max(end, intervals[i][1]);
            }

            // Store merged interval
            temp[j][0] = start;
            temp[j][1] = end;
            j++;
        }

        // Step 3: Copy only used rows into result array
        int[][] result = new int[j][2];
        for (int i = 0; i < j; i++) {
            result[i][0] = temp[i][0];
            result[i][1] = temp[i][1];
        }

        return result;
    }
}

