package LOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        ArrayList<String> Names=new ArrayList<>();
        Names.add("Aalok");
        Names.add("Yash");
        Names.add("Lavish");
        //Stream.filter()
        Names.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
        //Stream.map()
        Names.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
        //Stream.sorted()
        Names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
        //Stream.peek()
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().peek( System.out::println ).forEach(System.out::println);  
        //Stream.Limit()
        Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);
        List<Integer> newList = evenNumInfiniteStream.limit(10).collect(Collectors.toList());
        System.out.println(newList);
    }

}
