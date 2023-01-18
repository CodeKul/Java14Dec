package filehandling;

import java.io.*;

public class BufferOutputStreamDemo {

    public static void main(String[] args) {
        File file = new File("/home/vaibhav/JavaBatches/Dec14Java/src/filehandling/sample.txt");
        try {
            FileOutputStream obj = new FileOutputStream(file);//bytestream
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(obj);
            String str = "Welcome";
            bufferedOutputStream.write(str.getBytes());
            bufferedOutputStream.close();
            obj.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = bufferedInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i = bufferedInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
