package Singelton;

public class SP {
    private static final Person p= new Person("Aalok", 7218599560L);
    private SP(){}
    public static Person createobj()
    {
        return p;
    }
}
