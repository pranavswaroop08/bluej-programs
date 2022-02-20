/* program to store a word(say, BLUEJ) and display the pattern:BLUEJ BLUEBLU BLB*/
class Pattern
{
    public static void main (String args[])
    {
        String s; 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        s = in.next();
        int i,j,len;
        len=s.length();
        for(i=len;i>=0;i--)
        {
            System.out.println(s.substring(0,i));
        }
    }
}
