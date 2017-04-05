package ua.smartprog.bankProject.DAO;

import ua.smartprog.bankProject.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
    public Employee create();
    public Employee read(int key);
    public void update(Employee employee);
    public void delete(Employee employee);
    public List<Employee> getAll()throws SQLException;
}
