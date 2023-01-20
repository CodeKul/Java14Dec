package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) {

        File file = new File("/home/vaibhav/JavaBatches/Dec14Java/newFolder/sample13.txt");
        try {
            if(file.exists()){
                System.out.println("File is already created");
            }else {
                Boolean f = file.createNewFile();
                System.out.println(f);
            }
            System.out.println(file.isFile());
            System.out.println(file.canExecute());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.compareTo(new File("sample13.txt")));
            System.out.println(file.getFreeSpace());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
            System.out.println(file.getTotalSpace());
            System.out.println(file.getUsableSpace());
            System.out.println(file.getParent());

//            File file1 = new File("newFolder");
//            file1.mkdir();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
