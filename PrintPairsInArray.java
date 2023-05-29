import java.util.*;

public class PrintPairsInArray
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
        printPair( arr);
    }
    public static void printPair( int arr[])
    {
        int totalpair=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;

        for( int i=0 ; i<arr.length ; i++ )
        {
            for( int j=i+1 ; j<arr.length ; j++ )
            {
                System.out.print( "("+arr[i]+","+arr[j]+") ");
                totalpair++;
                maxSum=Math.max(maxSum,arr[i]+arr[j]);
                minSum=Math.min(minSum,Math.abs(arr[i]-arr[j]) );
            }
            System.out.println();
        }
        System.out.println("The no of total pair is : "+totalpair);
        System.out.println("The max sum pair is : "+maxSum);
        System.out.println("The min sum pair is : "+minSum);
        return;
    }   
}