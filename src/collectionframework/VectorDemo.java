package collectionframework;

import java.util.Spliterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

//        System.out.println(vector.elementAt(0));
//        System.out.println(vector.get(0));
//        System.out.println(vector.firstElement());
//        System.out.println(vector.lastElement());
//        System.out.println(vector.subList(1,3));
//        System.out.println(vector.set(1,15));
//        System.out.println(vector.capacity());
//        System.out.println(vector);

        Spliterator<Integer> spliterator = vector.spliterator();
        spliterator.forEachRemaining(System.out::println);


    }
}
