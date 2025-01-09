package lesson1;
import java.util.Random;
/**
 * Operations: deposit money, withdraw money, get current balance
 * Instance variables (what makes a bank account):
 * account number, balance, interest rate, bank, owner
 */

public class BankAccount {

        private String owner;
        private String bank;
        private String accountNumber;
        private double balance;
        private double interestRate;

        //constructors must have same name as class
        public BankAccount(){
            this.accountNumber = generateAccountNumber();
            this.balance = 0;
        }

        //overloaded constructor
        public BankAccount(double initialBalance) {
            this.accountNumber = generateAccountNumber();
            this.balance = initialBalance;
        }

        public BankAccount(String name, int initialBalance) {
            this.accountNumber = generateAccountNumber();
            this.balance = initialBalance;
            this.owner = name;
        }

        //setter
        private String generateAccountNumber() {
            Random rand = new Random();
            return String.valueOf(rand.nextInt(99999999));
        }
        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            balance -= amount;
        }

        public void applyInterest() {
            balance += (balance * interestRate);
        }

        public void changeOwner(String newOwner) {
            owner = newOwner;
        }

        public void changeInterestRate(double rate) {
            interestRate = rate;
        }

        //getter (accessor)
        public double getBalance() {
            return balance;
        }

        @Override
        public String toString(){
            return String.format("Balance: $%.2f", balance);
        }


}
