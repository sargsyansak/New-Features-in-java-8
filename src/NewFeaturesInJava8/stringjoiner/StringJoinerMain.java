package NewFeaturesInJava8.stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerMain {
    public static void main(String[] args) {
//        StringJoiner joiner = new StringJoiner(", ");
        StringJoiner joiner = new StringJoiner(". ", "(", ")");

        String numbers = String.join("_", "1", "0", "1", "0");
//        System.out.println(numbers);

        joiner.add("John");
        joiner.add("Danny");
        joiner.add("Lui");
//        System.out.println(joiner.toString());

        List<String> databases = Arrays.asList("OracleDB", "Mongo", "PostgreSQL", "MySQL");
        String string = String.join(", ", databases);
//        System.out.println(string);

        List<String> list = Arrays.asList("Angular", "bootstrap", "NodeJS", "Django");
        String collect = list.stream()
                .collect(Collectors.joining("; ", "{", "}"));
        System.out.println(collect);
    }
}
