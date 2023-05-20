import java.util.*;

public class WordUpperCase
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=Sc.nextLine();
        System.out.print( upperCase(str) );
    }
    public static String upperCase( String str )
    {
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)) );
        for( int i=1 ; i <str.length() ; i++ )
        {
            if( str.charAt(i)==' ' )
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)) );
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    
}