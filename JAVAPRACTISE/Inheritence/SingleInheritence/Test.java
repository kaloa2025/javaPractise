package Inheritence.SingleInheritence;

public class Test {
    public static void main(String args[])
    {
        System.out.println("Engineer child class");
        Engineer e=new Engineer(01, "Engineer", 000, 0);
        System.out.println(e.getEid()+" "+e.getName()+" "+e.getSsn()+" "+e.getSalary());
        e.setName("Engineer1");
        e.raiseSalary(1000);
        System.out.println(e.getEid()+" "+e.getName()+" "+e.getSsn()+" "+e.getSalary());
        
        System.out.println();
        
        System.out.println("Admin child class");
        Admin a=new Admin(01, "Admin", 000, 0);
        System.out.println(a.getEid()+" "+a.getName()+" "+a.getSsn()+" "+a.getSalary());
        a.setName("Admin1");
        a.raiseSalary(2000);
        System.out.println(a.getEid()+" "+a.getName()+" "+a.getSsn()+" "+a.getSalary());
        
        System.out.println();

        System.out.println("Employee parent class");
        Employee e1=new Employee(01, "Oldname", 000, 10);
        System.out.println(a.getEid()+" "+a.getName()+" "+a.getSsn()+" "+a.getSalary());
        e1.setName("Newname");
        e1.raiseSalary(1000);
        System.out.println(a.getEid()+" "+a.getName()+" "+a.getSsn()+" "+a.getSalary());

        System.out.println();

        System.out.println("Manager child class");
        Manager m1=new Manager(01, "Old manager", 001, 100, "Worker");
        m1.addEmployee("Employee");
        System.out.println(m1.getEid()+" "+m1.getName()+" "+m1.getSsn()+" "+m1.getSalary()+" "+m1.getDept());
        m1.setName(" New Manager");
        m1.raiseSalary(1000);
        System.out.println(m1.getEid()+" "+m1.getName()+" "+m1.getSsn()+" "+m1.getSalary()+" "+m1.getDept());

        System.out.println();

        System.out.println("Director grandchild class");
        Director d=new Director(01, "Director", 001, 10, "Admin", 100);
        System.out.println(d.getBudget());
        d.approveexpenses(1000);
        d.addEmployee("employee");
        d.setName("Director added employee");
        d.raiseSalary(1000);
        System.out.println(d.getEid()+" "+d.getName()+" "+d.getSsn()+" "+d.getSalary()+" "+d.getBudget()+" "+d.getDept());
    }        
}
