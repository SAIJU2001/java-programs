// write a program to print a string taking user input.

import java.util.*;

public class strings
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string you want to print : ");
        String sentence = Sc.nextLine();
        System.out.println();
        System.out.println(sentence);

    }
}