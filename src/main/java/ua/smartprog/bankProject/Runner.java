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

        try {
            DatabaseConnection.createCurtomerPS();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            DatabaseConnection.UpdateAccountDb(20, "4885605797534250", "0_b__U__", "12348765");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(new Integer(3));
        int item = list.get(3);
        manag.createCustomerAccount(cus1);
    }

}
