// write a program to add two string taking user input.

import java.util.*;

public class strings_concatenation
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String sentence1 = Sc.nextLine();
        System.out.println();
        System.out.print("Enter the second string : ");
        String sentence2 = Sc.nextLine();
        System.out.println();
        System.out.println(sentence1+" "+sentence2);

    }
}