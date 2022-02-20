/*To accept a sentence and find the frequency ofUpper case, lowercase, digits and special characters and print.*/
import java.util.*;
class FreqofULDSp
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s;
        char c;
        int i, u=0, l=0, d=0, sp=0;
        System.out.println("Enter a sentence");
        s=in.nextLine();
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(Character.isUpperCase(c))u++;
            else if(Character.isLowerCase(c)) 
               l=l+1;
               else if(Character.isDigit(c))d++;
               else sp++;
            }
            System.out.println("No. of upper case characters = "+u);
            System.out.println("No. of lower case characters = "+l);
            System.out.println("No. of digits                = "+d);
            System.out.println("No. of special characters    = "+sp);
            
        }
    }
