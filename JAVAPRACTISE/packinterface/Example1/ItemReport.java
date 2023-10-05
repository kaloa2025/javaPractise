package packinterface.Example1;
public class ItemReport {
    public void printItemData(Scalescalc item) {
        System.out.println("name : "+item.getname()+'\n');
        System.out.println("Profit : "+item.calcProfit()+'\n');
        System.out.println("SalesPrice : "+item.calcSalesPrice()+'\n');
        System.out.println("Cost : "+item.calccost()+'\n');
    }
}