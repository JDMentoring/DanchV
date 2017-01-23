package ua.smartprog.bankProject;

import java.util.Scanner;
/*start refactoring*/
public class account {
    private int balance;
    private int cardNumber;
    private String password;

    public int checkBalance() {
        return balance;
    }

    public void setMoney(int money) {
        this.balance = money;

    }
    //Start task 1501
    public void showBalance() {
        Scanner passScan = new Scanner(System.in);
        String tempPassword = passScan.next();
        if(checkPassword(tempPassword)) {
            System.out.println("current balance: " + balance);
        }
        else{
            System.out.println("Access denied!!");
        }
    }
    //End Task 1501

    public void takeMoney(int money) {
        if (money > checkBalance()) {
            System.out.println("Low balance!!");
            checkBalance();
        } else {
            balance = balance - money;
            checkBalance();
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String password){
        return password.equals(this.password);
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }


}
