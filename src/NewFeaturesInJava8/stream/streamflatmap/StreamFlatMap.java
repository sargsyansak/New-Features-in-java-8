package NewFeaturesInJava8.stream.streamflatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class StreamFlatMap {
    public static void main(String[] args) {
        List<Human> humans = asList(
                new Human("Sam", asList("Buddy", "Lucy")),
                new Human("Bob", asList("Frankie", "Rosie")),
                new Human("Marta", asList("Simba", "Tilly")));

        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};


//        List<String> petNames = new ArrayList<>();
//        for (Human human : humans) {
//            petNames.addAll(human.getPets());
//        }
//        System.out.println(petNames);

//        List<String> petNames = humans.stream()
//                .map(human -> human.getPets())
//                .flatMap(pets -> pets.stream())
//                .collect(Collectors.toList());
//        System.out.println(petNames);

//        List<String> petNames = humans.stream()
//                .flatMap(human -> human.getPets().stream())
//                .collect(Collectors.toList());
//        System.out.println(petNames);

//        int[] newArr = new int[arr.length * arr[0].length];
//        for (int i = 0, index = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                newArr[index++] = arr[i][j];
//            }
//
//        }
//        System.out.println(Arrays.toString(newArr));

        int[] newArr = Arrays.stream(arr)
                .flatMapToInt(i -> Arrays.stream(i))
                .toArray();
        System.out.println(Arrays.toString(newArr));

    }
}
