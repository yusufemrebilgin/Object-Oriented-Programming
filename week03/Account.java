package week03;

import java.util.Scanner;

class Account {
    private String name;
    private double balance;
    private int password;

    Account(String name, double balance, int password) {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;
        if (password < 10000 && password > 999) //It should be 4-digit password
            this.password = password;
    }

    public void add(double amount) {
        if (amount > 0.0) {
            balance += amount;
            System.out.printf("$%.2f has been deposited to your account.\n", amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("There is not enough balance in your account.");
            return;
        }

        if (!login())
            System.out.println("Your account has been blocked!");
        else {
            balance -= amount;
            System.out.printf("$%.2f was withdrawn from your account.\n", amount);
        }
    }

    public boolean login() {
        int tries = 3;
        Scanner scanner = new Scanner(System.in);
        while (tries > 0) {
            System.out.print("Please enter 4-digit password: ");
            int control = scanner.nextInt();
            if (control == password)
                return true;
            else {
                tries--;
                System.out.println("Wrong password! You have " + tries + " more tries left.\n");
            }
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}