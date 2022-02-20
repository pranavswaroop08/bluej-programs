/* A program to accept a sentence and find the frequency of the word entered  by the user in a stringInput: The children are playing in the Play ground Frequency of the word  to be searched: the SampleOutput:2*/
import java.util.Scanner; 
class WordFrequency
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        String st,word="",swd;
        char ch;
        int i,f=0;
        System.out.println("Enter a Sentence"); 
        st=in.nextLine();
        st=st+" ";
        System.out.println("Enter the word whose frequency is to be found");
        swd=in.next();
        for(i=0;i<st.length();i++)
        {
            ch=st.charAt(i); 
            if(ch!=' ')
            word=word+ch; 
            else
            {
                if(word.equalsIgnoreCase(swd))
                 f=f+1;word="";
            }
        }
            System.out.println("The frequency of the word-"+swd+ " in the sentence is "+f);
    }
}