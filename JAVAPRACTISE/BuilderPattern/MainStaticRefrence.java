package BuilderPattern;

import java.util.List;

public class MainStaticRefrence {
    public static void getPersons(Person p)
    {
        System.out.println(p);
    }
    public static void main(String[] args) {
        List<Person> p1=PersonCollection.createList();
        p1.forEach(x->MainStaticRefrence.getPersons(x));
        p1.forEach(MainStaticRefrence::getPersons);
    }
}
