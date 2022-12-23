package polymorphism;

/**
 * polymorphism - the ability to take one form to many form
 *
 * or
 *
 * one thing have many actions
 * e.g - 1.method overloading - a class have same methods name with different number of argument
 *
 * rule - 1. changing number of arguments
 *        2. changing type of argument
 *
 *        compile time polymorphism, early binding,static polymorphism
 */

public class PolymorphismDemo {

    public static void main(String[] args) {
        PolymorphismDemo obj = new PolymorphismDemo();
        obj.add(7, 9);
        obj.add(7, 9);

    }

    public void add(int i, int j) {
        System.out.println(i + j);
    }

    public void add(int i, Double j) {
        System.out.println(i + j);
    }
}
