//brute force technique
import java.util.*;

public class MaxSubArraysSum1
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

        for( int i=0 ; i<arr.length ; i++ )
        {
            int start=i;
            for( int j=i ; j<arr.length ; j++ )
            {
                int end=j;
                for( int k=start ; k<=end ; k++ )
                {
                    sum+=arr[k];
                    maxSum=Math.max(maxSum,sum);
                }
                sum=0;
            }
        }
        return maxSum;
    }   
}