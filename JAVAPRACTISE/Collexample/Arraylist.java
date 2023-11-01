package Collexample;
import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<Integer>();
        //old method
        list.add(new Integer(12));
        list.add(new Integer(13));
        for(Integer x:list)
        {
            System.out.println(x);
        }
        //new method
        List<String> str=new ArrayList<String>();
        str.add("Aalok");
        str.add("Yash");
        str.add("Lavish");

        for(String s:str)
        {
            System.out.println(s);
        }
    }   
}
