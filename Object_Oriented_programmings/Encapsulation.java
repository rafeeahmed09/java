package Object_Oriented_programmings;

class BankAccount {
    private long AccountNumber;
    private double Balance;

    // constructor
    public BankAccount(long AccountNumber, double Balance) {
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    // using a getter method to access private variables
    public long getAccountNumber() {
        return AccountNumber;
    }

    // using a getter method to access private variables
    public double getBalance() {
        return Balance;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= Balance) {
            Balance -= amount;
            System.err.println("withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount(12345,12000.0);
        System.out.println("Account Number: " + bank1.getAccountNumber());
        System.out.println("Balance: " + bank1.getBalance());
        bank1.deposit(400);
        bank1.withdraw(14000);

    }
}
