package ua.smartprog.bankProject.mysql;

import ua.smartprog.bankProject.dao.AbstractDAO;
import ua.smartprog.bankProject.dao.DAOownException;
import ua.smartprog.bankProject.domain.Customer;
import ua.smartprog.bankProject.domain.Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.LinkedList;
import java.util.List;

public class MySqlCustomerDao extends AbstractDAO<Customer, Integer> {

    public MySqlCustomerDao(Connection connection) {
        super(connection);
    }

    @Override
    public void prepareStUpdate(PreparedStatement stm, Customer obj) throws DAOownException {

    }
    @Override
    public String getSelectQuery() {
        return "SELECT FROM customers WHERE customer_id = ?;";
    }

    @Override
    public String getCreateQuery() {
        return "INSERT INTO customers (customer_name, customer_surname) VALUES(?, ?);";
    }

    @Override
    public String getUpdateQuery() {
        return "UPDATE customers SET customer_name = ?, customer_surname = ?, WHERE id = ?;";
    }

    @Override
    public String getDeleteQuery() {
        return "DELETE FROM customers WHERE customer_id = ?;";
    }

    @Override
    public void prepareStInsert(PreparedStatement stm, Customer obj) throws DAOownException {
        try {
            stm.setNull(1, Types.INTEGER);
            stm.setString(2, obj.getSecondName());
            stm.setString(3, obj.getSecondName());
        } catch (Exception e) {
            throw new DAOownException(e);
        }
    }

    @Override
    public List<Customer> parsingResultSet(ResultSet rs) throws DAOownException {
        LinkedList<Customer> result = new LinkedList<Customer>();
        try {
            while (rs.next()) {
                ExtCustomer cus = new ExtCustomer();
                cus.setFirstName(rs.getString("customer_name"));
                cus.setSecondName(rs.getString("customer_surname"));
                result.add(cus);
            }

        } catch (Exception e) {
            throw new DAOownException(e);
        }
        return result;
    }

    @Override
    public Customer create() throws DAOownException {
        Customer customer = new Customer();
        return extCreate(customer);
    }

    private class ExtCustomer extends Customer {
        public void setFirstName(String firstname) {
            super.setFirstName(firstname);
        }

        public void setSecondName(String secondname) {
            super.setSecondName(secondname);
        }
    }
}
