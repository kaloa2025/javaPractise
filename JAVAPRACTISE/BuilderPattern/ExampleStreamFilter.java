package BuilderPattern;

import java.util.List;
import java.util.function.Predicate;

public class ExampleStreamFilter {
    public static void main(String[] args) {
        List<Person> p1=PersonCollection.createList();
        Person p=new Person();

        Predicate<Person> all=a->a.getId()>=2;
        p1.stream().filter(all).forEach(a->a.printSummary());
    }
}
