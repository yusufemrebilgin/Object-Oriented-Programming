package week04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Please enter an integer value: ");
            int value = scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("You need to enter an integer value");
        }
        finally {
            System.out.println("End of the program");
        }

    }
}
