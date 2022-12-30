package statickeyword;

/**
 * static variable - static is used to memory management
 * if you declare static variable memory is allocated only once
 *
 * static method - without creating object of class you can call method
 */
public class StaticDemo {

    int id;
    String name;
    static String collegeName = "ABC";

    public static void show(){
        System.out.println("In static show method");
    }

    public static void main(String[] args) {
        show();
        StaticDemo obj = new StaticDemo();
        obj.id = 1;
        obj.name = "Ravi";

        System.out.println(obj.id+" "+ obj.name+" "+collegeName);

        StaticDemo obj1 = new StaticDemo();
        obj1.id = 2;
        obj1.name = "Akash";

        StaticDemo obj2 = new StaticDemo();
        obj2.id = 3;
        obj2.name = "Suhas";


    }
}
