package packinterface;

import packinterface.Example1.CrushedRock;
import packinterface.Example1.Scalescalc;

public class Test {
    public static void main(String[] args) {
        Result r=new Result();
        r.Sum(2,5);
        CrushedRock cr=new CrushedRock(10, 12, 50);
        System.out.println("Profit"+cr.calcProfit());
        System.out.println("SalesPrice"+cr.calcSalesPrice());
        System.out.println("Cost"+cr.calccost());
        System.out.println("Name"+cr.getname());
        Scalescalc s=new CrushedRock(5, 10, 7);
        System.out.println("Profit"+s.calcProfit());
        System.out.println("SalesPrice"+s.calcSalesPrice());
        System.out.println("Cost"+s.calccost());
        System.out.println("name"+s.getname());
    }
}
