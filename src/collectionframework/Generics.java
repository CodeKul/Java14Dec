package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {

        Generics<Integer> obj1 = new Generics<>();
        obj1.setT(1);

//        Generics<Employee> obj2 = new Generics<>();
//        obj2.setT(3);

        List<Integer> obj  = Arrays.asList(1,2,3,4,5,6);
        printList(obj);

        List<String> obj2  = Arrays.asList("A","B","C");
        printList(obj2);
//        obj.add(10);
//        obj.add("String");

    }

    private static void printList(List<?> list){
        list.forEach(System.out::println);
    }
}
