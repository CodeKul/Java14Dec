package finalkeyword;

import constructor.ConstructorDemo;

/**
 * final variable - if you declare final variable then you can not reassign value to variable
 * final method - if you declare final method then you can not override that method
 * final class - if you declare final class then you cannot inherit the class
 */
public class FinalDemo {

    final int i = 10;

    public final void show(){
        System.out.println("In show");
    }
    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
//        obj.show();
        System.out.println(obj.i);
    }
}

class C extends FinalDemo{

//    public void show(){
//
//    }
    public static void main(String[] args) {
        C obj = new C();
        obj.show();

    }
}
