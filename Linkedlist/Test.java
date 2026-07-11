package Linkedlist;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        int choice,pos;
        String val;
        while(true)
        {
        System.out.println("\n--------------- Menu ---------------");
        System.out.println("01. Insert at Beginning");
        System.out.println("02. Insert at Particular Position");
        System.out.println("03. Delete at particular position");
        System.out.println("04. get");
        System.out.println("05. Update");
        System.out.println("06. Display");
        System.out.println("07. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the Element to insert:");
                val = sc.next();
                list.insertAtBeginning(val);
                break;
            case 2:
                System.out.println("Enter the Position(strats at 0):");
                pos = sc.nextInt();
                System.out.println("Enter the element to insert:");
                val = sc.next();
                list.insertAtPos(pos,val);
                break;
            case 3:
                System.out.println("Enter the Position(strats at 0):");
                pos = sc.nextInt();
                list.deleteAtPos(pos);
                break;
            case 4:
                System.out.println("Enter the Position(strats at 0):");
                pos = sc.nextInt();
                String data = list.get(pos);
                System.out.println("The data in the Position "+pos+" is "+data);
                break;  
            case 5:
                System.out.println("Enter the Position(strats at 0):");
                pos = sc.nextInt();
                System.out.println("Enter the element to update:");
                val = sc.next();
                list.update(pos,val);
                break;    
            case 6:
                list.display();
                break;
            case 7: System.exit(0);
            default:
                System.out.println("!!!Invalid Choice!!!");
        }
        }
    }
}
