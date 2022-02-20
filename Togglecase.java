/*Toaccept a sentence and convert cases of letters only, leaving other characters as it is.Display the new String Sample Input : Today is Monday, 31 st daySample Input : tODAY IS mONDAY, 31 ST DAY*/
import java.util.*;
class Togglecase
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s, s1="";
        char c;
        int i;
        System.out.println("Enter a sentence")
        ;s=in.nextLine();
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(Character.isUpperCase(c))
            {
            s1=s1+Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c))
            {
            s1=s1+Character.toUpperCase(c);
            }
            else
            {
            s1=s1+c;
            }
        }
        System.out.println("Sentence entered : " +s)
        ;System.out.println("Sentence in toggle case is : "+s1);
    }
}