package Linkedlist;

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

    public void insertAtBeginning(int val)
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

    public void insertAtPos(int pos, int val)
    {
        Node newNode = new Node(val);
        if(pos == 0)
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
            throw new IndexOutOfBoundsException("Deletion attemoted at empty list");
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
    public int get(int pos)
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
    public void update(int pos,int val)
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
    public int search(int val)
    {
        if(head == null)
        {
            throw new IndexOutOfBoundsException("List is Empty");
        }
        Node temp = head;
        int index = 0;
        while(temp!=null)
        {
            if(temp.data == val)
            {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }
    
}
