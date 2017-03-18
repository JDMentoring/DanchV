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
        Account first = new Account();
        ArrayList<Account> accountsBase;

        System.out.println(office.getSalary());
        System.out.println(con.getSalary());

        Menu men = new Menu();



        manag.createCustomerAccount(cus1);
        Account.saveData("Account", first);
        first.checkCardDate();
    }

}
