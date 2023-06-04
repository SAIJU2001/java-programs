//prefix technique
import java.util.*;

public class MaxSubArraysSum2
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
        //you can either creat the prefix array or you can change the value of the existing array
        //we are prepare for industry so we do not hamper the given data we use extra space
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];

        for( int i=1 ; i<prefix.length ; i++ )
        {
            prefix[i]=prefix[i-1]+arr[i];
        }

        for( int i=0 ; i<arr.length ; i++ )
        {
            int start=i;
            for( int j=i ; j<arr.length ; j++ )
            {
                int end=j;
                sum=(start==0)?prefix[end]:prefix[end]-prefix[start-1];
            }
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }   
}