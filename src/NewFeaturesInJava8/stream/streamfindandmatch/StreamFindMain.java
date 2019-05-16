package NewFeaturesInJava8.stream.streamfindandmatch;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindMain {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("BLOB", "Java is the best",
                "Java 8", "Java 9", "Jacoco");

        List<Integer> numbers = Arrays.asList(1, 5, 8, 10, 12, 15);

//        Optional<String> java = strings.stream()
//                .findAny();
//        System.out.println(java);

//        Optional<String> java = strings.stream()
//                .filter(s -> s.contains("Java"))
//                .findAny();
//        System.out.println(java);

//        Optional<String> java = strings.parallelStream()
//                .filter(s -> s.contains("Java"))
//                .findAny();
//        System.out.println(java);

//        Optional<Integer> first = numbers.stream()
//                .findFirst();
//        System.out.println(first);

//        Optional<Integer> first = numbers.stream()
//                .filter(number-> number>10)
//                .findFirst();
//        System.out.println(first);

        Optional<Integer> first = numbers.parallelStream()
                .filter(number -> number > 10)
                .findFirst();
        System.out.println(first);


    }

}
