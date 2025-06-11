/* Q.Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.

Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays. */
import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        Integer lastadded = null;
        ArrayList<Integer> union = new ArrayList<>();
        int low = 0, high = 0;

        while (low < n && high < m) {
            if (a[low] < b[high]) {
                if (lastadded == null || !Integer.valueOf(a[low]).equals(lastadded)) {
                    union.add(a[low]);
                    lastadded = a[low];
                }
                low++;
            } else if (a[low] > b[high]) {
                if (lastadded == null || !Integer.valueOf(b[high]).equals(lastadded)) {
                    union.add(b[high]);
                    lastadded = b[high];
                }
                high++;
            } else {
                if (lastadded == null || !Integer.valueOf(a[low]).equals(lastadded)) {
                    union.add(a[low]);
                    lastadded = a[low];
                }
                low++;
                high++;
            }
        }

        while (low < n) {
            if (lastadded == null || !Integer.valueOf(a[low]).equals(lastadded)) {
                union.add(a[low]);
                lastadded = a[low];
            }
            low++;
        }

        while (high < m) {
            if (lastadded == null || !Integer.valueOf(b[high]).equals(lastadded)) {
                union.add(b[high]);
                lastadded = b[high];
            }
            high++;
        }

        return union;
    }
}
