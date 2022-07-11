// write a program to compare two strings taking user input.

import java.util.*;

public class strings_compare
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String sentence1 = Sc.nextLine();
        System.out.println();
        System.out.print("Enter the second string : ");
        String sentence2= Sc.nextLine();
        System.out.println();
        if( sentence1.compareTo(sentence2)==0 )
            System.out.println("The strings are same.");
        else
            System.out.println("The strings are not same.");
    }
}