package ua.smartprog.bankProject;

import java.sql.SQLException;

public class Runner {
    public static void main(String[] args) {
        Manager manag = new Manager();
        Officer office  = new Officer();
        Consulter con = new Consulter();
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
    }
}
