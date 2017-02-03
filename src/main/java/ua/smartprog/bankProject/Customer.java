package ua.smartprog.bankProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Human {
    private ArrayList<Account> customerAccount;
    private int phoneNumber;

    public Customer() {
        super();
        this.customerAccount = new ArrayList<Account>();
        this.customerAccount.ensureCapacity(1);
        this.customerAccount.add(new Account());
    }

    public Customer(String fname, String sname, int age, int phoneNumber, int money, String pass) {
        super(fname, sname, age);
        this.phoneNumber = phoneNumber;
        this.customerAccount = new ArrayList<Account>();
        this.customerAccount.ensureCapacity(1);

        this.customerAccount.add(new Account(money, pass));
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void openVisaAccount() {
        this.customerAccount.add(new Account("VISA", 0, Account.generateDefaultPassword()));
    }

    public void openAccount() {
        this.customerAccount.add(new Account(0, Account.generateDefaultPassword()));
    }

    public void closeAccount() {
        this.customerAccount.remove(chosseAccount());
    }

    public int chosseAccount() {
        Scanner indexScan = new Scanner(System.in);
        int index;

        for (int i = 0; i < this.customerAccount.size(); i++) {
            this.customerAccount.get(i).shortInfo();
        }

        do {
            index = indexScan.nextInt();
        }
        while (index < 0 && index > this.customerAccount.size());
        return index;
    }
}
