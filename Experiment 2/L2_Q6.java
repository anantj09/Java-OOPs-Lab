import java.util.*;

class Customer {
    int accountNumber;
    double startingBalance;
    double totalCharges;
    double totalCredit;
    double creditLimit;
    double netBalance;

    public Customer(int accountNumber, double startingBalance, double creditLimit) {
        this.accountNumber = accountNumber;
        this.startingBalance = startingBalance;
        this.creditLimit = creditLimit;
    }

    void calculateNetBalance() {
        this.netBalance = this.startingBalance - this.totalCharges - this.totalCredit;
    }

    double getNetBalance() {
        return this.netBalance;
    }

    boolean creditLimitChecker() {
        return this.netBalance < this.creditLimit;
    }
}

class CreditLimitCalculator {
    static void customerChecker(Customer customer) {
        if (customer.creditLimitChecker()) {
            System.out.println("Credit Limit has exceeded!!");
        } else {
            System.out.println("Credit limit not reached.");
        }
    }
}

public class L2_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter balance at the start: ");
        double startingBalance = sc.nextDouble();
        System.out.print("Enter total charges: ");
        double totalCharges = sc.nextDouble();
        System.out.print("Enter total credit: ");
        double totalCredit = sc.nextDouble();
        System.out.print("Enter credit limit: ");
        double creditLimit = sc.nextDouble();

        Customer customer = new Customer(accountNumber, startingBalance, creditLimit);
        customer.totalCharges = totalCharges;
        customer.totalCredit = totalCredit;

        customer.calculateNetBalance();

        System.out.println("''Account Details''"); 
        System.out.println("Account Number: " + customer.accountNumber);
        System.out.println("Net Balance: " + customer.getNetBalance());

        CreditLimitCalculator.customerChecker(customer);
    }
}