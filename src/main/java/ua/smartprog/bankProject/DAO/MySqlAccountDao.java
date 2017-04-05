package ua.smartprog.bankProject.DAO;

import ua.smartprog.bankProject.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MySqlAccountDao implements AccountDao {
    private final Connection connection;

    public MySqlAccountDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Account create() {
        return null;
    }

    @Override
    public Account read(int key) throws SQLException {
        String query = "SELECT * FROM account WHERE balance = ?;";
        PreparedStatement preSt = connection.prepareStatement(query);

        preSt.setInt(1, key);

        ResultSet rs = preSt.executeQuery();
        rs.next();
        String tempCard = rs.getString("cardNumber");
        int tempBalance = rs.getInt("balance");
        String tempPass = rs.getString("password");

        Account ac = new Account(tempCard, tempBalance, tempPass);
        return ac;
    }

    @Override
    public void update(Account account) {

    }

    @Override
    public void delete(Account account) {

    }

    @Override
    public List<Account> getAll() throws SQLException {
        return null;
    }
}
