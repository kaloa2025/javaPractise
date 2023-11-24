package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class PersonCollection {
    public static List<Person> createList(){
        List<Person> l=new ArrayList<>();

        Person p1=BuilderPerson.createObject().setId(1).setName("Aalok").setMobile(1234567890L).setGender(Gender.male).setadd("nagpur").build();
        Person p2=BuilderPerson.createObject().setId(2).setName("YAsh").setMobile(1234567890L).setGender(Gender.male).setadd("Chandrapur").build();
        Person p3=BuilderPerson.createObject().setId(3).setName("Lavish").setMobile(1234567890L).setGender(Gender.male).setadd("nagpur").build();
        l.add(p1);
        l.add(p2);
        l.add(p3);
        return l;
    }
}
