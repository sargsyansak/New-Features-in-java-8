package NewFeaturesInJava8.stream;

import java.awt.*;
import java.time.format.SignStyle;
import java.util.*;
import java.util.List;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.stream(args)
                .filter(s -> s.length() <= 2)
                .collect(Collectors.toList());

//        int[] arr = {120, 410, 85, 32, 314, 12};
//        int count = 0;
//        for (int x : arr) {
//            if (x >= 300) continue;
//            x += 11;
//            count++;
//            if (count > 3) break;
//            System.out.println(x);
//        }

//
//        IntStream.of(120, 410, 85, 32, 314, 12)
//                .filter(x -> x < 300)
//                .map(x -> x + 11)
//                .limit(3)
//                .forEach(System.out::println);

//        Arrays.asList(1, 2, 3).stream()
//                .forEach(System.out::print);
//
//        Stream.of(1, 2, 3)
//                .forEach(System.out::print);

//        Stream.generate(() -> 6)
//                .limit(2)
//                .forEach(System.out::print);

//        Stream.iterate(2, x -> x + 6)
//                .limit(6)
//                .forEach(System.out::println);

//        Stream.concat(
//                Stream.of(1, 2, 3),
//                Stream.of(4, 5, 6))
//                .forEach(System.out::print);

//        Stream.Builder<Integer> streamBuilder = Stream.<Integer>builder()
//                .add(0)
//                .add(1);
//        for (int i = 2; i <= 8; i += 2) {
//            streamBuilder.accept(i);
//        }
//        streamBuilder
//                .add(9)
//                .add(10)
//                .build()
//                .forEach(System.out::print);
//
//        IntStream.range(0, 10)
//                .forEach(System.out::print);
//        System.out.println();
//        LongStream.range(-10L, -5L)
//                .forEach(System.out::print);
//        System.out.println();
//        IntStream.rangeClosed(0, 5)
//                .forEach(System.out::println);
//        System.out.println();
//
//        LongStream.rangeClosed(-8L, -5L)
//                .forEach(System.out::print);

//        Stream.of(120,410,333)
//                .filter(x -> x > 10)
//                .forEach(System.out::println);
//
//        Stream.of("3", "4", "5")
//                .map(Integer::parseInt)
//                .map(x -> x + 10)
//                .forEach(System.out::print);
//        System.out.println();
//        Stream.of(120, 410, 85, 32, 314, 12)
//                .map(x -> x + 11)
//                .forEach(System.out::println);
//        System.out.println();

//        Stream.of("10", "11","32")
//                .map(x -> Integer.parseInt(x,16))
//                .forEach(System.out::print);

//        Stream.of(2, 3, 0, 1, 3,4)
//                .flatMapToInt(x -> IntStream.range(0, x))
//                .forEach(System.out::print);

//        Stream.of(5,10,34,554,65,2,121)
//                .skip(2)
//                .forEach(System.out:: print);

//        IntStream.range(0, 100000000)
//                .sorted()
//                .limit(3)
//                .forEach(System.out::print);
//
//        Stream.of(120,410,85,32,314,12)
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::print);

//        Stream.of(2,1,4,5,3,2,8)
//                .distinct()
//                .sorted()
//                .forEach(System.out::print);

//        Stream.of(0, 3, 0, 0, 5)
//                .peek(x -> System.out.format("before distinct: %d%n", x))
//                .distinct()
//                .peek(x -> System.out.format("before distinct: %d%n", x))
//                .map(x -> x * x)
//                .forEach(x-> System.out.format("before distinct: %d%n", x));

//        Stream.of(120,410,85,32,314,12)
//                .forEach(x-> System.out.format("%s",x));


//        List<Integer> list1 = Stream.of(1,2,3)
//                .collect(Collectors.toList());
//        System.out.println(list1);

//        List<String> list2 = Stream.of("a","b","c","d")
//                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
//        System.out.println(list2);

//        int sum = Stream.of(1,2,3,4,5)
//                .reduce(10,(acc,x)-> acc +x);
//        System.out.println(sum);

//        Optional<Integer> result = Stream.<Integer>empty()
//                .reduce((acc,x)-> acc + x);
//        System.out.println(result.isPresent());

//        Optional<Integer> sum = Stream.of(1,2,3,4,5)
//                .reduce((acc,x)-> acc + x);
//        System.out.println(sum.get());

//        int min = Stream.of(20, 11, 45, 78, 13)
//                .min(Integer::compare).get();
//        System.out.println(min);
//
//        int max = Stream.of(20, 11, 45, 78, 13)
//                .max(Integer::compare).get();
//        System.out.println(max);

//        boolean result = Stream.of(1, 2, 3, 4, 5)
//                .allMatch(x -> x <= 7);
//        System.out.println(result);

//        boolean result = Stream.of(1, 2, 3, 4, 5,9)
//                .noneMatch(x -> x == 9);
//        System.out.println(result);

//        double result = IntStream.range(2,22)
//                .average()
//                .getAsDouble();
//        System.out.println(result);


    }

}
