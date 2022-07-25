// ArrayList

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists
{
    public static void main(String args[])
    {
        Scanner Sc =new Scanner(System.in);

        // arraylist creation
        ArrayList<Integer> list = new ArrayList<>();
        
        // add operation 
        System.out.print("Enter the number how many interger you want to add : ");
        int n = Sc.nextInt();
        System.out.println();

        int i=0;
        while(i<n)
        {
            System.out.print("Enter the "+(i+1)+"th value : ");
            int val = Sc.nextInt();
            list.add(val);
            i++;
        }
        System.out.println();

        //print the list
        System.out.println(list);
        System.out.println();

        // get operation
        System.out.print("Enter the index which value you want to know : ");
        int index = Sc.nextInt();
        System.out.println();
        System.out.println(list.get(index));

        // measure the size of arraylist
        System.out.println("size of this arraylist is : "+list.size());

        // get operation using loop
        System.out.print("The values of this arraylist are : ");
        for( int j=0 ; j<list.size(); j++ )
        {
            System.out.print(list.get(j)+" ");
        } 
        System.out.println();
        System.out.println();

        // modify operation using add
        System.out.println("Modify the list using add operation");
        System.out.println();
        System.out.print("Enter the index : ");
        int index2 = Sc.nextInt();
        System.out.println();
        System.out.print("Enter the value to add : ");
        int val2 = Sc.nextInt();
        System.out.println();

        list.add(index2,val2);
        System.out.print("After add operation the list is : "+list);
        System.out.println();

         // modify operation using set
         System.out.println("Modify the list using set operation");
         System.out.println();
         System.out.print("Enter the index : ");
         int index3 = Sc.nextInt();
         System.out.println();
         System.out.print("Enter the value to add : ");
         int val3 = Sc.nextInt();
         System.out.println();
 
         list.set(index3,val3);
         System.out.print("After add operation the list is : "+list);
         System.out.println();

         // remove operation 
         System.out.println("remove operation perform");
         System.out.println();
         System.out.print("Enter the index : ");
         int index4 = Sc.nextInt();
 
         list.remove(index4);
         System.out.print("After remove operation the list is : "+list);
         System.out.println();

         // sort the arraylist
         Collections.sort(list);
         System.out.print("After sorting the arraylist is : "+list);
         System.out.println();
    }
}