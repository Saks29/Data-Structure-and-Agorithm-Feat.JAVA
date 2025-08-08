//  Q.Given the head of a linked list, return the list after sorting it in ascending order.
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
 import java.util.*;
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            list.add(current.val);
            current = current.next;
        }
        Collections.sort(list);
        
        ListNode sorted = new ListNode(list.get(0));
        ListNode head2 = sorted;
        for(int i = 1 ; i < list.size() ; i++){
            head2.next = new ListNode ( list.get(i));
            head2 = head2.next;
        }
        return sorted;
    }
}
