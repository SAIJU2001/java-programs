import java.util.*;

public class intro_array
{
    public static void main(String args[])
    {  
        // array input 
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of index you want : ");
        int size = Sc.nextInt();
        int numbers[] = new int[size];
        System.out.println();
        for( int i=0 ; i<size ; i++)
            {
                System.out.print("Enter the value of index no "+i+" is : ");
                numbers[i] = Sc.nextInt();
            }
            System.out.println();

        // array output
        for( int i=0 ; i<size ; i++)
            {
                System.out.print("The value of index no "+i+" is : "+numbers[i]);
                System.out.println();
            }
    }
}