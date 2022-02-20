/*WAP to accept a word and display ASCII value of each character in two columns; character and ascii code.*/
import java.util.*; 
class CharAsciiVal
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        String s;
        System.out.println("Enter a word");
        s=in.next();
        System.out.println("Char\tASCII Code");
        for(int i=0; i<s.length();i++)
        {
            char c = s.charAt(i);
            System.out.println(c+"\t"+(int)c);
        }
    }
}