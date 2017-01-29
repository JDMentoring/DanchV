package ua.smartprog.bankProject;

import java.util.Scanner;
import java.util.Random;

public class Account {
    Random generator = new Random();
    private static final int PASSLEN = 8;
    private int balance;
    private String cardNumber;
    private String password;

    public Account(){
        this.cardNumber = generateCardNumber();
        generateDefaultPassword();
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

    public String generateVCNumber(){
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < num.capacity(); i++) {
            int temp = generator.nextInt(10) ;
            if(i == num.length()){
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

    public void generateDefaultPassword(){
        int[] passarray = new int[PASSLEN];
        int check1 = 0;
        int check2 = 0;
        int check3 = 0;
        int diapason;
        for (int i = 0; i < PASSLEN; i++) {
            diapason = generator.nextInt(2);
            if(diapason == 0){
                passarray[i] = (char)95;
                if(check1 == 0){
                    check1 = 1;
                }
            }
            else if(diapason == 1){
                passarray[i] = (char)generator.nextInt(122) + 97;
                if(check2 == 0){
                    check2 = 1;
                }
            }
            else if(diapason == 2){
                passarray[i] = (char)generator.nextInt(48) + 57;
                if(check3 == 0){
                    check3 = 1;
                }
            }
        }
        System.out.println(passarray.toString());
        if(check1 == 1 && check2 == 1 && check3 == 1){
            this.password = passarray.toString();
        }
        else{
            generateDefaultPassword();
        }
    }
    //Dont know why is the mistake happening


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
