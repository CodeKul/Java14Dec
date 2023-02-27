package java8;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
//    method ref to instance method
    public static void main(String[] args) {
        MethodReference methodReference = new MethodReference();
        //refer method
        MyInterface2 myInterface2 = methodReference::display;
        //call method
        System.out.println(myInterface2.msg());

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.forEach(System.out::println);
    }
    public String display(){
        return "hello";
    }
}
interface MyInterface2{
    String msg();
}
