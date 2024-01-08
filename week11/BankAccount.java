package week11;

class BankAccount implements Comparable<BankAccount> {
    private int accountNo;
    private String holderName;
    private double balance;

    BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    void withdraw(double amount) {
        if (amount >= 0.0)
            balance -= amount;
    }

    @Override
    public int compareTo(BankAccount o) {
        return holderName.compareTo(o.holderName);
    }

    @Override
    public String toString() {
        return "Account No: " + accountNo + "\nHolder Name: " + holderName + "\nBalance: " + balance + "\n";
    }
}
