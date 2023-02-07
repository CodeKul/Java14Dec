package collectionframework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

//        Set<Integer>  set = new HashSet<>();
//
//        set.add(10);
//        set.add(10);
//        set.add(30);
//        set.add(40);
//
//        System.out.println(set);
        Employee obj1 = new Employee(1, "Rahul", "Pune");
        Employee obj2 = new Employee(1, "Rahul", "Pune");
        Employee obj3 = new Employee(3, "Ram", "Pune");
        Set<Employee> set1 = new HashSet<>();
//        Integer integer1 = new Integer(10);
//        Integer integer2 = new Integer(10);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        set1.add(obj1);
        set1.add(obj2);
        set1.add(obj3);

        set1.forEach(s -> {
            System.out.println(s.id + " " + s.getName() + " " + s.getAddress());
        });


    }
}
