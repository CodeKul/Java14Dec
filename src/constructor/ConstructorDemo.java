package constructor;

/**
 * Constructor - it is special type of function which execute when you create object of class
 * rule -
 *
 * 1.your function should be class name
 * 2.there is no explicit return type
 * 3.final,static,synchronized keyword are not allowed
 *
 * types of constructor - parameter constructor
 * default constructor
 */
public class ConstructorDemo {

    public ConstructorDemo() {
        System.out.println("In constructor");
    }

    public ConstructorDemo(int i) {
        System.out.println("In constructor " + i);
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo();

    }
}
