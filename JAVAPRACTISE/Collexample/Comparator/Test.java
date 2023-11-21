package Collexample.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> s=new ArrayList<Student>();
        Comparator<Student> sortname=new SortName();
        Comparator<Student> sortmarks=new SortMarks();

        s.add(new Student("Aalok", 10));
        s.add(new Student("Yash", 20));
        s.add(new Student("Lavish", 30));

        Collections.sort(s,sortname);
        for(Student i:s)
        {
            System.out.println(i);
        }

        Collections.sort(s,sortmarks);
        for(Student i:s)
        {
            System.out.println(i);
        }
    }   
}
