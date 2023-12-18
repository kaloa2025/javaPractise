package LOperations;

public class Person {
    private String name;
    private String city;
    private int age;
    public Person(String name, String city, int age) 
    {
        this.name=name;
        this.city=city;
        this.age=age;
    }
    public Person() {
    }
    public String getCity() {
        return city;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return name+city+age;
    }
}
