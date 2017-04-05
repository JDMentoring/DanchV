package ua.smartprog.bankProject.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDaoFactory implements DAOFactory {
    private static final String DRIVERNAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/danulo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";


    @Override
    public Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName(DRIVERNAME);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    @Override
    public EmployeeDao getEmployeeDAO(Connection connection) {
        return null;
    }

    @Override
    public AccountDao getAccountDAO(Connection connection) {
        return new MySqlAccountDao(connection);
    }

    public MySqlDaoFactory(){
        try {
            Class.forName(DRIVERNAME);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
