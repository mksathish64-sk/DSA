package LinkedListReversal;

public class LinkedList {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data = val;
            next = null;
        }
    }
    LinkedList()
    {
        head = null;
    }
    public void insert(int val)
    {
        Node newnode = new Node(val); 
        if(head == null)
        {
            head = newnode;
        }
        else{
        newnode.next = head;
        head = newnode;
        }
    }
    public void reverse()
    {
        Node prev = null;
        Node current = head;
        Node next = head.next;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    } 
    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

}
