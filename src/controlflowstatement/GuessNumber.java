package controlflowstatement;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int num;
        int guessNumber;
        num = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        do {
            System.out.println("Enter number");
            guessNumber = scanner.nextInt();
            counter++;
            if (num > guessNumber) {
                System.out.println("number is greater");
            } else if (num < guessNumber) {
                System.out.println("number is smaller");
            } else {
                System.out.println("you guess correct " + counter);
            }
        } while (num != guessNumber);
    }
}
