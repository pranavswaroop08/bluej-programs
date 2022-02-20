import java.util.*;
public class factorial
 {
     int fact;
    int fact(int z)
    {
        for(int i = 1; i<= z; i++)
        {
             fact = fact * i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        factorial ps = new factorial();
        System.out.println("Enter a number to calculate the series");
        int a = in.nextInt();
        double sum = 0;
        for (int p = i; i <= 10; i++)
        {
            sum = sum + Math.pow(a,2*i)/ps.fact(i);
        }
        System.out.println("Sum of the series : "+sum);
        }
}
