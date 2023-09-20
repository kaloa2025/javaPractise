package Overridingmethods;

public class Manager extends Employee {
    private String dept;

    Manager(int eID, String name, String dept)
    {
        super(eID,name);
        this.dept=dept;
    }
    public String getDetails()
    {
        return super.getDetails()+dept;
    }    
}
