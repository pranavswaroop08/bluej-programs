/* program to store a word(say, BLUEJ) and display the pattern:JEJ     UEJLUEJBLUEJ*/
class Pattern5
{
    public static void main (String args[])
    {
        String s="BLUEJ"; 
        int i,j,len;
        len=s.length(); 
        for(i=len-1; i>=0; i--)
        {
            System.out.println(s.substring(i));
        }
    }
}