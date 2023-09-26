package Singelton;
public class Test {
    public static void main(String args[])
    {
        Single s1=Single.createobject();
        Single s2=Single.createobject();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
