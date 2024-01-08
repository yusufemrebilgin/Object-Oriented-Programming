package week11;

import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {

        ArrayList<BankAccount> list = new ArrayList<>();

        list.add(new BankAccount(11, "Ali", 2500d));
        list.add(new BankAccount(22, "Veli", 3700d));
        list.add(new BankAccount(33, "Beyza", 3200d));
        list.add(new BankAccount(44, "Ceren", 3000d));

        Collections.sort(list);

        for (BankAccount bankAccount: list)
            bankAccount.withdraw(500);

        for (BankAccount bankAccount : list) {
            System.out.println(bankAccount);
        }
    }
}
