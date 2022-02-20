/*Programto accept a string and convert it to upper case.Count and output the number of double lettersequences that exit in the string.Sample input: She was Feeding the little rabbit with an appleSample output: 4*/
import java.util.*; 
class DoubleLetterFrequency
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in); 
        String s;
        int i, ctr=0; 
        char ch1, ch2;
        System.out.println("Enter the sentence"); 
        s=in.nextLine();
        s=s.toUpperCase(); 
        int len=s.length();
        for(i=0;i<len-1;i++)
        {
            ch1=s.charAt(i);
            ch2=s.charAt(i+1);
            if(Character.isLetter(ch1)&&Character.isLetter(ch2))
            {
                if(ch1==ch2) ctr++;
            }
        }
        System.out.println("Number of double letter sequences: "+ctr);
    }
}