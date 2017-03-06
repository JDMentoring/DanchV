package ua.smartprog.bankProject;

import java.util.prefs.BackingStoreException;

public class Manager extends Employee {
    private int tax;
    private String bankName;

    public Manager() {
        super();
        tax = 300;
        bankName = "MyBank";
        setSalary(8000);
    }

    public Manager(String fName, String sName, int year, int month, int day, int ID, int Sal, String bankName) {
        super(fName, sName, year, month, day , ID, Sal);
        tax = 300;
        this.bankName = bankName;
        setSalary(8000);
    }

    public void increaseSal(int i, Officer a) {
        a.setSalary(a.getSalary() + i);
    }

    public void increaseSal(int i, Consulter a) {
        a.setSalary(a.getSalary() + i);
    }

    public void decreaseSal(int i, Officer a) {
        a.setSalary(a.getSalary() - i);
    }

    public void decreaseSal(int i, Consulter a) {
        a.setSalary(a.getSalary() - i);
    }

    public String getBankName() {
        return bankName;
    }

    public void createCustomerAccount(Customer cus) {
        Officer off1 = new Officer();
        off1.createCustomerAccount(cus);
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Manager(String bankName) {

        this.bankName = bankName;
    }

    public void setSalary(int salary) {

    }
    public String ToString(){
        Employee forToString = new Employee();
        return forToString.ToString() + ", Tax = " + tax
                + ", Bank Name = " + bankName
                + "]";

    }

}
