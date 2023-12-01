package MethodRefence;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public void PersonInfo(Person p)
    {
        System.out.println(p);
    }
    public static void main(String[] args) {
        List<Person> p=new ArrayList<>();
        p.add(new Person(1, "Aalok", 18, Gender.male));
        p.add(new Person(2, "Yash", 40, Gender.male));
        p.add(new Person(3, "Lavish", 50, Gender.male));
        Test t=new Test();
        //p.forEach(r->t.PersonInfo(r));
        p.forEach(t::PersonInfo);
        //p.forEach(System.out::println);
    }
}
