import java.util.*;
class DynamicArray
{
    static final int intialcapacity = 3;
    int arr[];
    int size;
    int capacity;
    DynamicArray()
    {
        size = 0;
        arr = new int[intialcapacity];
        capacity = intialcapacity;
    }
    private void expandArray()
    {
        capacity *= 2;
        arr = Arrays.copyOf(arr,capacity);
    }
    public void add(int val)
    {   
        if(size == capacity)
        {
            expandArray();
        }
        arr[size++] = val;
    }
    public void insertAtPos(int pos,int val)
    {
         if(size == capacity)
        {
            expandArray();
        }
        for(int i = size-1; i>=pos; i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos] = val;
        size++;
    }
    public void deleteAtPos(int pos)
    {
        for(int i = pos+1; i<size; i++)
        {
            arr[i-1] = arr[i];
        }
        size--;
        if(capacity>intialcapacity && capacity>3*size)
        {
            shrinkArray();
        }
    }
    private void shrinkArray()
    {
        capacity /= 2;
        arr = Arrays.copyOf(arr,capacity);         
    }
    public void display()
    {
        System.out.println("Elements in the List:");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
public class ListImplementaion
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        DynamicArray list = new DynamicArray();
        int choice,val,pos;
        while(true)
        {
        System.out.println("\n--------------- Menu ---------------");
        System.out.println("01. Insert at End");
        System.out.println("02. Insert at Particular Position");
        System.out.println("03. Delete at particular position");
        System.out.println("04. Display");
        System.out.println("05. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the Element to insert:");
                val = sc.nextInt();
                list.add(val);
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
                list.display();
                break;
            case 5: System.exit(0);
            default:
                System.out.println("!!!Invalid Choice!!!");
        }
        }
    }
}