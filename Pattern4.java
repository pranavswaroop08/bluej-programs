/* To display the given pattern Sample Input: ICSESample Output:ICSE*/
import java.util.*;
class pattern4
{
    public static void main(String args[])
    {
        String x="ICSE"; 
        int i;
        for (i=0;i<x.length();i++)
        {
            System.out.println(x.substring(i, (i+1)));
        }
    }
}