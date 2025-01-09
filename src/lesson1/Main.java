package lesson1;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(50);
        System.out.println(account.getBalance());
        account.deposit(10);
        System.out.println(account.getBalance());
        account.withdraw(30);
        System.out.println(account.getBalance());
    }
}
