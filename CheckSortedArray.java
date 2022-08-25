// write a program to take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.*;

public class CheckSortedArray
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number of length of the array : ");
        int length=Sc.nextInt();
        System.out.println();

        int arr[]=new int[length];
        for( int i=0 ; i<length ; i++ ) //value input in the array
        {
            System.out.print("Enter the value of "+i+"th index of the array : ");
            arr[i]=Sc.nextInt();
        }
        System.out.println();
        
        //check sorted or not
        int count=0;
        for( int i=0 ; i<length-1 ; i++ ) 
        {
            if( arr[i]>arr[i+1] )
            count++;
        }

        if( count==0 )
        System.out.print("The array is sorted");
        else
        System.out.print("The array is not sorted");
        
    }
}
