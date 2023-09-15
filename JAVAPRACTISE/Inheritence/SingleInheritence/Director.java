package Inheritence.SingleInheritence;

public class Director extends Manager {
    private double budget;
    public Director(int id,String name,int ssn,double salary,String dept,double budget)
    {
        super(id,name,ssn,salary,dept);
        this.budget=budget;
    }
    public String approveexpenses(int expenses)
    {
        if(expenses<100)
        {
        return "Yes";
        }
        else
        {
            return "No";
        }

    }
    public double getBudget() {
        return this.budget;
    }
}
