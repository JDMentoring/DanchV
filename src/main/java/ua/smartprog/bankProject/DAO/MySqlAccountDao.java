package ua.smartprog.bankProject.DAO;

import ua.smartprog.bankProject.Account;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class MySqlAccountDao implements AccountDao {
    private final Connection connection;
    private static final String CREATE_NEW_ACCOUNT = "INSERT INTO Account (cardNumber, balance, password) VALUES(?,?,?)";
    private static final String UPDATE_ACCOUNT_DB = "UPDATE Account \n" +
            "SET balance = ?, password = ? \n" +
            "WHERE password = ? / cardNumber = ?";

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
    public void update(Account account) throws SQLException{
        Connection connection = null;
        PreparedStatement prStatement = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type old password:");
        String oldPassword = scan.next();
        System.out.println("Type new password:");
        String newPassword = scan.next();
        MySqlDaoFactory msdf = new MySqlDaoFactory();
        try {
            connection = msdf.getConnection();
            prStatement = connection.prepareStatement(UPDATE_ACCOUNT_DB);
            prStatement.setInt(1, account.checkBalance());
            prStatement.setString(2, newPassword);
            prStatement.setString(3, oldPassword);
            prStatement.setString(4, account.getCardNumber());
            prStatement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (prStatement != null) {
                prStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

    }

    @Override
    public void delete(Account account) {

    }

    @Override
    public List<Account> getAll() throws SQLException {
        Connection connection = null;
        Statement st = null;
        String query = "SELECT * FROM account";
        st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
    }
}
