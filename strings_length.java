// write a program to measure the length of the string taking user input.

import java.util.*;

public class strings_length
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String sentence = Sc.nextLine();
        System.out.println();
        System.out.println("The length of this string is : "+sentence.length());

    }
}