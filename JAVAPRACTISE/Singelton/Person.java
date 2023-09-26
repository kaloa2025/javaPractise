package Singelton;

public class Person {
    private String name;
    private long mob;
    public Person(String name,long mob)
    {
        this.name=name;
        this.mob=mob;
    }
    public long getMob() {
        return mob;
    }
    public String getName() {
        return name;
    }
    @Override 
    public String toString()
    {
        return name+" "+mob;
    }
}
