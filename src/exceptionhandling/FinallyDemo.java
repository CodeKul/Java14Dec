package exceptionhandling;

import java.util.Scanner;

public class FinallyDemo {

    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter number");
            num = scanner.nextInt();
            System.out.println("Values is "+num);

        }catch (Exception e){
            System.out.println(e);
        }finally {
            scanner.close();
        }

    }
}
