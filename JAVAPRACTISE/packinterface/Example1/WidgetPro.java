package packinterface.Example1;

public class WidgetPro extends Widget implements WidgetSalesCalcs {
    private String types;
    public WidgetPro(double salesPrice, double cost, double weight, String types) {
        super(salesPrice, cost, weight);
        this.types=types;
    }
    @Override
    public String getWidgetType() {
        return types;
    }
}
