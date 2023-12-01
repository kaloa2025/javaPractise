package MethodRefence;

public class Person {
    public int id;
    public String name;
    public int age;
    public Gender gender;
    public Person(int id,String name,int age,Gender gender)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public int getAge() {
        return age;
    }
    public Gender getGender() {
        return gender;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return id+name+age+gender;
    }
}
