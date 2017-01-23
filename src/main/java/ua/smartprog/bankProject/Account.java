package ua.smartprog.bankProject;

import java.util.Scanner;
import java.util.Random;

public class Account {
    private int balance;
    private int cardNumber;
    private String password;
    Random random = new Random();

    public Account() {
        int half = random.nextInt(50000000) + 99999999;
        cardNumber = half * 2;
    }

    public int checkBalance() {
        return balance;
    }

    public void setMoney(int money) {
        this.balance = money;
    }

    public int showBalance() {
        Scanner passScan = new Scanner(System.in);
        String tempPassword = passScan.next();
        if (checkPassword(tempPassword)) {
            System.out.println("current balance: " + balance);
            return balance;
        } else {
            System.out.println("Access denied!!");
            return 0;
        }
    }
    //Start Task1502

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

    public boolean checkPassword(String password) {
        return password.equals(this.password);
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }


}
