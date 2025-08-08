/* Q.Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
For example, the following two linked lists begin to intersect at node c1:
The test cases are generated such that there are no cycles anywhere in the entire linked structure.
Note that the linked lists must retain their original structure after the function returns.*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if( headA == null || headB == null){
            return null;
        }

        ListNode currentA = headA;
        ListNode currentB = headB;
        int lenA = 0;
        int lenB = 0;
        while(currentA != null){
            lenA++;
            currentA = currentA.next;
        }
        while(currentB != null){
            lenB++;
            currentB = currentB.next;
        }
        currentA = headA;
        currentB = headB;
        if(lenA > lenB){
            for(int i = 0 ; i < lenA-lenB ; i++){
                currentA = currentA.next;
            }
        }
        else{
            for(int i = 0 ; i < lenB-lenA ; i++){
                currentB = currentB.next;
            }
        }
        while( currentA != null || currentB != null){
            if( currentA == currentB ){
                return currentA;
            }
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return null;
    }
}
