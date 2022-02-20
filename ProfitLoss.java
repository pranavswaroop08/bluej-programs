import java.util.*;
public class ProfitLoss {
    double cp , sp , per;
    ProfitLoss()
    {
        sp = 0.0;
        cp = 0.0;
        per = 0.0;
    }
    void calDisplay()
    {
        Scanner in = new Scanner(System.in);
       System.out.println("Enter the cost price");
       cp = in.nextDouble();
       System.out.println("Enter the selling price");
       sp = in.nextDouble();
       if(cp > sp)
        {
            per = (cp-sp)/cp * 100.0;
            System.out.println("The loss percentage is "+ per);
        }       
        else if(sp > cp)
        {
            per = (sp-cp)/cp * 100.0;
            System.out.println("The profit percentage is "+ per);
        }
    }
    public static void main(String []args)
    {
        ProfitLoss ps = new ProfitLoss();
        ps.calDisplay();
    }
}
