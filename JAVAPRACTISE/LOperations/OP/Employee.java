package LOperations.OP;

public class Employee {
    private int id;
    private String fname;
    private String lname;
    public Employee(int i, String string, String string2)
    {
        this.id=i;
        this.fname=string;
        this.lname=string2;
    }
    public String getFname() {
        return fname;
    }
    public int getId() {
        return id;
    }
    public String getLname() {
        return lname;
    }
    @Override
    public String toString() {
        return id+fname+lname;
    }
}
