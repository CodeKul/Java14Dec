package java8;

public class DefaultAndStatic implements MyInterface5{

    public static void main(String[] args) {
        DefaultAndStatic obj = new DefaultAndStatic();

        System.out.println(obj.msg());
        obj.display();

        System.out.println(MyInterface5.test());
    }

//    @Override
//    public String msg() {
//        return MyInterface6.super.msg();
//    }

    public void display(){
        MyInterface5.super.msg();
    }
//    @Override
//    public String msg() {
//        return "Hii";
//    }
}

interface MyInterface5{
   default String msg(){
       return "Pune";
   };
   static String test(){
       return "Pune";
   };

}

//interface MyInterface6{
//    default String msg(){
//        return "Mumbai";
//    };
//}