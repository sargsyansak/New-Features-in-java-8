package NewFeaturesInJava8.stream.streamfilter;

import java.time.format.SignStyle;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        for (Integer i : numbers) {
//            if (i % 2 == 0) {
//                System.out.println(i); } }

//        numbers.stream()
//                .filter(i -> i % 2 == 0)
//                .forEach(System.out::println);

        List<String> names = Arrays.asList("John", "Jan", "Tirion", "Marry", "Nikolas");
//        long count = names.stream()
//                .filter(n -> n.length() > 4)
//                .count();
//        System.out.println(count);

        List<String> namess = Arrays.asList("John", "Daenerys", "Tyrion", "", null, "Arya");
     namess.stream()
             .filter(Objects::nonNull)
             .filter(name  -> !name.isEmpty() && name.contains("a"))
             .forEach(System.out::println);
    }
}
