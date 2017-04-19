package ua.smartprog.bankProject.DAO;

import ua.smartprog.bankProject.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MySqlAccountDao extends AbstractDAO<Account, Integer> {

    public MySqlAccountDao(Connection connection) {
        super(connection);
    }

    @Override
    public String getSelectQuery() {
        return "SELECT * FROM accounts;";
    }

    @Override
    public String getCreateQuery() {
        return null;
    }

    @Override
    public String getUpdateQuery() {
        return null;
    }

    @Override
    public String getDeleteQuery() {
        return null;
    }

    @Override
    public List<Account> parsingResultSet(ResultSet rs) throws DAOownException {
        LinkedList<Account> result = new LinkedList<Account>();
        try {
            while (rs.next()) {
                Account ac = new Account();
                ac.setId(rs.getInt("id"));
                ac.setNumber(rs.getString("number"));
                ac.setBalance(rs.getDouble("balance"));
                ac.setPassword(rs.getString("password"));
                result.add(ac);
            }

        } catch (Exception e) {
            throw new DAOownException(e);
        }
        return result;
    }
}
