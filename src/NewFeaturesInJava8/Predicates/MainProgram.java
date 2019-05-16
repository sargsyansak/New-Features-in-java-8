package NewFeaturesInJava8.Predicates;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Сергей", 38));
        persons.add(new Person("Даша", 7));
        persons.add(new Person("Глаша", 3));
        persons.add(new Person("Саша", 6));
        persons.add(new Person("Анна", 18));

        int summa = 0;
        int adultPersons = 0;

        for (Person person : persons) {
            if (person.getAge() >= 18) {
                summa += person.getAge();
                adultPersons++;
            }
            double averageAge = (double) summa / adultPersons;
//            System.out.println(averageAge);
        }

        double averageAge2 = persons.stream()
                .filter(person -> person.getAge() >= 18)
                .mapToInt(p -> p.getAge()).average().getAsDouble();
        System.out.println(averageAge2);

//        for (Person person : persons) {
//            System.out.println(person);}
//        persons.stream().forEach(p -> System.out.println(p));
        persons.stream()
                .filter(person -> person.getAge() >= 18)
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .map(p -> p.getName())
                .forEach(System.out::println);

    }
}
