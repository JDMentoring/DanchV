package ua.smartprog.bankProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private final String DRIVERNAME = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3006/danylo";
    private final String USERNAME = "root";
    private final String PASSWORD = "klarc2002";

    public Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName(DRIVERNAME);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Driver not found!!!");
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Can't connect to database!!!");
        }
        return connection;
    }
}
