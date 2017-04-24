package ua.smartprog.bankProject.domain;

import ua.smartprog.bankProject.other.Base;

public class Consulter extends Employee {
    private int experience;

    public Consulter() {
        super.defSet();
        experience  = 4;
        setSalary(1000);
        //new commit
    }

    public Consulter(int experience) {
        super.defSet();
        this.experience = experience;
        setSalary(1000);
    }

    public Consulter(String fName, String sName, int year, int month, int day, int ID, int Sal) {
        super.setFirstName(fName);
        super.setSecondName(sName);
        super.setBD(year, month, day);
        this.experience = 4;
        setSalary(1000);
    }
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public String ToString(){
        return super.ToString() + "Expirience = " + experience + "]";
    }
    public void registerCustomer(String fname, String sname, int year, int month, int day, String phoneNumber, int money, String pass){
        Base.addCustomer(fname, sname, year, month, day, phoneNumber, money, pass);
    }
}
