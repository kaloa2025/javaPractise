package Inheritence.SingleInheritence;

public class Employee {
    private int eid;
    private String name;
    private int ssn;
    private double salary;

    public Employee(int id,String name,int ssn,double salary)
    {
        this.eid=id;
        this.name=name;
        this.ssn=ssn;
        this.salary=salary;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void raiseSalary(double raise)
    {
        this.salary=(this.salary+raise);
    }
    
    public int getEid() {
        return eid;
    }
    public String getName() {
        return name;
    }
    public int getSsn() {
        return ssn;
    }
    public double getSalary() {
        return salary;
    }
}
