package Collexample.Comparator;
public class Student{
    private String name;
    private int marks=0;

    public Student(String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    @Override
    public String toString() {
        return name+marks;
    }

}
// compare method->comparator method