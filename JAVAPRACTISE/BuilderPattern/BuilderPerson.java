package BuilderPattern;

public class BuilderPerson {
    private Person p;
    public BuilderPerson(Person p)
    {
        this.p=p;
    }
    public static BuilderPerson createObject()
    {
        return new BuilderPerson(new Person());
    }

    public BuilderPerson setId(int id)
    {
        p.setId(id);
        return this;
    }
    public BuilderPerson setName(String name)
    {
        p.setName(name);
        return this;
    }
    public BuilderPerson setMobile(long L)
    {
        p.setMobile(L);
        return this;
    }
    public BuilderPerson setadd(String add)
    {
        p.setAdd(add);
        return this;
    }
    public BuilderPerson setGender(Gender gender)
    {
        p.setGender(gender);
        return this;
    }
    public Person build()
    {
        return p;
    }

}
