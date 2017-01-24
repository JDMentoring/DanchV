package ua.smartprog.bankProject;

import java.util.Scanner;
import java.util.Random;

public class Account {
    private int balance;
    private String cardNumber;
    private String password;

    public Account(){
        this.cardNumber = generateCardNumber();
    }


    public int checkBalance() {
        if(checkPassword()) {
            return balance;
        }
        else{
            System.out.println("Access denied!!");
            return 0;
        }
    }

    public void setMoney(int money) {
        this.balance = money;
    }

    public void showBalance() {

        if (checkPassword()) {
            System.out.println("current balance: " + balance);
        } else {
            System.out.println("Access denied!!");
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

    public boolean checkPassword() {
        Scanner passScan = new Scanner(System.in);
        String tempPassword = passScan.next();
        return tempPassword.equals(this.password);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String generateCardNumber(){
        Random rand = new Random();
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < num.capacity(); i++) {
            int temp = rand.nextInt(10) ;
            num.append(temp);
        }
        return num.toString();
    }
}
