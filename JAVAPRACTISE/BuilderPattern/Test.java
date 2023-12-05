package BuilderPattern;

import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Person>l1=PersonCollection.createList();
        Predicate<Person>massPredicate=t->t.getName().equals(t);
        l1.stream().filter(massPredicate).forEach(t->t.printSummary());

        // for(Person p:l1)
        // {
        //     System.out.println(p);
        // }
    }
}
