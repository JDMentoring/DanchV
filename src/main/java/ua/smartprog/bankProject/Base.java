package ua.smartprog.bankProject;

import java.util.ArrayList;


public class Base {
    private ArrayList<Account> accountsBase = new ArrayList<Account>();
    private ArrayList<Employee> employeeBase = new ArrayList<Employee>();
    private ArrayList<Employee> potentialEmployeeBase = new ArrayList<Employee>();

    public ArrayList getAccs(){
        return accountsBase;
    }

    public void addAccount(Account newbie){
        accountsBase.add(newbie);
    }

    public void fireEmployee(int index){
        employeeBase.remove(index);
    }

    public void employ(Employee newbie){
        employeeBase.add(newbie);
    }
    public ArrayList getEmployees(){
        return employeeBase;
    }

    public void addPotentialEmployee(Employee newbie){
        potentialEmployeeBase.add(newbie);
    }

    public ArrayList<Employee> getPotentialEmployees(){
        return potentialEmployeeBase;
    }
}
