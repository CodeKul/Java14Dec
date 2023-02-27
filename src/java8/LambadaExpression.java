package java8;

/**
 *
 * Lambada expression -> anonymous function
 * syntax- ()->{}
 * advantage -> to implement functional interface
 *             and it takes less code
 */
public class LambadaExpression {
    public static void main(String[] args) {
        MyInterface myInterface = (i) ->{
                System.out.println("In show");
        };
        myInterface.show(6);

        MyInterface1 myInterface1 = (a,b)->a*b;
        System.out.println(myInterface1.multi(7,8));
    }
}

interface MyInterface{
    void show(int i);
}

interface MyInterface1{
    int multi(int i,int j);
}