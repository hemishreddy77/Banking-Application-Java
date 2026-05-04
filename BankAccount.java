public class BankAccount {
    private int accountNumber;
    private int pin;
    private String name;
    private double currentBalance;

    // Constructor
    public BankAccount(int accountNumber, int pin, String name, double currentBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.name = name;
        this.currentBalance = currentBalance;
    }

    // Validate PIN
    public boolean validatePin(int inputPin) {
        return this.pin == inputPin;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            System.out.println("Deposit successful! New balance: $" + currentBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > currentBalance) {
            System.out.println("Insufficient funds.");
        } else {
            currentBalance -= amount;
            System.out.println("Withdrawal successful! New balance: $" + currentBalance);
        }
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("Current balance: $" + currentBalance);
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }
}
