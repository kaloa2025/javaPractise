package Collexample.Comparable;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Student> slist=new TreeSet<>();

        slist.add(new Student("Aalok", 1, 10));
        slist.add(new Student("Yash", 2, 9));
        slist.add(new Student("Lavish", 3, 8));

        for(Student i:slist)
        {
            System.out.println(i);
        }
        
    }
}
