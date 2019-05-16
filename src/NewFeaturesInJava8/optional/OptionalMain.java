package NewFeaturesInJava8.optional;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("John");

//        name.ifPresent(val-> System.out.println(val));

//        if (name.isPresent()) {
//            System.out.println(name.get());
//        }

        Optional<Object> empty = Optional.empty();
//        empty.ifPresent(val-> System.out.println(val));
//        if (empty.isPresent()) {
//            System.out.println(empty.get());
//        }
        Optional<String> names = Optional.of("John");
//        System.out.println(name.orElseGet(()-> "blank"));

        Optional<String> nam = Optional.of("JOHN");
        System.out.println(nam.map(String::toLowerCase));

    }
}
