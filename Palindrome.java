/*To accept a word and check if it is a palindrome word or not.*/
import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        String w, rw="";
        char ch;
        int i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        w=in.next();
        for(i=w.length()-1;i>=0;i--)
        {
            ch=w.charAt(i);
            rw=rw+ch;
        }
        if(w.equalsIgnoreCase(rw)){
        System.out.println(w+" is a Palindrome word ");
        }
        else
        {
        System.out.println(w+" is not a Palindrome word");
        }    
    }
}