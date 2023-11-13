package Nested;

public class Member {
    public void meth()
    {
        class Minner{
            public void m3()
            {
                System.out.println("Hi this is member class");
                System.out.println("Welcome");
                System.out.println("What is your name");
                
            }
        }
        Minner m=new Minner();
        m.m3();
    }
}
