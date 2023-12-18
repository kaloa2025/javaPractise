package LOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMap {
public static void main(String[] args) {
    List<Person>person=PersonCollection.createList();
    Map<Integer, String> map = person.stream().collect(Collectors.toMap(Person::getAge, Person::getName));
		map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
	}

}    
