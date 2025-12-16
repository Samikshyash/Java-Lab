package Abstraction;

import java.util.Scanner;

abstract class BankAccount {
    Scanner sc = new Scanner(System.in);

    abstract public void deposit();

    abstract public void withdraw();

    abstract public void displayBalance();
}

class SavingsAccount extends BankAccount {
    double balance = 0;

    @Override
    public void deposit() {
        System.out.println("Enter the amount to deposit:");
        double amount = sc.nextDouble();
        balance += amount;

    }

    @Override
    public void withdraw() {
        System.out.println("Enter the amount to withdraw:");
        double withdraw = sc.nextDouble();
        if (withdraw > balance) {
            System.out.println("Balance insufficient!");

        } else {
            balance = balance - withdraw;
            System.out.println("Rs" + withdraw + "Withdrawn");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println(" Your Balance is Rs" + balance);
    }

}

class CheckingAccount extends BankAccount {
    double balance = 0;

    @Override
    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        balance += sc.nextDouble();
    }

    @Override
    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();

        if (amt > balance + 5000)
            System.out.println("Overdraft limit exceeded");
        else
            balance -= amt;
    }

    @Override
    public void displayBalance() {
        System.out.println("Balance = " + balance);
    }
}

class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;
        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Checking Account");
        int choice = sc.nextInt();

        if (choice == 1)
            account = new SavingsAccount();
        else if (choice == 2)
            account = new CheckingAccount();
        else {
            System.out.println("Invalid choice");
            sc.close();
            return;

        }
        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    account.deposit();
                    break;
                case 2:
                    account.withdraw();
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option");

                    break;
            }

        }

    }

}