// Q.You are given a stack St. You have to reverse the stack using recursion.

import java.util.*;

class Solution {
    static void reverse(Stack<Integer> St) {
        int n = St.size();
        int[] temparray = new int[n];
        insertelement(St, temparray, 0, n);
        reversestack(St, temparray, 0 , n);
    }

    static void insertelement(Stack<Integer> St, int[] temparray, int i, int n) {
        if (i < n && !St.isEmpty()) { // FIXED: !St.isEmpty()
            temparray[i] = St.pop();
            insertelement(St, temparray, i + 1, n);
        }
    }

    static void reversestack(Stack<Integer> St, int[] temparray, int index , int n) {
        if (index < n) {
            St.push(temparray[index]);
            reversestack(St, temparray, index + 1 , n);
        }
    }
}
