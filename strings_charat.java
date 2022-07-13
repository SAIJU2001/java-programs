// write a program to perform the charAt operation taking user input.

import java.util.*;

public class strings_charat
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String sentence = Sc.nextLine();
        System.out.println();
        int n = sentence.length();
        for( int i=0 ; i<n ; i++ )
        {
            char ch = sentence.charAt(i);
            System.out.println(ch);
        }
    }
}