package Inheritence;

public class M2 extends E2 {
    private String dept;
    public M2(int id,String name,double salary,String dept)
    {
        super(id,name,salary);
        this.dept=dept;
    }
    public String getDept() {
        return dept;
    }
    
}

