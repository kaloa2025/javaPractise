package packinterface.Example1;

public class WidgetPro extends Widget implements WidgetSalesCalcs {
    private String type;
    public WidgetPro(double salesPrice, double cost, double weight, String type) {
        super(salesPrice, cost, weight);
        this.type=type;
    }
    @Override
    public String getWidgetType() {
        return type;
    }
    
}
