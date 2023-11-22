package BuilderPattern;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Person>l1=PersonCollection.createList();
        for(Person p:l1)
        {
            System.out.println(p);
        }
    }
}
