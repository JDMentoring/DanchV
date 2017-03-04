package ua.smartprog.lesson_27;

import java.io.Serializable;

public class Human implements Serializable {
    public static final long SerialVersionUID = 100500L;
    private String firstName;
    private String secondName;
    private int age;

    public Human() {
        firstName = "none";
        secondName = "none";
        age = 0;
    }

    public Human(String fName, String sName, int cAge) {
        firstName = fName;
        secondName = sName;
        age = cAge;
    }

    public void setAge(int age) {
        this.age = age;
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
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
