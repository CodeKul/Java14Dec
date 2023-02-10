package collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> map1 = new TreeMap<>();
        map1.put(35, "Pune");
        map1.put(24, "Mumbai");
        map1.put(3, "Nashik");
        map1.put(6, "Kolhapur");
        map1.put(8, "Satara");

        System.out.println(map1.descendingMap());
        System.out.println(map1.firstEntry());
        System.out.println(map1.lastEntry());
        System.out.println(map1.firstKey());
        System.out.println(map1.pollFirstEntry());
        System.out.println(map1.ceilingEntry(20));
        System.out.println(map1.floorEntry(5));
        System.out.println(map1.containsKey(27));
        System.out.println(map1.ceilingKey(10));
        System.out.println(map1.subMap(6,9));
        System.out.println(map1.subMap(6,true,8,true));
//        System.out.println(map1);


    }
}
