package ua.smartprog.bankProject;

public class Employee extends Human {
    private int ID;
    private int Salary;
    private int WorkDays;

    public Employee() {
        ID = 0;
        Salary = 0;
        WorkDays = 0;
    }

    public Employee(String fName, String sName, int cAge, int ID, int Sal) {
        super(fName, sName, cAge);
        this.ID = ID;
        Salary = Sal;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }

    public int getID() {
        return ID;
    }

    public int getSalary() {
        return Salary;
    }
}
