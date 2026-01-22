package Object_Oriented_programmings.Inheritance;

class Bank {
    public String Bank_name;
    public String Bank_address;

    Bank(String Bank_name, String Bank_address) {
        this.Bank_name = Bank_name;
        this.Bank_address = Bank_address;
    }

    public void display() {
        System.err.println("Bank Name: " + Bank_name);
        System.out.println("Bank Address: " + Bank_address);
    }
}

class BankAccount extends Bank { 
    public String Account_name;
    public double Account_number;
    private double balance;
    private String Account_Type;

    public BankAccount( String Bank_name,String Bank_address, String Account_name, 
    double Account_number, double balance, String Account_type) {
        super(Bank_name, Bank_address);
        this.Account_name = Account_name;
        this.Account_number = Account_number;
        this.balance = balance;
        this.Account_Type = Account_type;
    }
    // Balance methods
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        }else{
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn : " + amount);
        }else{
            System.out.println("Balance is invalid or insufficient funds.");
        }
    }
    public double getbalance(){
        return balance;
    }
    // Account type methods
    public String getAccount_Type(){
        return Account_Type;
    }
    public void displayAccountINfo(){
        display();
        System.out.println("Account Name: " + Account_name);
        System.out.println("Account Number: " + Account_number);
        System.out.println("Account Type: " + Account_Type);
        System.out.println("Balance: " + balance);
       
    }


}
class LoanAccount extends BankAccount{
    private  double LoanAccount;
    private  double  interestRate;

    public LoanAccount(String Bank_name, String Bank_address, String Account_name, double Account_number,
    double balance, String Account_Type, Double Loan_Account, double interestRate){
        super(Bank_name, Bank_address, Account_name, Account_number, balance, Account_Type);
        this.LoanAccount = Loan_Account;
        this.interestRate = interestRate;

    }

    public void CaluateInterest(){
        double interest  = LoanAccount * interestRate / 100;
        System.out.println("Interest: " + interest);
    }

    public double getloanAccount(){
        return  LoanAccount;
    }
    
    public double getinterestRate(){
        return interestRate;
    }

    public void displayLoanInfo(){
        displayAccountINfo();
        System.out.println("Loan Account: " + LoanAccount);
        System.out.println("Interest Rate: " + interestRate);
    }

}
public class Mulutlevel{
public static void main(String[] args) {
       LoanAccount L1 = new LoanAccount("Bank of java", "123 java", "john doe", 8700200100L, 50000.00, "savings", 200000.00, 5.5);
       L1.deposit(10000.00);
       L1.withdraw(500.00);
       L1.displayLoanInfo();
       L1.CaluateInterest();
    }
}