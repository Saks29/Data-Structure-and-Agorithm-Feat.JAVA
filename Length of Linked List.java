/* Q.You’re given a linked list. The last node might point to null, or it might point to a node in the list, thus forming a cycle.
Find out whether the linked list has a cycle or not, and the length of the cycle if it does.
If there is no cycle, return 0, otherwise return the length of the cycle.*/
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

import java.util.HashMap;
public class Solution
{
    public static int lengthOfLoop(Node head) {
        // Write your code here
        Node current = head;
        HashMap< Node , Integer > cycle = new HashMap<>();
        if( head == null || head.next == null){
            return 0;
        }
        int length = 1;
        while(current != null){
            if(cycle.containsKey(current)){
                return length - cycle.get(current);
            }
            cycle.put( current , length);
            current = current.next;
            length++;
        }
        return 0;
    }
}
