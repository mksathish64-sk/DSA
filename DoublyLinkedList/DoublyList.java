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
        head = null;
        tail = null;        
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
        if(pos == 0)
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
        if(temp == tail)
            tail = newNode;
        else
            temp.next.prev = newNode;
        newNode.prev = temp;
        temp.next = newNode;
    }
    public void deleteAtpos(int pos)
    {
        if(pos == 0)
        {
            head = head.next;
            head.prev = null;
            return;
        }
        Node prevNode = null;
        Node cur = head;
        for(int i =1;i<=pos;i++)
        {
            prevNode = cur;
            cur = cur.next;
        }
        if(cur == tail)
        {
            tail = prevNode;
            prevNode.next = null;
            cur.prev = null;
            return;
        }
        prevNode.next = cur.next;
        cur.next.prev = prevNode;
        cur.prev = null;
        cur.next = null;
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
