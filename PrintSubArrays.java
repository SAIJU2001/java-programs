import java.util.*;

public class PrintSubArrays
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
        subArrayprint(arr);
    }
    public static void subArrayprint( int arr[])
    {
        int totalpair=0,sum=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;

        for( int i=0 ; i<arr.length ; i++ )
        {
            int start=i;
            for( int j=i ; j<arr.length ; j++ )
            {
                int end=j;
                for( int k=start ; k<=end ; k++ )
                {
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                    maxSum=Math.max(maxSum,sum);
                    minSum=Math.min(sum,minSum);
                }
                totalpair++;
                sum=0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The no of total sub-arrays is : "+totalpair);
        System.out.println("The max sum sub-array is : "+maxSum);
        System.out.println("The min sum sub-arrays is : "+minSum);
        return;
    }   
}