import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetBasic
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);

        //creating hashset
        HashSet<Integer> set = new HashSet<Integer>();

        //add element in the hashset
        System.out.println("Add operation perform in the HashSet");
        System.out.print("Enter how many number you should input to the HashSet : ");
        int n=Sc.nextInt();
        System.out.println();
        while(n-->0)
        {
            System.out.print("Enter the number : ");
            set.add(Sc.nextInt());
        }
        System.out.println();

        //print the size of the hashset
        System.out.print("The size of the HashSet is : "+set.size());
        System.out.println();

        //Search the elements
        System.out.println("Search operation perform in the HashSet");
        System.out.print("Enter the number : ");
        int num=Sc.nextInt();
        if(set.contains(num))
            System.out.println("HashSet contains "+num);
        else
            System.out.println("HashSet does not contain "+num);
            
        //delete the elements
        System.out.println("Delete operation perform in the HashSet");
        System.out.print("Enter the number : ");
        int val=Sc.nextInt();
        set.remove(val); 
        
        //after deletion verifying
        if(set.contains(val))
            System.out.println("HashSet contains "+val);
        else
            System.out.println("HashSet does not contain "+val);
    
        //print all the elements
        System.out.println("Print all the elements in the HashSet");
        System.out.println(set);

        //Iteration
        System.out.println("Iteration perform in the HashSet");
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
}