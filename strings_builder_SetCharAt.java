// write a program to perform setCharAt in the stringbuilder taking user input.

import java.util.*;

public class strings_builder_SetCharAt
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String sentence = Sc.nextLine();
        StringBuilder sb = new StringBuilder(sentence);
        System.out.println();
        System.out.print("Enter the index for set the character in the string : ");
        int ind = Sc.nextInt();
        System.out.println();
        System.out.print("Enter the character for set the string : ");
        char ch = Sc.next().charAt(0);
        System.out.println();
        sb.setCharAt(ind,ch);
        System.out.println(sb);
    }
}