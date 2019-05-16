package NewFeaturesInJava8.stream.streammodifires;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamDistinctMain {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "a", "b");
        List<Person> people = Arrays.asList(new Person("Jo"),
                new Person("Zai"),
                new Person("Lui"));
        List<String> peoples = Arrays.asList("Jo", "Zai", "Lui", "Andy");

//         strings.stream()
//                 .distinct()
//                 .forEach(System.out::println);
//        people.stream()
//                .sorted(Comparator.comparing(Person::getName).reversed())
//                .forEach(System.out::println);

//        people.stream()
//                .parallel()
//                .forEach(System.out::println);

        peoples.parallelStream()
                .forEach(System.out::println);

//        peoples.stream()
//                .sequential()
//                .forEach(System.out::println);


    }
}
