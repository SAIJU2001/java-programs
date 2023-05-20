import java.util.*;

public class VowelOccured
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=Sc.next();
        System.out.print( findVowel(str) );
    }
    public static int findVowel( String str )
    {
        int count=0;
        for( int i=0 ; i<str.length() ; i++ )
        {
            if( str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' ) 
            {
                count++;
            }
        }
        return count;
    }
    
}