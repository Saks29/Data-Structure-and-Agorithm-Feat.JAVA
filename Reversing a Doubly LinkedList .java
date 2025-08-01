/* Q.Problem statement
You are given a doubly-linked list of size 'N', consisting of positive integers. Now your task is to reverse it and return the head of the modified list.
Note:
A doubly linked list is a kind of linked list that is bidirectional, meaning it can be traversed in both forward and backward directions.*/
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

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node reverseDLL(Node head)
    {
        // Write your code here.
        if(head.next == null){
            return head;
        }
        Node right = head;
        int count = 1;
        while(right.next != null){
            right = right.next;
            count++;
        }
        Node left = head;
        int i = 1;
        while(i < count){
            int temp = left.data;
            left.data = right.data;
            right.data = temp;

            left = left.next;
            right = right.prev;
            i++;
            count--;
        }

        return head;

    }
}
