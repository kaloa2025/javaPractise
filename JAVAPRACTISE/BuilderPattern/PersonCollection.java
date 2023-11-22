package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class PersonCollection {
    public static List<Person> createList(){
        List<Person> l=new ArrayList<>();

        Person p1=BuilderPerson.createObject().setId(1).setName("Aalok").setMobile(1234567890L).setGender(Gender.male).setadd("nagpur").build();
        l.add(p1);
        return l;
    }
}
