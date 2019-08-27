package _03_ObjectOrientedJava;

public class _07_SavingsAccount {

    int balance;

    public _07_SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    public static void main(String[] args){
        _07_SavingsAccount savings = new _07_SavingsAccount(2000);

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);

        //Withdrawing:
        int withdraw = 300;
        int afterWithdraw = savings.balance - withdraw;
        savings.balance = afterWithdraw;
        System.out.println("You just withdrew " + withdraw);

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);

        //Deposit:
        int deposit = 600;
        int afterDeposit = savings.balance + deposit;
        savings.balance = afterDeposit;
        System.out.println("You just deposited " + deposit);

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);

        //Deposit:
        int afterDeposit2 = savings.balance + deposit;
        savings.balance = afterDeposit2;
        System.out.println("You just deposited " + deposit);

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);

    }
}
