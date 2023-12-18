package LOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GernExm {
            public static void main(String[] args) 
            {
                // List<String> list = Arrays.asList("Ram","Shyam","Shiv","Mahesh");
                // String result=  list.stream().collect(Collectors.joining());
                // System.out.println(result);
                // result=  list.stream().collect(Collectors.joining(","));
                // System.out.println(result);
                
                Map<Boolean, List<Long>> m = IntStream.range(1, 10).mapToObj(Long::new).collect(Collectors.partitioningBy(i -> i % 2 == 0));
                System.out.println(m);

            }

}
