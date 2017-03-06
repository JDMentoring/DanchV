package ua.smartprog.bankProject;

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Account implements Serializable{
    public String cardNumber;
    public int balance;
    public String password;
//
    public Account() {
        this.cardNumber = generateCardNumber();
        this.balance = 0;
        this.password = generateDefaultPassword();
    }

    private

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

    //finish refactor
    public static String generateDefaultPassword() {
        //retrying
        final int PASSLEN = 8;
        Random generator = new Random();
        StringBuilder pass = new StringBuilder();
        char otherSymbol = '_';
        int[] check = new int[3];
        String syms = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String nums = "1234567890";
        int diapason = 0;
        for (int i = 0; i < PASSLEN; i++) {
            diapason = generator.nextInt(3);
            if (diapason == 2) {
                pass.append(otherSymbol);
                check[diapason] = 1;


            } else if (diapason == 1){
                 pass.append(syms.charAt(generator.nextInt(syms.length())));
                check[diapason] = 1;
            }
            else {
                pass.append(nums.charAt(generator.nextInt(nums.length())));
                check[diapason] = 1;
            }
        }
        if (check[0] + check[1] + check[2] == 3) {
            return pass.toString();
        } else {
            return generateDefaultPassword();
        }
    }

    public void resetPassword(String password) {
        System.out.println("Put the current password to chandge it : ");
        if (checkPassword()) this.password = password;
    }

    public boolean checkPassword() {
        System.out.println("InsertPassword");
        Scanner passScan = new Scanner(System.in);
        String tempPassword = passScan.next();
        return tempPassword.equals(this.password);
    }

    public String toString(){
        return "Account[Card number = " + cardNumber
                + ", Balance = " + balance
                + "]";
    }

    public void shortInfo(){
        System.out.println("Number: "+this.cardNumber);
    }

    public static void saveData(String filename, Account accObject){
        try {
            FileOutputStream fileOut = new FileOutputStream(filename + ".ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(accObject);
            fileOut.close();
            objOut.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Object not found!!!");
            e.printStackTrace();
        }
    }
}
