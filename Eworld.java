import java.util.*;
public class Eworld
{
    String name;
    Double totCost , dis , amt;
    Eworld()
    {
        name = " ";
        totCost = 0.0;
        dis = 0.0;
        amt = 0.0;
    }
    void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the customer ");
        name = in.next();
        System.out.println("Enter the total cost of items purchased");
        totCost = in.nextDouble();
    }
    void compute()
    {
        if(totCost <= 5000)
        {
            amt = totCost - 5/100 * totCost;
        }
        else if(totCost >= 5001 && totCost <= 20000)
        {
            amt = totCost - 12/100 * totCost;
        }
        else if(totCost >= 20001 && totCost <= 50000)
        {
            amt = totCost - 20/100 * totCost;
        }
        else if(totCost < 50000)
        {
            amt = totCost - 30/100 * totCost;
        }
    }
    void display()
    {
        System.out.println("NAME : "+ name);
        System.out.println("TOTAL COST OF THE ITEMS : " + totCost);
        System.out.println("DISCOUNT IN RUPEES : "+ dis);
        System.out.println("AMOUNT TO BE PAYED : " + totCost);
    }
    public static void main(String args[])
    {
        Eworld ps = new Eworld();
        ps.accept();
        ps.compute();
        ps.display();
    }
}
