package ua.smartprog.bankProject.domain;

import java.io.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Random;

import org.apache.log4j.Logger;
import ua.smartprog.bankProject.dao.Identified;

public class Account implements Serializable, Identified<Integer> {
    private static final Logger log = Logger.getLogger(Account.class);

    private int id;
    private String cardNumber;
    private int balance;
    private String password;
    private GregorianCalendar cardDate;
    private GregorianCalendar cardEnd;
    private ArrayList<Transaction> trs = new ArrayList<Transaction>();

    public Account() {
        this.cardNumber = generateCardNumber();
        this.balance = 0;
        this.password = generateDefaultPassword();
        cardDate = new GregorianCalendar();
        cardEnd = new GregorianCalendar();
        cardEnd.add(GregorianCalendar.YEAR, 3);
    }


    public Account(String number, int balance, String password) {
        this.cardNumber = number;
        this.balance = balance;
        this.password = password;
        cardDate = new GregorianCalendar();
        cardEnd = new GregorianCalendar();
        cardEnd.add(GregorianCalendar.YEAR, 3);
    }

    public Account(int balance, String password) {
        this.cardNumber = generateCardNumber();
        this.balance = balance;
        this.password = password;
        cardDate = new GregorianCalendar();
        cardEnd = new GregorianCalendar();
        cardEnd.add(GregorianCalendar.YEAR, 10);
    }

   /* public Account(String cardType, int balance, String password) {
        if (cardType == "VISA") this.cardNumber = generateVCNumber();
        else this.cardNumber = generateCardNumber();
        this.balance = balance;
        this.password = password;
        cardDate = new GregorianCalendar();
        cardEnd = new GregorianCalendar();
        cardEnd.add(GregorianCalendar.YEAR, 10);
    }*/

    public String getCardNumber() {
        return cardNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTrs(ArrayList<Transaction> trs) {
        this.trs = trs;
    }

    public void setCardEnd(GregorianCalendar cardEnd) {
        this.cardEnd = cardEnd;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCardDate(GregorianCalendar cardDate) {
        this.cardDate = cardDate;
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

    public void commitTransaction() {
        int amount = 0;
        String accountTo = null;
        amount = scan(amount);
        System.out.println("Account number to send money to:");
        accountTo = scanText();
        Transaction tempT = Transaction.create(this.cardNumber, accountTo, amount);
        trs.add(tempT);
    }

    public void checkCardDate() {
        GregorianCalendar currentDate = new GregorianCalendar();
        if (currentDate.get(currentDate.YEAR) < cardEnd.get(cardEnd.YEAR)) {
            int year = (cardEnd.get(cardEnd.YEAR) - currentDate.get(currentDate.YEAR));
            System.out.println("Your card willl work " + year + " years more!!");
        } else {
            System.out.println("Your card is outdated!!");
        }
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

    public int scan(int i) {
        Scanner scan = new Scanner(System.in);
        scan.nextInt();
        return i;
    }

    public String scanText() {
        Scanner scan = new Scanner(System.in);
        String i = scan.next();
        return i;
    }

    public String passForDB() {
        if (scanText() == this.password) {
            return password;
        } else {
            return "incorrect password inserted";
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


            } else if (diapason == 1) {
                pass.append(syms.charAt(generator.nextInt(syms.length())));
                check[diapason] = 1;
            } else {
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
        System.out.println("Type the current password to chandge it : ");
        if (checkPassword()) this.password = password;
    }

    public boolean checkPassword() {
        System.out.println("InsertPassword");
        Scanner passScan = new Scanner(System.in);
        String tempPassword = passScan.next();
        return tempPassword.equals(this.password);
    }

    public String toString() {
        return "Account[Card number = " + cardNumber
                + ", Balance = " + balance
                + "]";
    }

    public void shortInfo() {
        System.out.println("Number: " + this.cardNumber);
    }

    public static void saveData(String filename, Account accObject) throws IOException {
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        try {
            fileOut = new FileOutputStream(filename + ".ser");
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(accObject);
            log.info("Serialized!!!");

            log.info("Finish all streams!!!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
            log.error("File not found!!!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Object not found!!!");
            log.error("Object not found!!!");
            e.printStackTrace();
        } finally {
            fileOut.close();
            objOut.close();
        }
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    public int getBalance() {
        return balance;
    }
}
