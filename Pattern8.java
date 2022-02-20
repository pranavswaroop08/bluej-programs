/* A program to print the following pattern:BBL     BLU  BLUEBLUEJ*/
class Pattern8
{
    public static void main (String args[])
    {
        String s="BLUEJ";
        int i,j,len; 
        len=s.length(); 
        for(i=0;i<len;i++)
        {System.out.println(s.substring(0, i+1));
        }
    
    }
}
