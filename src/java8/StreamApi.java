package java8;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Stream api - it is sequence of object and have many methods.
 *              that method we are combining and producing desire result
 *
 * types - sequential and parallel(multithreading)
 *
 * operation - terminal and intermediate
 *
 * terminal -> forEach(Consumer),reduce(),collect()
 * intermediate -> map(Function),filter(Predicate),sorted()
 */
public class StreamApi {
    public static void main(String[] args) {

        Function<String,Integer> function = (str)-> str.length();
        System.out.println(function.apply("Welcome"));

        Function<Integer,Integer> add = (num)-> num+3;
        System.out.println(add.apply(5));

        Function<Integer,Integer> multi = (num)-> num*2;
        System.out.println(multi.apply(5));

        Function<Integer,Integer>res = add.andThen(multi);
        System.out.println(res.apply(4));//14

        Function<Integer,Integer> com = add.compose(multi);
        System.out.println(com.apply(4));//11


        Function<Integer,Integer> ind = Function.identity();
        System.out.println(ind.apply(2));//2

        List<Integer> list = Arrays.asList(1,2,5,4,5,6);

        System.out.println();
        Function<Integer,Integer> m = (n)->n*2;
        list.stream().map(m).forEach(System.out::println);

        Function<Integer,String> evenOdd = (number)-> number%2==0?"Even":"Odd";
        System.out.println(evenOdd.apply(5));

        list.stream().sorted(Comparator.reverseOrder());

        System.out.println();

        Predicate<Integer> predicate =(number)-> number%2==0;
        System.out.println(predicate.test(11));


//        list.stream().filter(predicate).forEach(System.out::println);


        List<Integer> list1 = Arrays.asList(1,2,5,4,5,6);

        int sum = 0;
        for (Integer i:list1) {
            sum = sum +i;
        }

        System.out.println(sum);

        Optional<Integer> res1 = list1.stream().reduce(((integer, integer2) ->
                integer+integer2)).get().describeConstable();
        System.out.println(res1);

        System.out.println(IntStream.of(1,2,5,4,5,6).reduce(Integer::sum).getAsInt());

        List<String> strings = Arrays.asList("Pune","Nashik","Sangli","Kolhapur");
        Optional<String> res3 = strings
                .stream()
                .reduce(((w1, w2) -> w1.length()>w2.length()?w1:w2))
                .get()
                .describeConstable();
        System.out.println(res3);


        List<String> languages = Arrays.asList("Java","C","C","C++","JavaScript","React","Html");

        Set<String> startWithJ = languages.stream().filter((s)->s.startsWith("C")).collect(Collectors.toSet());

        System.out.println(startWithJ);

        Supplier<String> supplier  = new Supplier<String>() {
            @Override
            public String get() {
                return "Hii";
            }
        };
        System.out.println(supplier.get());

    }
}
