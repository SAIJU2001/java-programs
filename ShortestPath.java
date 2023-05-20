import java.util.*;

public class ShortestPath
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter the direction string : ");
        String direction=Sc.next();
        System.out.print( getPath(direction) );
    }
    public static int getPath( String direction )
    {
        int x=0,y=0;
        for( int i=0 ; i <direction.length() ; i++ )
        {
            char ch=direction.charAt(i);
            if( ch=='N')
            {
                y++;
            }
            else if( ch=='S')
            {
                y--;
            }
            else if( ch=='E')
            {
                x++;
            }
            else
            {
                x--;
            }
        }
        return (int)Math.sqrt((x*x)+(y*y));
    }
    
}