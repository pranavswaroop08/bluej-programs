import java.util.*;
public class sum {
    int p ,q ;
    double r , s = 0.1;
       void printSum(int n)
       {    
           for(int i = 1; i <= n; i++)
           {
               p = p + i;
           }
           System.out.println("the sum is = " + p);
       }
       void printSum(int a , int b)
       {
           if( a < b)
           {
            for(int i = a; i <= b; i++)
            {
             q = q + i; 
            }
            System.out.println("the sum of the range is = " + q);
           }
           else
           {
               System.out.println("please check the value of a and b i.e criteria (a < b)");
           }
       }
       void printSum()
       {
           for(double i = 1.0; r <= 2.0; i++)
           {
              r = r + s;
           }
           System.out.println("the sum of 1 + 0.1 until 2 is " + r);


       }
       public static void main(String args[])
       {
         Scanner in = new Scanner(System.in);
         sum ps = new sum();
         System.out.println("Enter the natural number to find the series");
         int a = in.nextInt();
         System.out.println("Enter the number of the range to find the sum of the natural numbers");
         int b = in.nextInt();
         int c = in.nextInt();
         ps.printSum(a);
         ps.printSum(b , c);
         ps.printSum();
       }
}
