package NewFeaturesInJava8.stream.streamfindandmatch;

import java.util.Arrays;
import java.util.List;

public class StreamMatchMain {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

//        boolean match = numbers.stream()
//                .anyMatch(number-> number % 2 ==0);
//        System.out.println(match);

//        boolean match = numbers.stream()
//                .allMatch(number -> number % 2 == 0);
//        System.out.println(match);

        boolean match = numbers.stream()
                .allMatch(number -> number > 0);
        System.out.println(match);

    }
}
