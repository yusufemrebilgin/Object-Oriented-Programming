package week03;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account("Ali", 5600.0, 1234);

        System.out.printf("Balance of %s: $%.2f\n", account.getName(), account.getBalance());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount you want to deposit: ");
        int amount = scanner.nextInt();
        account.add(amount);

        System.out.printf("Balance of %s: $%.2f\n\n", account.getName(), account.getBalance());

        System.out.print("Enter the amount you want to withdraw: ");
        amount = scanner.nextInt();
        account.withdraw(amount);

        System.out.printf("Balance of %s: $%.2f\n\n", account.getName(), account.getBalance());
    }
}