 // write a program to check wheather any of number appear more than once in the array .taking user input.

import java.util.*;

public class check_array
{
    public static void main(String args[])
    {  
        // array input 
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index you want : ");
        int size = Sc.nextInt();
        int arr[] = new int[size];
        System.out.println();
        for( int i=0 ; i<size ; i++)
            {
                System.out.print("Enter the value of index no "+i+" is : ");
                arr[i] = Sc.nextInt();
            }
            System.out.println(); 

        // check wheather any of number appear more than once 
        int count=0, idxVal=arr[0],idx=0;
        while( idx != arr.length-1 )
        {
            for( int i=idx+1 ; i<arr.length ; i++ )
            {
                if( idxVal == arr[i])
                    {
                        count++;
                        System.out.println("The value "+arr[i]+" is found more than once");
                    }
            }
            idx++;
            idxVal=arr[idx];
        }
        if(count==0)
        System.out.print("Any value does not occure more than once.");
        System.out.println();

    }
}