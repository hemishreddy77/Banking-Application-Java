import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the Banking System ===");

        System.out.print("Enter Account Number: ");
        int accNumber = scanner.nextInt();

        System.out.print("Enter PIN: ");
        int pin = scanner.nextInt();

        BankAccount userAccount = bank.findAccount(accNumber, pin);

        if (userAccount != null) {
            System.out.println("Login successful! Welcome, " + userAccount.getName());
            bank.performTransaction(userAccount);
        } else {
            System.out.println("Invalid account number or PIN.");
        }
    }
}
