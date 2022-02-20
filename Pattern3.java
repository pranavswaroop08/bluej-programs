/* program to store a word(say, BLUEJ) and display thepattern:BLUEJ LUEJB UEJBL EJBLUJBLUE*/
import java.util.*; 
class Pattern3
{
    public static void main(String args[])
    {
        String s="BLUEJ"; 
        int i, j, len;
        Scanner in=new Scanner(System.in); 
        len=s.length();
        for(i=0;i<len;i++)
        {
            System.out.print(s.substring(i,len));   
            System.out.print(s.substring(0,i)); 
            System.out.println();
        }
    }
}