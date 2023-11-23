package BuilderPattern2;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String ssn;

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
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
    public String getSsn() {
        return ssn;
    }
    
    @Override
    public String toString() {
        return id+name+ssn+salary;
    }
}
