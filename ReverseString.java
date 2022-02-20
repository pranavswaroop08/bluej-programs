/* A program to accept a string and display the same in the reverse order.Sample Input-Computer is Fun.Sample  Output -Fun is Computer*/
import java.util.Scanner;
class ReverseString
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
         String sent, word="",sent1="";
         char  ch;  
         int  i; 
         System.out.println("Enter a Sentence");
         sent=sc.nextLine();
         sent=sent+"";
         for(i=0;i<sent.length();i++)
        {
             ch=sent.charAt(i); 
             if(ch!=' ')word=word+ch; 
             else if(ch==' ')
            {
                 sent1=word+" "+sent1; word="";
            }
        }
            System.out.println("The string in reversed order is : \n"+sent1);
    }
}