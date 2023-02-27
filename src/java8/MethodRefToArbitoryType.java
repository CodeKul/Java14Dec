package java8;

import java.util.Arrays;
import java.util.List;

public class MethodRefToArbitoryType {

    //method ref to arbitrary object of particular type
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("Nagesh"),new Person("Amit"));
        list.forEach(Person::getName);
    }

     static class Person{

        String name;

        public Person(String name) {
            this.name = name;
        }

        public void getName(){
            System.out.println("Name "+ this.name);
        }
    }
}
