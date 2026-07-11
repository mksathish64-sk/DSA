package Linkedlist;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice,val,pos;
        while(true)
        {
        System.out.println("\n--------------- Menu ---------------");
        System.out.println("01. Insert at Beginning");
        System.out.println("02. Insert at Particular Position");
        System.out.println("03. Delete at particular position");
        System.out.println("04. get");
        System.out.println("05. Update");
        System.out.println("06. search");
        System.out.println("07. Display");
        System.out.println("08. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the Element to insert:");
                val = sc.nextInt();
                list.insertAtBeginning(val);
                break;
            case 2:
                System.out.println("Enter the Position(strats at 0):");
                pos = sc.nextInt();
                System.out.println("Enter the element to insert:");
                val = sc.nextInt();
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
                int data = list.get(pos);
                System.out.println("The data in the Position "+pos+" is "+data);
                break;  
            case 5:
                System.out.println("Enter the Position(strats at 0):");
                pos = sc.nextInt();
                System.out.println("Enter the element to update:");
                val = sc.nextInt();
                list.update(pos,val);
                break;    
            case 6:
                System.out.println("Enter the Element to search:");
                val = sc.nextInt();
                int index = list.search(val);
                if(index!=-1)
                {
                    System.out.println("Element found at "+index);
                }
                else
                {
                    System.out.println("Not found");
                }
                break;      
            case 7:
                list.display();
                break;
            case 8: System.exit(0);
            default:
                System.out.println("!!!Invalid Choice!!!");
        }
        }
    }
}
