package BuilderPattern;

import java.util.List;

public class ExampleForeach {
    public static void main(String[] args) {
        List<Person> p1=PersonCollection.createList();
        p1.forEach(p->System.out.println(p));
    }
}
