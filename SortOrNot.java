// write a program to find the array is sorted or not.

import java.util.*;

public class SortOrNot
{
    public static void main(String args[])
    {  
        // array input 
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index you want : ");
        int length = Sc.nextInt();
        int arr[] = new int[length];
        System.out.println();
        int count=0;
        for( int i=0 ; i<length ; i++)
            {
                System.out.print("Enter the value of index no "+i+" is : ");
                arr[i] = Sc.nextInt();
            }
            System.out.println(); 

        for( int i=0 ; i<length-1 ; i++ )
        {
            if( arr[i]>arr[i+1])
            {
                count++;
            }
        }
        if( count== 0)
        System.out.print("The array is sorted.");
        else 
        System.out.print("The array is not sorted.");
    }
}