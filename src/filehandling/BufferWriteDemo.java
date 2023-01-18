package filehandling;

import java.io.*;

public class BufferWriteDemo {

    public static void main(String[] args) {

        FileWriter fileWriter = null;
        FileReader fileReader = null;

        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;

        try {
            fileWriter = new FileWriter("sample1.txt");//character stream
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("I am in pune");
            System.out.println("File write successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            fileReader = new FileReader("sample1.txt");
            bufferedReader = new BufferedReader(fileReader);
            int i = bufferedReader.read();
            while (i > 0) {
                System.out.print((char) i);
                i = bufferedReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
