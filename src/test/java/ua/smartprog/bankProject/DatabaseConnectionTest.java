package ua.smartprog.bankProject;

import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseConnectionTest {
    @Test
    public void getConnection() throws Exception {

        //assertNotEquals(null,DatabaseConnection.getConnection());

        DatabaseConnection.createUserTable();
    }

}