package ua.smartprog.bankProject.domain;

import ua.smartprog.bankProject.dao.Identified;
import ua.smartprog.bankProject.other.Base;

public class Manager extends Employee implements Identified<Integer> {
    private int id;
    private int tax;
    private String bankDepartment;

    public Manager() {
        super.defSet();
        tax = 300;
        bankDepartment = "MyBank";
        setSalary(8000);
    }

    public Manager(String fName, String sName, int year, int month, int day, int ID, int Sal, String bankDepartment) {
        super.setFirstName(fName);
        super.setSecondName(sName);
        super.setBD(year, month, day);
        tax = 300;
        this.bankDepartment = bankDepartment;
        setSalary(8000);
    }


    public void increaseSal(int i, int index) {
        Base.getEmployee(index).setSalary(Base.getEmployee(index).getSalary() + i);
    }

    public void decreaseSal(int i, int index) {
        Base.getEmployee(index).setSalary(Base.getEmployee(index).getSalary() - i);
    }


    public String getBankDepartment() {
        return bankDepartment;
    }


    public void setBankDepartment(String bankDepartment) {
        this.bankDepartment = bankDepartment;
    }

    public Manager(String bankDepartment) {

        this.bankDepartment = bankDepartment;
    }

    public int getTax() {
        return tax;
    }

    public void setSalary(int salary, int index) {
        Base empBase = new Base();
        Employee temp = (Employee) empBase.getEmployeeBase().get(index);
        temp.setSalary(salary);
    }

    public String toString() {
        return super.toString() + ", Tax = " + tax
                + ", Bank Name = " + bankDepartment
                + "]";
    }


    public void newEmployee(Employee emp) {
        Base empBase = new Base();
        empBase.employ(emp);
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void setTax(int tax) {
        this.tax = tax;
    }

    public void deleteEmployee(int index) {
        Base empBase = new Base();
        empBase.fireEmployee(index);
    }
}
