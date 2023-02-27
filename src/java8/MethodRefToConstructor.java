package java8;

public class MethodRefToConstructor {
    public MethodRefToConstructor() {
        System.out.println("in const");
    }
    public static void main(String[] args) {
        MyInterface4 myInterface4 = MethodRefToConstructor::new;
        myInterface4.methodRef();

//        MethodRefToConstructor obj = new MethodRefToConstructor();
    }
}
interface MyInterface4{
    MethodRefToConstructor methodRef();
}
