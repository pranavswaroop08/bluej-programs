/*To accept a sentence and find the frequency of spaces, words, characters*/
import java.util.*;
class FreqofSpWC
    {
     public static void main(String args[])
            {
             Scanner in=new Scanner(System.in); 
             String s;
             char c;
             int i, f=0;
             System.out.println("Enter a sentence");
             s=in.nextLine();
                   for(i=0;i<s.length();i++)
                   {
                       c=s.charAt(i);
                       if(Character.isWhitespace(c))
                       {
                       f++;
                       }
                    System.out.println("Number of spaces = "+f);
                    System.out.println("Number of words  = "+(f+1));
                       System.out.println("Number of characters= "+s.length());
                    }
                }
            
        }
    
     