// string operation

public class StringOperation
{
    public static void main(String args[])
    {
        String name = new String("Saikat");
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        for( int i=0 ; i<name.length() ; i++)
        {
            System.out.println(name.substring(i,i+1));//starting index,ending index
        }
        for( int i=0 ; i<name.length() ; i++)
        {
            System.out.println(name.substring(i));//starting index is given and bydefault the ending index is n-1
        }
        System.out.println(name.replace('k','c'));//which is replaced,by which it is replaced
        System.out.println(name.startsWith("Sa"));//returns true for the right value
        System.out.println(name.endsWith("ka"));//returns false for the wrong value
        for( int i=0 ; i<name.length() ; i++ )
        {
            System.out.println(name.charAt(i));
        }
        System.out.println(name.indexOf('k'));//return the index no if does nor exists returns -1
        System.out.println(name.equals("saikat"));//return true or false
        //replace the spaces and add _ in that space.
        String name2="Saikat naskar";
       System.out.println(name2.replace(" ","_"));

    }
}