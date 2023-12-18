package LOperations;

public class BuilderPerson {
    private Person p;
    public BuilderPerson(Person p)
    {this.p=p;}
    public static BuilderPerson createObject()
    {
        return new BuilderPerson(new Person());
    }

    public BuilderPerson setName(String name)
    {
        p.setName(name);
        return this;
    }
    public BuilderPerson setCity(String city)
    {
        p.setCity(city);
        return this;
    }
    public BuilderPerson setAge(int age)
    {
        p.setAge(age);
        return this;
    }

    public Person build()
    {
        return p;
    }
}
