package ua.smartprog.bankProject;

import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseConnectionTest {
    @Test
    public void getCustomers() throws Exception {


    }

    @Test
    public void createCurtomerPSTest() throws Exception {
        DatabaseConnection.getCustomers();
        //DatabaseConnection.createCurtomerPS();
        System.out.println("After query\n");
        //DatabaseConnection.getCustomers();
    }

    @Test
    public void getConnection() throws Exception {

        DatabaseConnection.getConnection();

        // DatabaseConnection.createUserTable();
    }

    @Test
    public void rowAddTest() throws Exception {
        Account obj1 = new Account();
        DatabaseConnection.addTableRow(obj1);
    }

}