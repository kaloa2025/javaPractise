package packinterface.Example1;
//parent class
public interface Scalescalc {
    public String getname();
    public double calcSalesPrice();
    public double calccost();
    public double calcProfit();
    
    public static final String ReportTitle = "Item Report";
    public static void printItemArray(Scalescalc[] items)
    {
        System.out.println(ReportTitle);
        for(Scalescalc item:items)
        {
            System.out.println("--"+item.getname()+"Report -- ");
            System.out.println("Sales Price: "+item.calcSalesPrice());
            System.out.println("Cost: "+item.calccost());
            System.out.println("Profit : "+item.calcProfit());
        }
    }
}
