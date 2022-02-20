import java.util.*;
class Shortform
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s, s1="";
        char c;
        int i;
        System.out.println("Enter a sentence");
        s=" "+in.nextLine();
              for(i=0;i<s.length();i++)
              {
                  c=s.charAt(i);
                  if(c==' ')
                  s1=s1+s.charAt(i+1);
               }
                System.out.println("Full form : " +s);
                System.out.println("Short form : " +s1.toUpperCase());
    } 
}