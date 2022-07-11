// write a program to measure length of the stringbuilder taking user input.

import java.util.*;

public class strings_builder_length
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String sentence = Sc.nextLine();
        StringBuilder sb = new StringBuilder(sentence);
        System.out.println();
            System.out.println(sb.length());
    }
}