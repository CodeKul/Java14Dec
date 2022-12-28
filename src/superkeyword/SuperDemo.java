package superkeyword;

/**
 * super -
 * 1. it is used to refer immediate parent class instance variable
 * 2. used to refer immediate parent class method
 */
public class SuperDemo extends Object{
    int i = 10;

    public void show(){
//        System.out.println("In super show");
    }

    SuperDemo(){
        System.out.println("In super constructor");
    }
}

class B extends SuperDemo{
    int i =20;

    B(){
        System.out.println("B constructor");
    }

    public void show(){
//        System.out.println(super.i);
        super.show();
//        System.out.println("in B show");
    }
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

class C extends B{

    C(){
        super();
        System.out.println("In C constructor");
    }
    public static void main(String[] args) {
        C obj = new C();

    }
}
