package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to SIA Bank");

        boolean running = true;

        while (running) {
            System.out.println("""
                    1) Open Account
                    2) Deposit
                    3) Withdraw
                    4) Transfer
                    5) Account Statement
                    6) List Account
                    7) Search Accounts by Customer Name
                    8) Exit
                    """);

            System.out.print("CHOOSE: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1" -> openAccount(scanner);
                case "2" -> deposit(scanner);
                case "3" -> withdraw(scanner);
                case "4" -> transfer(scanner);
                case "5" -> statement(scanner);
                case "6" -> listAccounts(scanner);
                case "7" -> searchAccounts(scanner);
                case "8" -> running = false;
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    // ===== Methods =====

    private static void openAccount(Scanner scanner) {
        System.out.println("Customer Name:");
        String name = scanner.nextLine().trim();
        System.out.println("Customer Email:");
        String email = scanner.nextLine().trim();
        System.out.println("Account Type (Saving/ Checking):");
        String type = scanner.nextLine().trim();
        System.out.println("Intital Deposit Amount: ");
        String amountstr = scanner.nextLine().trim();
       Double initial = Double.valueOf(amountstr);
    }

    private static void deposit(Scanner scanner) {
        System.out.println("Deposit feature coming soon...");
    }

    private static void withdraw(Scanner scanner) {
        System.out.println("Withdraw feature coming soon...");
    }

    private static void transfer(Scanner scanner) {
        System.out.println("Transfer feature coming soon...");
    }

    private static void statement(Scanner scanner) {
        System.out.println("Account Statement feature coming soon...");
    }

    private static void listAccounts(Scanner scanner) {
        System.out.println("List Accounts feature coming soon...");
    }

    private static void searchAccounts(Scanner scanner) {
        System.out.println("Search Accounts feature coming soon...");
    }
}
