package Inheritence;

//super() - parameterized/default
//super.methodName()
//super var

public class E2 {
    private int id;
    private String name;
    private double salary;
    
    public E2(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

}
