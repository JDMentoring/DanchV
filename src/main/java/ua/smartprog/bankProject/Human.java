package ua.smartprog.bankProject;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Human {
    private String firstName;
    private String secondName;
    private GregorianCalendar born_date;

    public Human() {
        firstName = "Eric";
        secondName = "Martin";
        born_date = new GregorianCalendar(1990, 1, 1);
    }

    public Human(String fName, String sName, int year, int month, int day) {
        firstName = fName;
        secondName = sName;
        born_date = new GregorianCalendar(year,month, day);
    }

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

    public int getAge() {

        Calendar endCalendar = new GregorianCalendar();

        int diffYear = endCalendar.get(Calendar.YEAR) - born_date.get(Calendar.YEAR);
        int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - born_date.get(Calendar.MONTH);



        return (diffMonth / 12);
    }

    public String ToString() {
        return "Human[First Name = " + firstName
                + ", Second Name = " + secondName
                + ", Age = " + getAge()
                + "]";
    }
}
