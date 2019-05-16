package NewFeaturesInJava8.stream.streamgrouping;

import java.util.*;
import java.util.stream.Collectors;

public class StreamCollectGrouping {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Ned", "Stark", 1),
                new Human("Robb", "Stark", 2),
                new Human("Arya", "Stark", 1),
                new Human("Aegon", "Targaryen", 6),
                new Human("Daenerys", "Targaryen", 4),
                new Human("Jaime", "Lannister", 1),
                new Human("Tyrion", "Lannister", 3));

//        Map<String, List<Human>> map = new HashMap<>();
//
//        for (Human human : humans) {
//            String surname = human.getSurname();
//            if (!map.containsKey(surname)) { // если фамилии еще нет - создаем новый список
//                List<Human> humanList = new ArrayList<>();
//                humanList.add(human);
//                map.put(surname, humanList);
//            } else {                        // если фамилия есть - добавляем представителя семьи =)
//                List<Human> humanList = map.get(surname);
//                humanList.add(human);
//            }
//        }
//        System.out.println(map);

//        Map<String,List<Human>> map = humans.stream()
//                .collect(Collectors.groupingBy(Human::getSurname));
//        System.out.println(map);

//        Map<String,Integer> map = humans.stream()
//                .collect(Collectors.groupingBy(Human::getSurname,Collectors.summingInt(Human::getFriendsAmount)));
//        System.out.println(map);

        Map<String, Set<String>> map = humans.stream()
                .collect(Collectors.groupingBy(Human::getSurname,
                        Collectors.mapping(Human::getName, Collectors.toSet())));
        System.out.println(map);
    }
}
