package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Trywithresources {
    public static void main(String[] args) {
        File file = new File("/home/vaibhav/JavaBatches/Dec14Java/src/filehandling/sample3.txt");

        try (FileOutputStream obj =new FileOutputStream(file)){
            String str = "Welcome";
            obj.write(str.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
