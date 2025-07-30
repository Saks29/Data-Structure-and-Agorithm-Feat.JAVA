// Q.Given a linked list of n nodes and a key, the task is to check if the key is present in the linked list or not. 
// User function Template for Java

/* Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node current = head;
        while(current != null){
            if(current.data == key) return true;
            current = current.next;
        }
        return false;
    }
}
