package objectexample;
public class Test {
    public static void main(String[] args)
    {
        Employee e1=new Employee();
        Employee e2=new Employee();

        e1.setId(01);
        e1.setName("Aalok");
        e2.setId(02);
        e2.setName("Yash");

        System.out.println(e1);
        System.out.println(e2);
        
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e1.equals(e2));
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
