package ua.smartprog.bankProject;

import com.sun.corba.se.spi.ior.MakeImmutable;

import java.util.Random;

public class Officer extends Employee{
    private int workplaceNumber;
    Random random = new Random();
    Manager managersCommand = new Manager();

    public Officer() {
        workplaceNumber = random.nextInt(300) + 1;
        setSalary(2000);
    }

    public Officer(int wNumber) {
        this.workplaceNumber = wNumber;
        setSalary(2000);
    }



    public Officer(String fName, String sName,int year, int month, int day, int ID, int Sal, int wNumber) {
        super(fName, sName, year, month, day, ID, Sal);
        this.workplaceNumber = wNumber;
        setSalary(2000);
    }

    public static void createCustomerAccount(Customer cus){
        cus.openAccount();
    }

    public String ToString() {
        Employee forToString = new Employee();
        return forToString.ToString() + ", worklaceNumber =" + workplaceNumber
                + "]";
    }
}