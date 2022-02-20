/*WAP to input an alphabet in upper case/lower case and display thenext alphabet accordingly(i.e. afollows b,.............z followsa)*/import java.util.*;
 class NextLetter
 {
     public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter a letter");
         char ch=in.next().toLowerCase().charAt(0);
          char ch1=' ';
          if(ch>='a' && ch<='y')
           {
               ch1=(char)(ch+1);
           }
           else if(ch=='z') 
           {
               ch1=(char)(ch-25);
           }
           System.out.println("Input Letter = "+ch);
            System.out.println("Next Letter = "+ch1);
   }
}