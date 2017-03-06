package ua.smartprog.bankProject;

import java.sql.SQLException;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Object obj;
        Manager manag = new Manager();
        Officer office = new Officer();
        Consulter con = new Consulter();
        Customer cus1 = new Customer();
        Account firs = new Account();

        System.out.println(office.getSalary());
        System.out.println(con.getSalary());



        manag.createCustomerAccount(cus1);
        Account.saveData("Account", firs);
    }

}
