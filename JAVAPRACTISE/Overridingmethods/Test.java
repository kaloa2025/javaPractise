package Overridingmethods;
public class Test {
    public static void main(String[] args)
    {
        Employee e=new Employee(10, "Aalok");
        Manager m=new Manager(11, "Yash", "Electrical");
        System.out.println(e.getDetails());
        System.out.println(m.getDetails());
        Employee z=new Manager(12, "Prajwal", "Mechanical");
        System.out.println(z.getDetails());
        System.out.println(z.calcBonus());
    }
}
