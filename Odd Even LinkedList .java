/* Q.Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
The first node is considered odd, and the second node is even, and so on.
Note that the relative order inside both the even and odd groups should remain as it was in the input.
You must solve the problem in O(1) extra space complexity and O(n) time complexity. */
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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return head;

        }

        ListNode evenlist = new ListNode(0);
        ListNode oddlist = new ListNode(0);

        ListNode even = evenlist;
        ListNode odd = oddlist;

        ListNode current = head;
        int count = 0;
        while(current != null){
            if(count%2 == 0){
                even.next = current;
                even = even.next;
            }
            else{
                odd.next = current;
                odd = odd.next;
            }
            current = current.next;
            count++;
        }
        odd.next = null;
        even.next = oddlist.next;
        return evenlist.next;
    }
}

 
