package BuilderPattern;

import java.util.Arrays;
import java.util.List;

public class ArbiMethodRefrence {
    public static void main(String[] args) {
        List<Integer>numbers=Arrays.asList(10,4,-1,5,2,-6,-3,-10);
        numbers.sort(Integer::compareTo);
        numbers.forEach(System.out::println);
    }
}
