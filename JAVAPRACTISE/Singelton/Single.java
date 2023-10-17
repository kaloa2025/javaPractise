package Singelton;

public class Single {
    private static final Single s=new Single();
    private Single()
    {
        
    }
    public static Single createobject()
    {
        return s;
    }    
}
