// Q.Given the head of a singly linked list of integers, find and return its length. //
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
 }

 *****************************************************************/

public class Solution {
    public static int length(Node head){
        //Your code goes here
        int count= 0;
        Node currentnode = head;
        if(currentnode == null){
            return 1;
        }
        while( currentnode != null){
            currentnode = currentnode.next;
            count++;
        }
        return count;
    }
}
