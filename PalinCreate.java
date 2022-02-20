/*Program to accept a non-palindrome word and display the new word after making it a palindrome. Sample input : ICSESample Output: ICSEESCI*/
import java.util.*; 
class PalinCreate
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        String word, rev="", pal;
        char ch;
        int len, i;
        System.out.println("Enter the word"); 
        word=in.next();
        len=word.length(); 
        for(i=0;i<len;i++)
        {
            ch=word.charAt(i); 
            rev=ch+rev;
        }
        pal=word+rev;
        System.out.println("Palindrome string:"+pal);
    }
}