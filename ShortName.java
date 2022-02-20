/*Toinput full name and display in shortas shown.Input : Subhash Chandra BoseOutput : S.C. Bose*/
import java.util.*;
class ShortName
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
         String st, sn, st1="",st2;int i,p;
          char ch;System.out.println("Enter full name:");
           st=in.nextLine();
            st=" "+st;
            p=st.lastIndexOf(' ');
             sn=st.substring(p);
              for(i=0;i<p;i++)
               {
                  ch=st.charAt(i);
                   if(ch==' ')st1= st1+st.charAt(i+1)+".";
                }
                st2=st1+sn;System.out.println("Name entered : "+st);
                System.out.println("Name with initials and surname:"+st2);
    }
 }