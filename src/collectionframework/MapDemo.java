package collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Pune");
        map1.put(2, "Mumbai");
        map1.put(3, "Nashik");

        System.out.println(map1.entrySet());
        System.out.println(map1.get(1));

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Pune");
        map2.put(2, "Mumbai");
        map2.put(3, "Nashik");

        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "Pune");
        map3.put(2, "Mumbai");
        map3.put(3, "Nashik");

        List<Map<Integer, String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);

//        list.forEach(s -> {
//            s.forEach((k, v) -> {
//                System.out.println("key=>" + k + " " + " Value=>" + v);
//            });
//        });

//        for (Map.Entry<Integer, String> m : map.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());
//        }

    }
}
