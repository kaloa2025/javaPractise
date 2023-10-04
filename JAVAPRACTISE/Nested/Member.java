package Nested;

public class Member {
    public void meth()
    {
        class Minner{
            public void m3()
            {
                System.out.println("Hellooo");
            }
        }
        Minner m=new Minner();
        m.m3();
    }
}
