package ua.smartprog.bankProject;

import java.util.ArrayList;


public class Base {
    private static ArrayList<Account> accountsBase = new ArrayList<Account>();
    private static ArrayList <Employee> employeeBase = new ArrayList<Employee>();
    private static ArrayList<Employee> potentialEmployeeBase = new ArrayList<Employee>();

    public ArrayList getAccs(){
        return accountsBase;
    }

    public static void addAccount(Account newbie){
        accountsBase.add(newbie);
    }

    public static void fireEmployee(int index){
        employeeBase.remove(index);
    }

    public static void employ(Employee newbie){
        employeeBase.add(newbie);
    }
    public static ArrayList getEmployees(){
        return employeeBase;
    }

    public void addPotentialEmployee(Employee newbie){
        potentialEmployeeBase.add(newbie);
    }

    public ArrayList<Employee> getPotentialEmployees(){
        return potentialEmployeeBase;
    }
}
