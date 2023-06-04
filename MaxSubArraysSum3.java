//kadane's algorithm

import java.util.*;

public class MaxSubArraysSum3
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int length=Sc.nextInt();
        int arr[]=new int [length];

        for ( int i=0 ; i<length ; i++)
        {
            System.out.print("Enter the value of index "+i+" : ");
            arr[i]=Sc.nextInt();
        }
        System.out.println("The max sum sub-array is : "+ maxSum(arr));
    }
    public static int maxSum( int arr[])
    {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for( int i=1 ; i<arr.length ; i++ )
        {
            sum+=arr[i];
            if( sum<0 )
            {
                sum=0;
            }
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }   
}