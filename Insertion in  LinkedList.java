/* Q.You are given a Singly Linked List of ‘N’ positive integers. Your task is to add a node having the value ‘VAL’ at position ‘POS’ in the linked list.

Note:
Assume that the Indexing for the linked list starts from 0.*/
import java.util.* ;
import java.io.*; 

/************************************************************

 Following is the linkedList class structure:

 class Node<T> {
 T data;
 Node<T> next;

 public Node(T data) {
 this.data = data;
 }
 }

 ************************************************************/

public class Solution {

    static Node insert(Node head, int n, int pos, int val) {
        // Write your code here.
        Node<Integer> newnode = new Node<>(val);
        if(pos == 0){
            newnode.next = head;
            return newnode;
        }
        Node<Integer> current = head;
        int i = 0;
        while( current != null && i < pos-1){
            current = current.next;
            i++;
        }
        if(current == null){
            return head;
        }
        newnode.next = current.next;
        current.next = newnode;

        return head;
    }
}
