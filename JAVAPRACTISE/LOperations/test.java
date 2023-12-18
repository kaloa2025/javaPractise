package LOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        ArrayList<String> Names=new ArrayList<>();
        Names.add("Aalok");
        Names.add("Yash");
        Names.add("Lavish");
        // //Stream.filter()
        // Names.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
        // //Stream.map()
        // Names.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
        // //Stream.sorted()
        // Names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
        // //Stream.peek()
        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // list.stream().peek( System.out::println ).forEach(System.out::println);  
        
        // //Stream.Limit()
        // Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);
        // List<Integer> newList = evenNumInfiniteStream.limit(10).collect(Collectors.toList());
        // System.out.println(newList);
        
        // Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);
        // List<Integer> newList = evenNumInfiniteStream.skip(5).limit(10).collect(Collectors.toList());
        // System.out.println(newList);
       
        // Names.forEach(System.out::println);
        
        // List<String> NamesInUppercase = Names.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        // System.out.print(NamesInUppercase);

        // List<String> NamesInUppercase = Names.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        // System.out.print(NamesInUppercase);

        // long totalMatched = Names.stream().filter((s) -> s.startsWith("A")).count();
        // System.out.println(totalMatched);

        // Optional<String> reduced = Names.stream().reduce((s1,s2) -> s1 + "#" + s2);
        // reduced.ifPresent(System.out::println);

        // boolean matched = Names.stream().anyMatch((s) -> s.startsWith("A"));
        // System.out.println(matched);

        // String firstMatchedName = Names.stream().filter((s) -> s.startsWith("L")).findFirst().get();
        // System.out.println(firstMatchedName);

        // List<Integer> list = Arrays.asList(12, 4, 11, 3, 17, 35, 49, 6, 8);
        // Optional<Integer> minNumber = list.stream().min((i, j) -> i.compareTo(j));
        // Optional<Integer> maxNumber = list.stream().max((i, j) -> i.compareTo(j));
        // System.out.println(minNumber.get());
        // System.out.println(maxNumber.get());
        // list.stream().parallel().forEach( System.out::println );
        // list.stream().parallel().forEachOrdered( System.out::println );

        // List<Person> people = new ArrayList<>();
        // people.add(new Person("John", "London", 21));
        // people.add(new Person("Swann", "London", 21));
        // people.add(new Person("Kevin", "London", 23));
        // people.add(new Person("Monobo", "Tokyo", 23));
        // people.add(new Person("Sam", "Paris", 23));
        // people.add(new Person("Nadal", "Paris", 31));

        // Map<String, List<Person>> personByCity = new HashMap<>();
        // for (Person p : people) {
        //     if (!personByCity.containsKey(p.getCity())) 
        //     {
        //         personByCity.put(p.getCity(), new ArrayList<>());
        //     }
        //     personByCity.get(p.getCity()).add(p);
        // }
        // System.out.println("Person grouped by cities : " + personByCity);
        // personByCity = people.stream().collect(Collectors.groupingBy(Person::getCity));
        // System.out.println("Person grouped by cities in Java 8: " + personByCity);

        

        // //Using Collectors.averagingInt()
        // Double avgAge = employeeList.stream().collect(Collectors.averagingInt(Employee::getAge));
        // System.out.println("Average age using Collectors.averagingInt: " + avgAge);
        // //Using Collectors.averagingLong()
        // Double avgLeaves = employeeList.stream().collect(Collectors.averagingLong(Employee::getLeaves));
        // System.out.println("Average leaves using Collectors.averagingLong: " + avgLeaves);
        // //Using Collectors.averagingDouble()
        // Double avgSalary = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        // System.out.println("Average salary using Collectors.averagingDouble: " + avgSalary);


        // List<Employee> empList = new ArrayList<>();
        // empList.add(new Employee("Raina", "Accounts", 8000));
        // empList.add(new Employee("Ankita", "Admin", 15000));
        // empList.add(new Employee("Antra", "Security", 2500));
        // empList.add(new Employee("Amar", "Entertainment", 12500));
 
        // // find employees whose salaries are above 10000
        // List<Employee> filteredList = empList.stream().filter(emp->emp.getSalary() > 10000).collect(Collectors.toList());
        // filteredList.forEach(System.out::println);

        // List<Person>person=PersonFactory.create();
        // Map<Integer, String> map = person.stream().collect(Collectors.toMap(Person::getId, Person::getName));
		// map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));

    }

}
