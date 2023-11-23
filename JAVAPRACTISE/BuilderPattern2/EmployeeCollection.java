package BuilderPattern2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCollection {
    public static List<Employee> createList()
    {
        List<Employee> l=new ArrayList<>();
        Employee e1=BuilderEmployee.createObject().setId(1).setName("Aalok").setSalary(10.0D).setSsn("Sn01").build();
        l.add(e1);
        return l;
    }
    
}
