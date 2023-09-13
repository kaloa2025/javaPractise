package Inheritence;

public class Test {
    public static void main(String[] args)
    {
        Manager m=new Manager();
        m.setId(1);
        m.setName("aalok");
        m.setdept("Systems");
        System.out.println(m.getId());
        System.out.println(m.getName());
        System.out.println(m.getdept());
    }
}
