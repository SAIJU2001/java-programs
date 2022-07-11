// write a program to perform CharAt in the stringbuilder taking user input.

import java.util.*;

public class strings_builder_CharAt
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String sentence = Sc.nextLine();
        StringBuilder sb = new StringBuilder(sentence);
        System.out.println();
        for( int i=0 ; i<sb.length() ; i++)
            {
                System.out.println(sb.charAt(i));
            }
    }
}