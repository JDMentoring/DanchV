package ua.smartprog.bankProject.mysql;

import ua.smartprog.bankProject.dao.AbstractDAO;
import ua.smartprog.bankProject.dao.DAOownException;
import ua.smartprog.bankProject.domain.Account;

import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

public class MySqlAccountDao extends AbstractDAO<Account, Integer> {

    private class ExtAccount extends Account {
        public void setID(int id) {
            super.setId(id);
        }

        public void setCardEnd(GregorianCalendar cardEnd) {
            super.setCardEnd(cardEnd);
        }

        public void setBalance(int balance) {
            super.setBalance(balance);
        }

        public void setCardDate(GregorianCalendar cardDate) {
            super.setCardDate(cardDate);
        }

        public void setCardNumber(String cardNumber) {
            super.setCardNumber(cardNumber);
        }
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
        return "INSERT INTO Account (id, cardNumber, password, balance, productionDate, endDate) VALUES(?, ?, ?, ?, ? ,?);";
    }

    @Override
    public String getUpdateQuery() {
        return "UPDATE Accounts SET cardNumber = ?, password = ?, balance = ?, productionDate = ?, endDate = ? WHERE id = ?;";
    }

    @Override
    public String getDeleteQuery() {
        return "DELETE FROM Accounts WHERE id = ?;";
    }

    @Override
    public void prepareStInsert(PreparedStatement stm, Account obj) throws DAOownException {
        int accountID = (obj.getId() == null) ? 0 : obj.getId();

        try {
            stm.setInt(1, accountID);
            stm.setString(2, obj.getCardNumber());
            stm.setString(3, obj.passForDB());
            stm.setInt(4, obj.getBalance());
            stm.setDate(5, convertDate(obj.getCardDate()));
            stm.setDate(6, convertDate(obj.getCardEnd()));
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
                ac.setCardDate(convertToGregorianCalendar(rs.getDate("productionDate")));
                ac.setCardEnd(convertToGregorianCalendar(rs.getDate("endDate")));
                result.add(ac);
            }

        } catch (Exception e) {
            throw new DAOownException(e);
        }
        return result;
    }


    @Override
    public void prepareStUpdate(PreparedStatement stm, Account obj) throws DAOownException {
        try {
            stm.setString(1, obj.getCardNumber());
            stm.setString(2, obj.passForDB());
            stm.setInt(3, obj.getBalance());
            stm.setDate(4, convertDate(obj.getCardDate()));
            stm.setDate(5, convertDate(obj.getCardEnd()));

        } catch (Exception e) {
            throw new DAOownException(e);
        }
    }

    protected java.sql.Date convertDate(java.util.GregorianCalendar date) {
        return new java.sql.Date(date.getTime().getTime());
    }

    protected java.util.GregorianCalendar convertToGregorianCalendar(java.sql.Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return gregorianCalendar;
    }
}
