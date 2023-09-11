package JAVAPRACTISE;
public class Sample
{
    private int num1;
    private static int num2;
    public static void main(String[] args)
    {
        Sample s1=new Sample();
        s1.num1=10;
        s1.num2=20;
        Sample s2=new Sample();
        s2.num1=40;
        s2.num2=50;
        System.out.println(s1.num1+" "+Sample.num2);
        System.out.println(s2.num1+" "+Sample.num2);
    }
}
