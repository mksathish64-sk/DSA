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
        list1.insertAtpos(5,11);
        list1.insertAtpos(0,1);
        list1.display();
        list1.deleteAtpos(6);
        System.out.println();
        list1.display();
        list1.deleteAtpos(0);
        System.out.println();
        list1.display();
        list1.deleteAtpos(2);
        System.out.println();
        list1.display();
    }
}
