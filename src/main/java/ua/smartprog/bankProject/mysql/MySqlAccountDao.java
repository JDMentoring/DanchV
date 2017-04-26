package ua.smartprog.bankProject.mysql;

import ua.smartprog.bankProject.dao.AbstractDAO;
import ua.smartprog.bankProject.dao.DAOownException;
import ua.smartprog.bankProject.domain.Account;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class MySqlAccountDao extends AbstractDAO<Account, Integer> {

    private class ExtAccount extends Account{
        public void setID(int id){ super.setId(id);}
    }

    public MySqlAccountDao(Connection connection) {
        super(connection);
    }

    @Override
    public Account create() throws DAOownException {
        Account ac = new Account();
        return extCreate(ac);
    }

    @Override
    public String getSelectQuery() {
        return "SELECT * FROM accounts;";
    }

    @Override
    public String getCreateQuery() {
        return "INSERT INTO Account (id, cardNumber, password, balance) VALUES(?, ?, ?, ?);";
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
    public void prepareStInsert(PreparedStatement stm, Account obj) throws DAOownException {
        int accountID = (obj.getId() == null) ? 0 : obj.getId();

        try {
            stm.setInt(1, accountID);
            stm.setString(2, obj.getCardNumber());
            stm.setString(3, obj.passForDB());
            stm.setInt(4, obj.getBalance());
        } catch (Exception e) {
            throw new DAOownException(e);
        }

    }

    @Override
    public List<Account> parsingResultSet(ResultSet rs) throws DAOownException {
        LinkedList<Account> result = new LinkedList<Account>();
        try {
            while (rs.next()) {
                ExtAccount ac = new ExtAccount();
                ac.setID(rs.getInt("id"));
                ac.setCardNumber(rs.getString("number"));
                ac.setBalance(rs.getInt("balance"));
                ac.setPassword(rs.getString("password"));
                result.add(ac);
            }

        } catch (Exception e) {
            throw new DAOownException(e);
        }
        return result;
    }
}
