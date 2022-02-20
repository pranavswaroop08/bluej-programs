/*WAP to accept a string and form and display the new string after replacing all the vowels with star (*) Input :  Flowers are beautifulOutput : Fl*w*rs  *r*  b***t*f*l*/
import java.util.*; 
class VowelAndStar
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        String s, s1="";
        System.out.println("Enter a word");
        s=in.nextLine();
        for(int i=0; i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ||c=='a' || c=='e' || c=='i' || c=='o' || c=='u')s1=s1+'*';
            else s1=s1+c;     
        }
        System.out.println("The String entered :  "+s);
        System.out.println("The new String     :  "+s1);
    }
}