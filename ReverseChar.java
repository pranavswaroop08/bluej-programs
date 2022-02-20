/*A program to accept a string and display thenewstring after reversing each character of the word. Input : India is my CountryOutput:  aidnI siymyrtnuoC*/
 import java.util.Scanner;
 class ReverseChar
 {
     public static void main(String args[])
     {
         String sent, newsent="", word=""; 
         char ch;
         int i;
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string"); 
        sent=sc.nextLine();
        sent=sent+"";
        for(i=0;i<sent.length();i++)
        {
            ch=sent.charAt(i); 
            if(ch!=' ')word = ch+word; 
            else if(ch==' ')
            {
                newsent=newsent+" "+word; word="";
            }
        }
        System.out.println("The string with reversed characters in each word is \n"+newsent);
    }
}