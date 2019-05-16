package NewFeaturesInJava8.stream.streammap;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);
//        for (Integer i : numbers) {
//            System.out.println(i * 2);
//        }
//        numbers.stream()
//                .map(i -> i * 2)
//                .forEach(System.out::println);

        List<String> names = Arrays.asList("john", "arya", "sansa");
//        for (String s : names) {
//            char[] chars = s.toCharArray();
//            chars[0] = Character.toUpperCase(chars[0]);
//            System.out.println(new String(chars));
//            }

//        names.stream()
//                .map(StringUtils::capitalize)
//                .forEach(System.out::println);

//        List<Car> cars = Arrays.asList(
//                new Car("AA1111BX", 2007),
//                new Car("AM1111BE", 2009),
//                new Car("AK5555IT", 2010),
//                new Car("AI5601CC", 2015),
//                new Car("AI3838PP", 2017));
//        for (Car car : cars) {
//            System.out.println(car.getNumber());
//        }


    }
}
