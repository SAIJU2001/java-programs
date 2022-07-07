// write a program to print the user input number in reverse order.firstly all number stored in a array.

import java.util.*;

public class reverse_array
{
    public static void main(String args[])
    {  
        // array input 
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index you want : ");
        int size = Sc.nextInt();
        int numbers[] = new int[size];
        System.out.println();
        for( int i=0 ; i<size ; i++)
            {
                System.out.print("Enter the value of index no "+i+" is : ");
                numbers[i] = Sc.nextInt();
            }
            System.out.println();

        // array output in reverse order
        for( int i=size-1 ; i>=0 ; i--)
            {
                System.out.print("The value of index no "+i+" is : "+numbers[i]);
                System.out.println();
            }
    }
}
