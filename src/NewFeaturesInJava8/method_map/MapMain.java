package NewFeaturesInJava8.method_map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
//        if (map.get("name") == null)
//            map.put("name", "Gus");
//        System.out.println(map);

        map.put("question", "Bla? ");
        map.merge("question", "Blabla", (oldVal, newVal) -> oldVal + newVal);
        System.out.println(map.get("question"));
    }
}
