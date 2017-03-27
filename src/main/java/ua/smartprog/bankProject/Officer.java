package ua.smartprog.bankProject;

import com.sun.corba.se.spi.ior.MakeImmutable;

import java.util.Random;

public class Officer extends Employee{
    private int workplaceNumber;
    Random random = new Random();

    public Officer() {
        super.defSet();
        workplaceNumber = random.nextInt(300) + 1;
        setSalary(2000);
    }

    public Officer(String fName, String sName, int year, int month, int day, int wNumber) {
        super.setFirstName(fName);
        super.setSecondName(sName);
        super.setBD(year, month, day);
        this.workplaceNumber = wNumber;
        setSalary(2000);
    }

    public void createCustomerAccount(int index){
        Base.getCustomerBase(index).openAccount();
    }

    public String ToString() {
        return super.ToString() + ", worklaceNumber =" + workplaceNumber
                + "]";
    }
}