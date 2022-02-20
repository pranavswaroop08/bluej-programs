/*To accept a word and display the word in piglatin form Input : Pencil  Output : encilPay */
import java.util.*;
class PiglatinWord
{
    public static void main(String args[])
    {
        String w, pw;
         char c;
          int i;
          Scanner in=new Scanner(System.in);
          System.out.println("Enter a string");
          w=in.next();
          for(i=0;i<w.length();i++)
          {
              c=w.charAt(i);
              if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
              break;
            }
            pw=w.substring(i) + w.substring(0, i) + "ay";
            System.out.println("Piglatin form of the word : "+pw);
    }
}