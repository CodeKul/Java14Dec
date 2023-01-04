package controlflowstatement;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        int num;
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        str = scanner.next();
        System.out.println(str);
    }
}
