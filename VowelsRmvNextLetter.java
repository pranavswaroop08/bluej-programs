/*To accept a string and display :*(i) the new string after removing all the vowels present init.*Sample Input: COMPUTER APPLICATIONs SAMPLE OUTPUT: CMPTRPPLCTNS*(ii) the new string by replacing only the vowels with the character followingit.*Sample Input: COMPUTER SAMPLE OUTPUT:CPMPVTFR*/
import java.util.Scanner;
class VowelsRmvNextLetter
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        String st,st1="", st2=""; 
        int i; 
        char ch;
        System.out.println("Enter a string"); 
        st=in.nextLine();
        for(i=0;i<st.length();i++)
        {
            ch=st.charAt(i);
                if(ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u')
                continue; 
                else 
                st1=st1+ch;
        }
            System.out.println("The new string after removing the vowels is "+st1);
            for(i=0;i<st.length();i++)
            {
                ch=st.charAt(i);
                if(ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u')
                st2=st2+(char)(ch+1);
                else st2=st2+ch;
            }
            System.out.println("the new string by replacing only the vowels with the character following it is "+st2);
    }
}