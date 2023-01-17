package filehandling;

import java.io.*;

public class FileHandlingDemo {

    public static void main(String[] args) {

        File file = new File("/home/vaibhav/JavaBatches/Dec14Java/src/filehandling/sample.txt");
        try {
            FileOutputStream obj = new FileOutputStream(file);
            String str = "Welcome";
            obj.write(str.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i = fileInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i = fileInputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//                                    aaabbccde
//                                    a3b2c2d1e1