package DoublyLinkedList;

public class DoublyList {
    Node head;
    Node tail;
    class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int val)
        {
            data = val;
            prev = null;
            next = null;
        }
    }
    DoublyList()
    {
        Node head = null;
        Node tail = null;        
    }
    public void insertAtBegining(int val)
    {
        Node newNode = new Node(val);
        if(head == null)    //when the list empty
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertAtpos(int pos, int val)
    {
        Node newNode = new Node(val);
        if(head == null)
        {
            insertAtBegining(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<pos;i++)
        {
          temp = temp.next;  
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        newNode.prev = temp;
        temp.next = newNode;
    }
    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void displayRev()
    {
        Node temp = tail;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
    } 

}
