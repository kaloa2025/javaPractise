package Collexample;
import java.util.ArrayList;
import java.util.List;
// import java.util.io.*;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        //old method
        list.add(new Integer(12));
        list.add(new Integer(13));
        for(Integer x:list)
        {
            System.out.println(x);
        }
        List<String> str=new ArrayList<>();
        str.add("Aalok");
        str.add("Yash");
        str.add("Lavish");

        for(String s:str)
        {
            System.out.println(s);
        }
    }   
}
