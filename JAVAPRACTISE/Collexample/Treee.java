package Collexample;
import java.util.Set;
import java.util.TreeSet;
public class Treee {
    public static void main(String[] args) {
        Set<String> s=new TreeSet<>();
        s.add("one");
        s.add("two");

        for(String i:s)
        {
            System.out.println(i);
        }
    }
}
// only unique elements - duplicate elements not allowded
// has no idex