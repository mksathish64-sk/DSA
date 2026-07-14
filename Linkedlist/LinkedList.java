package Linkedlist;

public class LinkedList<T>{
    Node head;
    class Node
    {
        T data;
        Node next;
        Node(T val)
        {
            data = val;
            next = null;
        }
    }
    LinkedList()
    {
        head = null;
    }

    public void insertAtBeginning(T val)
    {
        Node newNode = new Node(val);
        if(head == null) //when list is empty
        {
            head = newNode;
        }
        else // whenlist is not empty
        {
            newNode.next = head;
            head = newNode;
        }
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

    public void insertAtPos(int pos, T val)
    {
        Node newNode = new Node(val);
        if(pos == 0)// inserting at first position 
        {
            insertAtBeginning(val);
            return;
        }
        Node temp = head;
        for(int i=1; i<pos; i++)
        {
            temp = temp.next;
            if(temp == null)
            {
                throw new IndexOutOfBoundsException("Error While inserting at the pos:"+pos);
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtPos(int pos)
    {
        if(head == null)
        {
            throw new IndexOutOfBoundsException("Deletion attempted at empty list");
        }
        if(pos == 0)
        {
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = head;
        for(int i=1;i<=pos;i++)
        {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;

    }
    public T get(int pos)
    {
        if(head == null)
        {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for(int i=1;i<=pos;i++)
        {
            temp = temp.next;
            if(temp == null)
            {
                throw new IndexOutOfBoundsException();
            }
        }
        return temp.data;
    }
    public void update(int pos,T val)
    {
        if(head == null)
        {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for(int i=1;i<=pos;i++)
        {
            temp = temp.next;
            if(temp == null)
            {
                throw new IndexOutOfBoundsException();
            }
        }
        temp.data = val;
    }
   
    
}
