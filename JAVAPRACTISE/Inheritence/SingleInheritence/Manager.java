package Inheritence.SingleInheritence;

public class Manager extends Employee
{

        private String dept;
        public Manager(int id,String name,int ssn,double salary,String dept)
        {
            super(id,name,ssn,salary);
            this.dept=dept;
        }
        public String addEmployee(String post)
        {
            if(post=="employee")
            {
                return "added";
            }
            else
            {
                return "notadded";
            }
        }
        public String getDept() {
            return dept;
        }
}