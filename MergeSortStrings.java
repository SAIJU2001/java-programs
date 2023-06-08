/* Apply Merge sort to sort an array of Strings. (Assume that all the characters in all the Strings
 are in lowercase). (EASY)

Sample Input J : arr = ( "sun", "earth", "mars", "mercury" } Sample Output 1 : 
arr = ( "earth", "mars", "mercury", "sun”}
*/

//this problem based on divide and conquer

import java.util.*;

public class MergeSortStrings
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        //input array length
        System.out.print("Enter the length of tye array : ");
        int n=Sc.nextInt();
        //intialize array
        String arr[]=new String[n];
        //input array element
        for( int i=0 ; i<n ; i++ )
        {
            System.out.print("Enter the value of the index "+i+" : ");
            arr[i]=Sc.next();
        }
        //call the function
        divided( arr, 0, n-1);
        //print the array element
        for( int i=0 ; i<n ; i++ )
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void divided( String arr[], int si, int ei)
    {
        //base case
        if( si>=ei )
        {
            return;
        }
        //find mid
        int mid=si+(ei-si)/2;
        //recursive call for left half
        divided( arr, si, mid);
        //recursive call for right half
        divided( arr, mid+1, ei);
        //function call
        conquer( arr, si, mid, ei);
    }
    public static void conquer( String arr[], int si, int mid, int ei)
    {
        int i=si;
        int j=mid+1;
        int k=0;
        //temporary array 
        String merged[]=new String[ei-si+1];
        //loop range
        while( i<=mid && j<=ei )
        {
            //small value goes first(lexological order)
            if( arr[i].compareTo(arr[j])>=0 )
            {
                merged[k++]=arr[j++];
            }
            else
            {
                merged[k++]=arr[i++];
            }
        }
        while( i<=mid )
        {
            merged[k++]=arr[i++];
        }
        while( j<=ei )
        {
            merged[k++]=arr[j++];
        }
        //copy from the temporary to main array
        for( int x=0,y=si ; x<merged.length ; x++,y++ )
        {
            arr[y]=merged[x];
        }
    }
}

