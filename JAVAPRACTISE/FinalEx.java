

public class FinalEx 
{
    private final int num1=10;
    private final int num2;

    public FinalEx(int num2)
    {
        this.num2=num2;
    }
    public int getnum1()
    {
        return num1;
    }
    public int getnum2()
    {
        return num2;
    }
    public static void main(String[] args)
    {
        FinalEx e1=new FinalEx(20);
        System.out.println(e1.getnum1()+" "+e1.getnum2());
    }
    
}
