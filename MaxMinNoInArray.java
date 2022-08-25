// write a program to find the maximum & minimum number in an array of integers.

import java.util.*;

public class MaxMinNoInArray
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

        // find the min value and max value
        int minVal=arr[0],maxVal=arr[0];
        for( int i=0 ; i<length ; i++ )
        {
            if( arr[i]>maxVal )
            maxVal=arr[i];
            
            if( arr[i]<minVal )
            minVal=arr[i];
        }
        System.out.println("The min value of the array is : "+minVal);
        System.out.println("The max value of the array is : "+maxVal);

    }
}
