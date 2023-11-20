package Collexample.Comparable;

public class Student implements Comparable<Student>{
    private String name;
    private int id=0;
    private double cgpa=0.0;
    
    public Student(String name,int id,double cgpa)
    {
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
    }
    public String getName() 
    {
        return this.name;
    }

    public int compareTo(Student s) 
    {
        int result=this.name.compareTo(s.getName());
        if(result>0){return 1;}
        else
        {
            if(result<0)
            {return -1;}
            else
            {return 0;}
        }
    }
    @Override
    public String toString() 
    {
        return name+id+cgpa;
    }
    
}

//1-positive:least priority
//0-same:middle priority
//-1-negative : most priority

