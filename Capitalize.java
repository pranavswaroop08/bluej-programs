/*WAP to accept a sentence, convert all the characters to lowercase and capitalize each word and display Input: Every day is a new dayOutput: Every Day Is A New Day*/
import java.util.*;
class Capitalize
{
    public static void main(String args[])
    {
        String sent, sent1=""; 
        char c, c1=' ';
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        sent=in.nextLine(); 
        sent=" "+sent;
        sent=sent.toLowerCase();
        for(i=0;i<sent.length();i++)
        {
            c=sent.charAt(i);
            if(c==' ')
            {
                c1=sent.charAt(i+1);
                sent1=sent1+" "+Character.toUpperCase(c1);
                i++;
            }
            else sent1=sent1+c;
        }
        System.out.println("Capitalizing each word: "+sent1.trim());       
    }
}