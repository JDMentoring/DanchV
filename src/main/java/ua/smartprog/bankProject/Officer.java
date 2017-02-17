package ua.smartprog.bankProject;

import java.util.Random;

public class Officer extends Employee {
    private int workplaceNumber;
    Random random = new Random();

    public Officer() {
        workplaceNumber = random.nextInt(300) + 1;
        setSalary(2000);
    }

    public Officer(int wNumber) {
        this.workplaceNumber = wNumber;
        setSalary(2000);
    }

    public Officer(String fName, String sName, int cAge, int ID, int Sal, int wNumber) {
        super(fName, sName, cAge, ID, Sal);
        this.workplaceNumber = wNumber;
        setSalary(2000);
    }
    public String ToString() {
        Employee forToString = new Employee();
        return forToString.ToString() + ", worklaceNumber =" + workplaceNumber
                + "]";
    }
}