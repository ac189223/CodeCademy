package _03_ObjectOrientedJava;

public class _14_SavingsAccount {
    int balance;

    public _14_SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    public void deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        System.out.println("You just deposited " + amountToDeposit);
    }

    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }

    public String toString() {
        return "There is " + balance + " lying safe on your account!";
    }

    public static void main(String[] args){
        _14_SavingsAccount savings = new _14_SavingsAccount(2000);
        savings.checkBalance();
        savings.withdraw(300);
        savings.checkBalance();
        savings.deposit(600);
        savings.checkBalance();
        savings.deposit(600);
        savings.checkBalance();

        System.out.println(savings);
    }
}
