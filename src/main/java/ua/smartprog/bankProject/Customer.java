package ua.smartprog.bankProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Human {
    private ArrayList<Account> customerAccount;
    private String phoneNumber;

    public Customer() {
        super();
        this.customerAccount = new ArrayList<Account>();
        this.customerAccount.ensureCapacity(1);
        this.customerAccount.add(new Account());
    }

    public Customer(String fname, String sname, int age, String phoneNumber, int money, String pass) {
        super(fname, sname, age);
        this.phoneNumber = phoneNumber;
        this.customerAccount = new ArrayList<Account>();
        this.customerAccount.ensureCapacity(1);

        this.customerAccount.add(new Account(money, pass));
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
