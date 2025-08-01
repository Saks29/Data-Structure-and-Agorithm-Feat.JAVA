/* Q.Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node. */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 1;
        ListNode current = head;
        while(current.next != null){
            current = current.next;
            count++;
        }
        int mid = (count/2) + 1;
        current = head;
        count = 1;
        while( count < mid){
            current = current.next;
            count++;
        }
        return current;
    }
}
