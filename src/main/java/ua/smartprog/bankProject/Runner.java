package ua.smartprog.bankProject;

import java.sql.SQLException;

public class Runner {
    public static void main(String[] args) {
        Manager manag = new Manager();
        Officer office  = new Officer();
        Consulter con = new Consulter();
        Account firs = new Account();
        firs.generateDefaultPassword();
        try {
            DatabaseConnection.addTableRow(firs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(office.getSalary());
        System.out.println(con.getSalary());
    }
}
