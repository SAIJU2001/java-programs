import java.util.*;

public class Lexicographic
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=Sc.nextInt();
        String fruits[]=new String[n];
        for( int i=0 ; i<n ; i++ )
        {
            System.out.print("Enter the fruit name : ");
            fruits[i]=Sc.next();
        }
        System.out.print( largestString(fruits) );
    }
    public static String largestString( String fruits[] )
    {
        String largest=fruits[0];
        for( int i=0 ; i <fruits.length ; i++ )
        {
            if( largest.compareTo(fruits[i])<0 )
            {
                largest=fruits[i];
            }
        }
        return largest;
    }    
}