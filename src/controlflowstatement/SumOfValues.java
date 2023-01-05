package controlflowstatement;

import java.util.Scanner;

public class SumOfValues {
    public static void main(String[] args) {

        int num1, sum = 0;
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter value");
            num1 = scanner.nextInt();
            sum = sum + num1;
            System.out.println("Do you want to continue Y or N");

            choice = scanner.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("addition is =>" + sum);
    }
}
