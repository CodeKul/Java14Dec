package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo implements Comparable<ComparableDemo> {

    int id;
    String name;
    String address;

    public ComparableDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        ComparableDemo obj1 = new ComparableDemo(1,"Rahul","Pune");
        ComparableDemo obj2 = new ComparableDemo(2,"Mahesh","Mumbai");
        ComparableDemo obj3 = new ComparableDemo(3,"Suhas","Nashik");

        List<ComparableDemo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list,Collections.reverseOrder());

        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.address);
        });
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(234);
//        list1.add(243);
//        list1.add(873);
//        list1.add(5563);
//
//        Collections.sort(list1,Collections.reverseOrder());
//        System.out.println(list1);
    }

    @Override
    public int compareTo(ComparableDemo o) {
//        if(o.id==this.id){
//            return 0;
//        }else if(o.id<this.id){
//            return 1;
//        }else {
//            return -1;
//        }
//       return compare(o.id,this.id);

        return o.name.compareTo(this.name);
    }

    public static int compare(int x, int y) {
        return (x > y) ? -1 : ((x == y) ? 0 : 1);
    }
}
