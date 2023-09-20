package Overridingmethods;

public class Employee {
    private int eID;
    private String name;
    private int salary=01;
    
    Employee(int eId,String name)
    {
        this.eID=eId;
        this.name=name;
    }
    public int getSalary() {
        return salary;
    }
    public String getDetails()
    {
        return "ID: "+eID+"Name: "+name;
    }
    public double calcBonus()
    {
        return this.getSalary()*GoodBonus.getBonusPercent(this);
    }
}
