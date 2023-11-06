package Collexample;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMAp {
    public static void main(String[] args) {
        TreeMap<String,String> pl=new TreeMap<>();
        //Map<String,String> pl=new TreeMap<>();
        pl.put("S01","aalok");
        pl.put("S02","yash");
        pl.put("S03","Lavish");
        pl.put("S002", "Kaiydinge");
        Set<String> keys=pl.keySet();

        for(String s:keys)
        {
            System.out.println(s+" "+pl.get(s));
        }
    }
}
//