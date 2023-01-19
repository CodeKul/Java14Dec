package filehandling;

import java.io.*;

public class SequentialStreamDemo {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("/home/vaibhav/JavaBatches/Dec14Java/src/filehandling/sample.txt");
            FileInputStream fileInputStream1 = new FileInputStream("/home/vaibhav/JavaBatches/Dec14Java/src/filehandling/sample3.txt");

            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1,fileInputStream);
            int i = sequenceInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i = sequenceInputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileOutputStream fileOutputStream1 = new FileOutputStream("sample10.txt");
            FileOutputStream fileOutputStream2 = new FileOutputStream("sample11.txt");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str = "I am Indian";
            byte[] arr = str.getBytes();

            byteArrayOutputStream.write(arr);
            byteArrayOutputStream.writeTo(fileOutputStream1);
            byteArrayOutputStream.writeTo(fileOutputStream2);

            System.out.println("file write successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
