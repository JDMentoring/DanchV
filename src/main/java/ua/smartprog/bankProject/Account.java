package ua.smartprog.bankProject;

import java.util.Scanner;
import java.util.Random;

public class Account {
    Random generator = new Random();
    private static final int PASSLEN = 8;
    private int balance;
    private String cardNumber;
    private String password;

    public Account() {
        this.cardNumber = generateCardNumber();
        password = generateDefaultPassword();
    }

    public String generateDefaultPassword() {
        //retrying
        Random generator = new Random();
        StringBuilder pass = new StringBuilder();
        char _ = '_';
        int check1 = 0;
        int check2 = 0;
        char[] nums = new char[10];
        char[] sym = new char [26];
        for (int i = 0; i < nums.length; i++){
            nums[i] = (char)(i + 48);
        }
        for (int i = 0; i < sym.length; i++){
            sym[i] = (char)(i + 97);
        }
        for(int i = 0; i < PASSLEN; i++){
            int arrChoose = generator.nextInt(2);
            if(i == 4){
                pass.append("_");
            }
            else{
                if(arrChoose == 0){
                    pass.append(nums[generator.nextInt(9)]);
                    check1 = 1;
                }
                else if(arrChoose == 1){
                    pass.append(sym[generator.nextInt(25)]);
                    check2 = 1;
                }
            }
        }
        System.out.println(pass);
        if(check1 + check2 == 2){
            return pass.toString();
        }
        else{
            return generateDefaultPassword();
        }
    }


    public int checkBalance() {
        if (checkPassword()) {
            return balance;
        } else {
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

    public String generateVCNumber() {
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < num.capacity(); i++) {
            int temp = generator.nextInt(10);
            if (i == num.length()) {
                temp = 4;
            }
            num.append(temp);
        }
        setCardNumber(num.toString());
        return num.toString();
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean checkPassword() {
        Scanner passScan = new Scanner(System.in);
        String tempPassword = passScan.next();
        return tempPassword.equals(this.password);
    }

    //start 1601
    //start 1601
    //Dont know why is the mistake happening


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
}
