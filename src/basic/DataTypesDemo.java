package basic;

import java.util.ArrayList;
import java.util.List;

public class DataTypesDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        DataTypesDemo obj = new DataTypesDemo();
//        System.out.println(obj.b);
//        System.out.println(obj.show());;
        System.out.println(obj.aBoolean);
    }

    public static void main(int[] args) {
        DataTypesDemo obj = new DataTypesDemo();
//        System.out.println(obj.b);
//        System.out.println(obj.show());;

    }
    //primitive datatype

    String st2;
    byte b = 127;
    short s = 32767;
    int i = 224942834;
    long l =4353243434343479539L,j=2453534535345L;
    float f = 234323423443543434535353543535345345354.0f;
    double d =42242342424333344444444444444444444444444444444443365646.0;
    boolean aBoolean;
    char c;

//    non-primitive datatypes

    String str = "Pune";

    String str1 = new String("Mumbai");
    Byte aByte;
    Short aShort;
    Integer integer ;
    Long aLong;
    Float aFloat;
    Double dADouble;
    Boolean al;
    Character character;

    String show(){
        return "pune";
    }

}
