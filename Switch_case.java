//press 1 to print hello,press 2 to print namaste,press 3 to print bonjure(french hello).

import java.util.*;

public class Switch_case
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = Sc.nextLine();
        System.out.println("Press 1 for English : \nPress 2 for Hindi : \nPress 3 for French : ");
        int a = Sc.nextInt();
       
        switch(a)
        {
            case 1:
            System.out.print("Press 4 for Male : \nPress 5 for Female : \n");
            int b = Sc.nextInt();
            switch(b)
            {
                case 4:
                System.out.print("Hello Mr. ");
                System.out.print(name);
                break;
                case 5:
                System.out.print("Hello Ms. ");
                System.out.print(name);
                break;
                default:
                System.out.print("Invalid");
                break;
            }
            break;
            case 2:
            System.out.print("Press 4 for Male : \nPress 5 for Female : ");
            int c = Sc.nextInt();
            switch(c)
            {
                case 4:
                System.out.print("Namaste Mr. ");
                System.out.print(name);
                break;
                case 5:
                System.out.print("Namaste Ms. ");
                System.out.print(name);
                break;
                default:
                System.out.print("Invalid");
                break;
            }
            break;
            case 3:
            System.out.print("Press 4 for Male : \nPress 5 for Female : ");
            int d = Sc.nextInt();
            switch(d)
            {
                case 4:
                System.out.print("Bonjure Mr. ");
                System.out.print(name);
                break;
                case 5:
                System.out.print("Bonjure Ms. ");
                System.out.print(name);
                break;
                default:
                System.out.print("Invalid");
                break;
            }
            break; 
            default :
            System.out.print("Invalid");
        }
    
    }
}