import java.util.*;

public class StringCompression
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=Sc.next();
        System.out.print( compression(str) );
    }
    public static String compression( String str )
    {
        String compressedStr="";
        for( int i=0 ; i<str.length() ; i++ )
        {
            Integer count=1;
            while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1) )
            {
                i++;
                count++;
            }
            compressedStr+=str.charAt(i);
            if( count>1 )
            {
                compressedStr+=count.toString();
            }
        }
        return compressedStr;
    }
    
}