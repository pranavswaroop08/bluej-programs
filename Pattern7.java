/* program to store a word(say, BLUEJ) and display the pattern:BLUEJ LUEJB UEJBLEJBLUJBLUE*/
import java.util.*; 
class Pattern7
{
    public static void main(String args[])
    {
        String s="BLUEJ"; 
        int i, j, len;
        len=s.length();
        for(i=0;i<len;i++)
        {
            System.out.print(s.substring(i,len));   
            System.out.print(s.substring(0, i)); 
            System.out.println();
        }
    }
}