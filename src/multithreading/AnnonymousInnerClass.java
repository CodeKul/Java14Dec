package multithreading;

public class AnnonymousInnerClass {

    public static void main(String[] args) {
       MyInterface1 obj = new MyInterface1() {
           @Override
           public String msg() {
               return "Hello";
           }
           @Override
           public String display() {
               return null;
           }
       };
        System.out.println(obj.msg());
    }
}

interface MyInterface1{

    String msg();

    String display();
}