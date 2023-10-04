package Nested;

public class Test {
    public static void main(String[] args)
    {
        //Nested local class
        /*Outer o=new Outer();
        Outer.middle m=o.new middle();
        Outer.Inner i=o.new Inner();
        i.m();
        m.m();*/
        //static nested class
        Outer2.Inner j=new Outer2.Inner();
        j.m();
        //Member class
        Member k=new Member();
        k.meth();
        //anonymous class : w/o implementing or extending override a method to create an anonymous class
        Outer l=new Outer(){
            public void ano()
            {
                System.out.println("Helllo from test");
            }
        };
        l.ano();
    }
}
