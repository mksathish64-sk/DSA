package LinkedListReversal;

public class ReversalList {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.display();
        list.reverse();
        System.out.println();
        list.display();
    }
}
