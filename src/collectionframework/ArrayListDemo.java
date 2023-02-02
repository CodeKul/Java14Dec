package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * arraylist maintain insertion order
 * arraylist stores duplicate values
 * arraylist uses dynamic array to store element
 * it grows by 50%
 */
public class ArrayListDemo {
    public static void main(String[] args) {

        int[] arr = new int[100];
        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 14;
        System.out.println(arr);

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);


        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = Arrays.asList(1,2,3,6,4);
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,6,4));
        List<Integer> list4 = new ArrayList<>(List.of(1,2,3,4));

//        List<Integer> list5 = new ArrayList<>(){{add(10),add(20);}};


    }
}
