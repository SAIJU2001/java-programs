// write a program to perform reverse of the stringbuilder taking user input.

import java.util.*;

public class strings_builder_reverse
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String sentence = Sc.nextLine();
        StringBuilder sb = new StringBuilder(sentence);
        System.out.println();
        int n = sb.length();
        for( int i=0 ; i<n/2; i++)
        {
            int front = i;
            int back = sb.length()-1-i;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);

        }
        System.out.println(sb);
    }
}