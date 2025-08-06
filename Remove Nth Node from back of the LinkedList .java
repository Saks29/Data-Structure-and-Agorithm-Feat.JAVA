// Q.Given the head of a linked list, remove the nth node from the end of the list and return its head.
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode current = head;
        while(current != null){
            length++;
            current = current.next;
        }
        current = head;
        int node = length - n ;
        if(node == 0){
            return current.next;
        }
        int i = 1;
        current = head;
        while(i < node){
            current = current.next;
            i++;
        }
        if( current.next.next == null){
            current.next = null;
        }
        else{
            current.next = current.next.next;
        }
        
        return head;
    }
}
