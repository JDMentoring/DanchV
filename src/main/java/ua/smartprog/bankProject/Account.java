package ua.smartprog.bankProject;

import java.util.Scanner;
import java.util.Random;

public class Account {
    private String cardNumber;
    private int balance;
    private String password;

    public Account() {
        this.cardNumber = generateCardNumber();
        this.balance = 0;
        this.password = generateDefaultPassword();
    }

    public Account(int balance, String password) {
        this.cardNumber = generateCardNumber();
        this.balance = balance;
        this.password = password;
    }

    public Account(String cardType, int balance, String password) {
        if (cardType == "VISA") this.cardNumber = generateVCNumber();
        else this.cardNumber = generateCardNumber();
        this.balance = balance;
        this.password = password;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String generateCardNumber() {
        Random rand = new Random();
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < num.capacity(); i++) {
            int temp = rand.nextInt(10);
            num.append(temp);
        }
        return num.toString();
    }

    public String generateVCNumber() {
        Random generator = new Random();
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < num.capacity(); i++) {
            int temp = generator.nextInt(10);
            if (i == num.length()) {
                temp = 4;
            }
            num.append(temp);
        }
        this.cardNumber = num.toString();
        return num.toString();
    }

    public int checkBalance() {
        if (checkPassword()) {
            return balance;
        } else {
            System.out.println("Access denied!!");
            return 0;
        }
    }

    public void addMoney(int money) {
        if (money > 0) {
            if (checkPassword()) this.balance = this.balance + money;
            else System.out.println("Access denied!!");
        } else {
            System.out.println("It's a bug");
        }
    }

    public void takeMoney(int money) {
        if (checkPassword()) {
            if (money > checkBalance()) {
                System.out.println("Low balance!!");
                checkBalance();
            } else {
                this.balance = this.balance - money;
                checkBalance();
            }
        }
    }
//start refactoring account
    public String generateDefaultPassword() {
        //retrying
        final int PASSLEN = 8;
        Random generator = new Random();
        StringBuilder pass = new StringBuilder();
        char otherSymbol = '_';
        int[] check = new int[2];
        char[] nums = new char[10];
        char[] sym = new char[26];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (char) (i + 48);
        }
        for (int i = 0; i < sym.length; i++) {
            sym[i] = (char) (i + 97);
        }
        for (int i = 0; i < PASSLEN; i++) {
            int arrChoose = generator.nextInt(2);
            if (i == 4) {
                pass.append(otherSymbol);
            } else {
                if (arrChoose == 0) {
                    pass.append(nums[generator.nextInt(9)]);
                    check[0] = 1;
                } else if (arrChoose == 1) {
                    pass.append(sym[generator.nextInt(25)]);
                    check[1] = 1;
                }
            }
        }
        System.out.println(pass);
        if (check[0] + check[1] == 2) {
            return pass.toString();
        } else {
            return generateDefaultPassword();
        }
    }

    public void resetPassword(String password) {
        System.out.println("Put the current password to chandge it : ");
        if(checkPassword()) this.password = password;
    }

    public boolean checkPassword() {
        Scanner passScan = new Scanner(System.in);
        String tempPassword = passScan.next();
        return tempPassword.equals(this.password);
    }
}
