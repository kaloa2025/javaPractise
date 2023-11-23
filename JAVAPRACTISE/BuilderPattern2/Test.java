package BuilderPattern2;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee>l1=EmployeeCollection.createList();
        for(Employee e:l1)
        {
            System.out.println(e);
        }
    }
    
}
