package _03_ObjectOrientedJava;

public class _08_SavingsAccount {

    int balance;

    public _08_SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    public static void main(String[] args){

        // Initialize
        _08_SavingsAccount savings = new _08_SavingsAccount(2000);

        //Check balance:
        savings.checkBalance();

        //Withdrawing:
        savings.withdraw(300);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

    }

    private void checkBalance() {
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    private void deposit(int sum) {
        balance = balance + sum;
        System.out.println("You just deposited " + sum);
    }

    private void withdraw(int sum) {
        balance = balance - sum;
        System.out.println("You just withdrew " + sum);
    }
}
