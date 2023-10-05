package packinterface.Example1;

public class RedPaint implements Scalescalc {
    private String name="Redpaint";
    private double salesPrice=0;
    private double cost=0;
    private double weight=0;


    public RedPaint(double salesPrice, double cost, double weight) {
        this.salesPrice=salesPrice;
        this.cost=cost;
        this.weight=weight;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public double calcSalesPrice() {
        return salesPrice;
    }

    @Override
    public double calccost() {
        return this.cost*this.weight;
    }

    @Override
    public double calcProfit() {
        return this.calcSalesPrice()-this.calccost();
    }

}
