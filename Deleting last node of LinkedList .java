/* Q.A doubly-linked list is a data structure that consists of sequentially linked nodes, and the nodes have reference to both the previous and the next nodes in the sequence of nodes.
Given a doubly-linked list, delete the node at the end of the doubly linked list. */
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node deleteLastNode(Node head) {
        // Write your code here
        if(head.next == null){
            return null;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.prev.next = null;
        current.prev = null;
        return head;

    }
}
