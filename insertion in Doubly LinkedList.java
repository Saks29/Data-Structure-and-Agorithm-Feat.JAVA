/* Q.Given the head of a doubly-linked list, a position p, and an integer x. The task is to add a new node with value x at the position just after pth node in the doubly linked list and return the head of the updated list.

Note: The position is 0-based indexed.*/
/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node addNode(Node head, int p, int x) {
        // code here
        Node newNode = new Node(x);
        Node current = head;
        if(head == null){
            return newNode;
        }
        int position =  0;
        while(position < p){
            if(current.next != null){
                current = current.next;
            }
            else{
                return head;
            }
            position ++;
        }
        if(current.next != null){
            newNode.next = current.next;
            current.next.prev = newNode;
            
        }
        current.next = newNode;
        newNode.prev = current;
        return head;
        
    }
}
  
