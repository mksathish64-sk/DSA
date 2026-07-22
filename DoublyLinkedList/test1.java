package DoublyLinkedList;

public class test1 {
    public static void main(String[] args)
    {
        DoublyList list1 = new DoublyList();
        list1.insertAtBegining(3);
        list1.insertAtBegining(4);
        list1.insertAtBegining(5);
        list1.insertAtBegining(6);
        list1.insertAtpos(2,8);
        list1.insertAtpos(3,10);
        list1.display();
        System.out.println();
        list1.displayRev();
    }
}
