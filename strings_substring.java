// write a program to compare two strings taking user input.

import java.util.*;

public class strings_substring
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String sentence = Sc.nextLine();
        System.out.println();
        System.out.print("Enter the begining index of the substring : ");
        int index1 = Sc.nextInt();
        System.out.println();
        System.out.print("Enter the ending index of the substring : ");
        int index2 = Sc.nextInt();
        System.out.println();
            System.out.println("The substrings are : "+sentence.substring(index1,index2));

    }
}