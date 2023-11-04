package Collexample;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMAp {
    public static void main(String[] args) {
        Map<String,String> pl=new TreeMap<>();
        pl.put("S001","aalok");
        pl.put("S002","yash");
        pl.put("S003","Lavish");

        pl.put("S002", "Chu");
        Set<String> keys=pl.keySet();

        for(String s:keys)
        {
            System.out.println(s+" "+pl.get(s));
        }
    }
}
