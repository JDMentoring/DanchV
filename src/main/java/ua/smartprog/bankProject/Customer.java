package ua.smartprog.bankProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Human {
    private ArrayList<Account> customerAccount;
    private String phoneNumber;

    public Customer() {
        super.defSet();
        this.customerAccount = new ArrayList<Account>();
        this.customerAccount.ensureCapacity(1);
        this.customerAccount.add(new Account());
        try {
            Account.saveData("Account", customerAccount.get(customerAccount.size() - 1));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Customer(String fname, String sname, int year, int month, int day, String phoneNumber, int money, String pass) {
        super.setFirstName(fname);
        super.setSecondName(sname);
        super.setBD(year, month, day);
        this.phoneNumber = phoneNumber;
        this.customerAccount = new ArrayList<Account>();
        this.customerAccount.ensureCapacity(1);
        this.customerAccount.add(new Account(money, pass));
        try {
            Account.saveData("Account", customerAccount.get(customerAccount.size() - 1));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void openVisaAccount() {
        this.customerAccount.add(new Account("VISA", 0, Account.generateDefaultPassword()));
    }
    // TODO Task 1901
    public void openAccount() {
        this.customerAccount.add(new Account(0, Account.generateDefaultPassword()));
    }
    // TODO Task 1901
    public void closeAccount() {
        this.customerAccount.remove(chosseAccount());
    }
    // TODO Task 1901
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
    public String ToString(){
        return "Custemer[First Name = " + getFirstName()
                + ", Second Name = " + getSecondName()
                + ", Age = " + getAge()
                + ", Phone Number = " + phoneNumber
                + "]";
    }
}
