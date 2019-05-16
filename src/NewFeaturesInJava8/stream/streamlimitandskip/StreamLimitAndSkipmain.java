package NewFeaturesInJava8.stream.streamlimitandskip;

import java.util.Arrays;
import java.util.List;

public class StreamLimitAndSkipmain {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        numbers.stream()
//                .limit(5)
//                .forEach(System.out::println);

        numbers.stream()
                .skip(5)
                .forEach(System.out::println);
    }
}
