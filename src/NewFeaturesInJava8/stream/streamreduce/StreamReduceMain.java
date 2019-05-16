package NewFeaturesInJava8.stream.streamreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceMain {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 7);
        List<String> strings = Arrays.asList("aaa", "bbb", "ccc", "ddd", "ffff");

//        Optional<Integer> sum = numbers.stream()
//                .reduce((left, right) -> left + right);
//         sum.ifPresent(System.out::println);

//        Integer sum = numbers.stream()
//                .reduce(10,(left,right)-> left + right);
//        System.out.println(sum);

//        Integer sum = numbers.stream()
//                .reduce(10, (identity, val) -> identity * val);
//        System.out.println(sum);

//        Integer min = numbers.stream()
//                .reduce(Integer.MAX_VALUE, (left, right) -> left < right ? left : right);
//        System.out.println(min);

//        Integer min = numbers.stream()
//                .reduce(Integer.MAX_VALUE, Integer::min);
//        System.out.println(min);

//        String s = strings.stream()
//                .reduce("", (left, right) -> left.length() > right.length() ? left : right);
//        System.out.println(s);
    }
}
