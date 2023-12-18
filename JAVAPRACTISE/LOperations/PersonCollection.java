package LOperations;

import java.util.ArrayList;
import java.util.List;

public class PersonCollection {
    public static List<Person> createList()
    {
        List<Person> l=new ArrayList<>();
        Person p1=BuilderPerson.createObject().setAge(21).setCity("Nagpur").setName("Aalok").build();
        l.add(p1);
        return l;
    }
}
