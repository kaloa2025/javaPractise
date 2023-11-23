package BuilderPattern2;

public class BuilderEmployee {
    private Employee e;
    public BuilderEmployee(Employee e)
    {
        this.e=e;
    } 
    
    public static BuilderEmployee createObject()
    {
        return new BuilderEmployee(new Employee());
    }

    public BuilderEmployee setId(int id)
    {
        e.setId(id);
        return this;
    }
    public BuilderEmployee setName(String name)
    {
        e.setName(name);
        return this;
    }
    public BuilderEmployee setSsn(String ssn)
    {
        e.setSsn(ssn);
        return this;
    }
    public BuilderEmployee setSalary(double salary)
    {
        e.setSalary(salary);
        return this;
    }

    public Employee build()
    {
        return e;
    }
}
