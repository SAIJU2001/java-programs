// write a program to perform delete in the stringbuilder taking user input.

import java.util.*;

public class strings_builder_delete
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String sentence = Sc.nextLine();
        StringBuilder sb = new StringBuilder(sentence);
        System.out.println();
        System.out.print("Enter the begining index for delete the string : ");
        int index1 = Sc.nextInt();
        System.out.println();
        System.out.print("Enter the ending index for delete the string : ");
        int index2 = Sc.nextInt();
        System.out.println();
            System.out.println(sb.delete(index1,index2));
    }
}