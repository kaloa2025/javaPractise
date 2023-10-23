package Extra;


public class FinalEx_Person 
{
    private final int aadhar;
    private final int pan;
    private final String name;
    private int age;
    
    public FinalEx_Person(int a,int p,String n,int age)
    {
        this.aadhar=a;
        this.pan=p;
        this.name=n;
        this.age=age;
    }

    public int getaadhar()
    {return aadhar;}
    public int getpan()
    {return pan;}
    public String getname()
    {return name;}
    public int getage()
    {return age;}

    public static void main(String[] args)
    {
        FinalEx_Person p =new FinalEx_Person(123456789, 1001, "Aalok", 19);
        System.out.println(p.getname()+" "+p.getage()+" "+p.getaadhar()+" "+p.getpan());
    }

}
