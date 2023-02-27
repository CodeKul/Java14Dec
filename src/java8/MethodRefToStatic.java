package java8;

public class MethodRefToStatic {
    public static void main(String[] args) {

//        refer
        MyInterface3 myInterface3 = MethodRefToStatic::display;
//        call
        System.out.println(myInterface3.msg());

    }
    public static String display(){
        return "hello";
    }
}
interface MyInterface3{
    String msg();
}
