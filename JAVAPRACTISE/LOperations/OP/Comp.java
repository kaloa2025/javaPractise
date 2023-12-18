package LOperations.OP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import LOperations.OP.Employee;

public class Comp {
    private static ArrayList<Employee> UnsortedEmployeeDetails()
    {
        ArrayList<Employee> list = new ArrayList<>();
        list.add( new Employee(2, "Ankita", "Mishra") );
        list.add( new Employee(1, "Alex", "Gussin") );
        list.add( new Employee(4, "Raina", "Nair") );
       
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Employee> employees = UnsortedEmployeeDetails();
        Comparator<Employee> compareByName = Comparator.comparing(Employee::getFname).thenComparing(Employee::getLname);
        Collections.sort(employees, compareByName);
        System.out.println(employees);

    }
}
