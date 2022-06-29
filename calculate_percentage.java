//input the marks from the student and calculate the percentage of marks.


import java.util.*;

public class calculate_percentage
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the no of Subject : ");
        int n = Sc.nextInt();
        System.out.println();
        System.out.print("Enter the Full Marks for each Subject : ");
        int l = Sc.nextInt();
        System.out.println();
        int sum=0;
        for(int i=1 ; i<=n ; i++)
        {
            System.out.print("Enter the makrs of subject no ");
            System.out.print(i);
            System.out.print(" : ");
            int k = Sc.nextInt();
            sum=sum+k;
        }
        int answer=(sum*l)/(n*100);
        System.out.print("The calculated percentage is ");
        System.out.print(answer);

    }
}