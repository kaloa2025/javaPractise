package Collexample;
import java.util.LinkedList;
import java.util.List;

public class Linkedliste {
    public static void main(String[] args) {
        List<Integer> l =new LinkedList<Integer>();
        //new method
        l.add(1);
        l.add(2);
        l.add(3);

        for(Integer s:l)
        {
            System.out.println(s);
        }
    }   
}
