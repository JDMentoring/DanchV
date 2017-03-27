package ua.smartprog.bankProject;

import java.util.ArrayList;


public class Base {
    private static ArrayList<Account> accountsBase = new ArrayList<Account>();
    private static ArrayList<Employee> employeeBase = new ArrayList<Employee>();
    private static ArrayList<Employee> potentialEmployeeBase = new ArrayList<Employee>();
    private static ArrayList<Officer> officerBase = new ArrayList<Officer>();
    private static ArrayList<Consulter> consulterBase = new ArrayList<Consulter>();
    private static ArrayList<Customer> customerBase = new ArrayList<Customer>();

    public static ArrayList<Customer> getCustomerBase() {
        return customerBase;
    }

    public static void setCustomerBase(ArrayList<Customer> customerBase) {
        Base.customerBase = customerBase;
    }

    public static ArrayList<Manager> getManagerBase() {
        return managerBase;
    }

    public static void setManagerBase(ArrayList<Manager> managerBase) {
        Base.managerBase = managerBase;
    }

    public static ArrayList<Consulter> getConsulterBase() {
        return consulterBase;
    }

    public static void setConsulterBase(ArrayList<Consulter> consulterBase) {
        Base.consulterBase = consulterBase;
    }

    public static ArrayList<Officer> getOfficerBase() {
        return officerBase;
    }

    public static void setOfficerBase(ArrayList<Officer> officerBase) {
        Base.officerBase = officerBase;
    }

    private static ArrayList<Manager> managerBase = new ArrayList<Manager>();

    public ArrayList getAccs() {
        return accountsBase;
    }

    public static void addAccount(Account newbie) {
        accountsBase.add(newbie);
    }

    public static ArrayList<Account> getAccountsBase() {
        return accountsBase;
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

    public static ArrayList<Employee> getEmployees() {
        return employeeBase;
    }

    public void addPotentialEmployee(Employee newbie) {
        potentialEmployeeBase.add(newbie);
    }

    public ArrayList<Employee> getPotentialEmployees() {
        return potentialEmployeeBase;
    }
}
