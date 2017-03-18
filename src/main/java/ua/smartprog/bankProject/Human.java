package ua.smartprog.bankProject;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Human {
    private String firstName;
    private String secondName;
    private GregorianCalendar born_date;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void defSet(){
        firstName = "Undefined";
        secondName = "Undefined";
        born_date = null;
    }

    public int getAge() {

        Calendar endCalendar = new GregorianCalendar();

        int diffYear = endCalendar.get(Calendar.YEAR) - born_date.get(Calendar.YEAR);
        int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - born_date.get(Calendar.MONTH);
        return (diffMonth / 12);
    }

    public void setBD(int year, int month, int day){
        born_date.set(year, month, day);
    }

    public String ToString() {
        return "Human[First Name = " + firstName
                + ", Second Name = " + secondName
                + ", Age = " + getAge()
                + "]";
    }
}
