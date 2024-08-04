package co4;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {
    private String accountNo;
    double balance;

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
    public String toString() {
        return "Account Number: " + accountNo + ", Balance: $" + balance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance to withdraw $" + amount);
        }
        balance -= amount;
        System.out.println("$" + amount + " has been withdrawn from the account.");
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Account account = new Account("12345", 1000.0);
        System.out.println(account);

        try {
            account.withdraw(500.0);
            System.out.println(account);
            account.withdraw(700.0); // This should throw an InsufficientBalanceException
            System.out.println(account); // This line won't be executed due to the exception
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println("Transaction failed. Current balance: $" + account.balance);
        }
    }
}
