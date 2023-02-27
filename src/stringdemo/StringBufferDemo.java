package stringdemo;

import java.time.Duration;
import java.time.LocalTime;

public class StringBufferDemo {
    public static void main(String[] args) {

        String str = "Pune";
        StringBuffer stringBuffer  =new StringBuffer(str);
//        stringBuffer.append("Mumbai");
//        stringBuffer.indexOf();
//        stringBuffer.charAt();

        System.out.println(stringBuffer.reverse());


        StringBuilder stringBuilder = new StringBuilder("Pune");
        stringBuilder.reverse();

    }
}
