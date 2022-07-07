// Take an array as input from the user. search for a given number and print the index at which it occurs.

import java.util.*;

public class search_array
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

        // input the searched number
        System.out.print("Enter the value which is search for : ");
        int n = Sc.nextInt();
        System.out.println(); 

        // search the number
        int j = 0;
        for( int i=0 ; i<size ; i++)
            {
                if(numbers[i] == n)
                {
                    System.out.print("The value "+n+" is found in the index no : "+i);
                    j++;
                    System.out.println();
                }
            }
        if(j == 0)
        System.out.print("The value is not found in this array.");
        System.out.println();

    }
}