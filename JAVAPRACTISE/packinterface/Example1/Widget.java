package packinterface.Example1;

public class Widget implements Scalescalc {
    private String name="Widget";
    private double salesPrice=0;
    private double cost=0;
    private double weight=0;

    public Widget(double salesPrice, double cost, double weight) {
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
