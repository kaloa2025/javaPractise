package packinterface;

import packinterface.Example1.CrushedRock;
import packinterface.Example1.ItemReport;
import packinterface.Example1.RedPaint;
import packinterface.Example1.Scalescalc;
import packinterface.Example1.Widget;

public class Test {
    public static void main(String[] args) {
        // Result r=new Result();
        // r.Sum(2,5);
        // CrushedRock cr=new CrushedRock(10, 12, 50);
        // System.out.println("Profit"+cr.calcProfit());
        // System.out.println("SalesPrice"+cr.calcSalesPrice());
        // System.out.println("Cost"+cr.calccost());
        // System.out.println("Name"+cr.getname());
        // Scalescalc s=new CrushedRock(5, 10, 7);
        // System.out.println("Profit"+s.calcProfit());
        // System.out.println("SalesPrice"+s.calcSalesPrice());
        // System.out.println("Cost"+s.calccost());
        // System.out.println("name"+s.getname());
        // //
        Scalescalc[] il=new Scalescalc[5];
        ItemReport report=new ItemReport();
        
        il[0]=new CrushedRock(12,10, 60);
        il[1]=new RedPaint(22,18,20);
        il[2]=new Widget(60,50,10);

        for(Scalescalc items:il)
        {
            report.printItemData(items);
        }

    }
}
