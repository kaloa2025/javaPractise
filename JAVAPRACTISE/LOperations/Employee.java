package LOperations;

public class Employee {
    private String name;
    private String title;
    private int salary;
    public Employee(String name, String title, int salary) 
    {
        this.name=name;
        this.title=title;
        this.salary=salary;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public String getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return name+title+salary;
    }
}
