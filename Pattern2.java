/* program to store a word(say, BLUEJ) and display the pattern:BLUEJ LUEJUEJ EJJ*/
class Pattern2
{
    public static void main (String args[])
    {
        String s="BLUEJ"; 
        int i,j,len;
        len=s.length();
        for(i=0;i<len;i++)
        {
            System.out.println(s.substring(i));
        }
    }
}