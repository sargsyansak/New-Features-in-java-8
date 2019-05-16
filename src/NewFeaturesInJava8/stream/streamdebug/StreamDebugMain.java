package NewFeaturesInJava8.stream.streamdebug;

import java.util.Arrays;
import java.util.List;

public class StreamDebugMain {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

//        numbers.stream()
//                .map(n -> debug(n))
//                .forEach(n -> doSomeStaff(n));

//        numbers.stream()
//                .filter(n -> debug(n))
//                .forEach(n -> doSomeStaff(n));

        numbers.stream()
                .peek(n->debug(n))
                .forEach(n-> doSomeStaff(n));
    }

//    private static Integer debug(Integer n) {
//        System.out.println(n);
//        return n;
//    }

    private static void debug(Integer n) {
        System.out.println(n);
    }

    private static void doSomeStaff(Integer n) { }

//    private static boolean debug(Integer n) {
//        System.out.println(n);
//        return true;
//    }
}
