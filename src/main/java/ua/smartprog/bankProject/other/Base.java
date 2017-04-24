package ua.smartprog.bankProject.other;

import ua.smartprog.bankProject.domain.*;

import java.util.ArrayList;


public class Base {
    private static ArrayList<Account> accountsBase = new ArrayList<Account>();
    private static ArrayList<Employee> employeeBase = new ArrayList<Employee>();
    private static ArrayList<Employee> potentialEmployeeBase = new ArrayList<Employee>();
    private static ArrayList<Officer> officerBase = new ArrayList<Officer>();
    private static ArrayList<Consulter> consulterBase = new ArrayList<Consulter>();
    private static ArrayList<Customer> customerBase = new ArrayList<Customer>();
    private static ArrayList<Manager> managerBase = new ArrayList<Manager>();


    public static Customer getCustomerBase(int index) {
        return customerBase.get(index);
    }

    public static void setCustomerBase(ArrayList<Customer> customerBase) {
        Base.customerBase = customerBase;
    }

    public static Manager getManagerBase(int index) {
        return managerBase.get(index);
    }

    public static void setManagerBase(ArrayList<Manager> managerBase) {
        Base.managerBase = managerBase;
    }

    public static Consulter getConsulterBase(int index) {
        return consulterBase.get(index);
    }

    public static void setConsulterBase(ArrayList<Consulter> consulterBase) {
        Base.consulterBase = consulterBase;
    }

    public static Officer getOfficerBase(int index) {
        return officerBase.get(index);
    }

    public static void setOfficerBase(ArrayList<Officer> officerBase) {
        Base.officerBase = officerBase;
    }


    public static ArrayList<Account> getAccs() {
        return accountsBase;
    }

    public static void addAccount(Account newbie) {
        accountsBase.add(newbie);
    }

    public static Account getAccountsBase(int index) {
        return accountsBase.get(index);
    }

    public static void addAccount() {
        accountsBase.add(new Account());
    }


    public static void fireEmployee(int index) {
        employeeBase.remove(index);
    }

    public static void employ(Employee newbie) {
        employeeBase.add(newbie);
    }

    public static ArrayList<Employee> getEmployeeBase() {
        return employeeBase;
    }

    public static Employee getEmployee(int index) {
        return employeeBase.get(index);
    }

    public static void addCustomer(String fname, String sname, int year, int month, int day, String phoneNumber, int money, String pass) {
        customerBase.add(new Customer(fname, sname, year, month, day, phoneNumber, money, pass));
    }

    public static void addPotentialEmployee(String fname, String sname, int year, int month, int day) {
        potentialEmployeeBase.add(new Employee(fname, sname, year, month, day));
    }

    public static Employee getPotentialEmployees(int index) {
        return potentialEmployeeBase.get(index);
    }
}
