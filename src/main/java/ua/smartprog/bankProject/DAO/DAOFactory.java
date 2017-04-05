package ua.smartprog.bankProject.DAO;

import ua.smartprog.bankProject.Employee;

import java.sql.Connection;
import java.sql.SQLException;

public interface DAOFactory {
    public Connection getConnection() throws SQLException;
    public EmployeeDao getEmployeeDAO(Connection connection);
    public AccountDao getAccountDAO(Connection connection);
}
