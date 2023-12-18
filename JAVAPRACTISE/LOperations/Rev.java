package LOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Rev {
    public static void main(String[] args) {
        // List<String>  mylist = new ArrayList<String>(); 
        // mylist.add("raina"); 
        // mylist.add("regina"); 
        // mylist.add("ankita"); 
        // mylist.add("alex"); 
  
        // System.out.println("Original List : " + mylist);         
        // Collections.reverse(mylist);   
        // System.out.println("Modified List: " + mylist); 

        IntStream stream = IntStream.of(2, 3, 4, 5, 6, 7, 8); 
  
        // OptionalDouble obj = stream.average(); 
  
        // if (obj.isPresent()) { 
        //     System.out.println(obj.getAsDouble()); 
        // } 
        // else { 
        //     System.out.println("-1"); 
        // }
        
        int sumOfElements = stream.sum(); 
        System.out.println(sumOfElements); 



    }
}
