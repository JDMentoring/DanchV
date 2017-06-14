package ua.smartprog.bankProject.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import ua.smartprog.bankProject.domain.Account;
import ua.smartprog.bankProject.mysql.MySqlAccountDao;
import ua.smartprog.bankProject.mysql.MySqlDaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by Тарас on 10.05.2017.
 */
public class AccountDaoTest {
    @Test // Task 1502
    public void createTest() throws Exception {
        MySqlDaoFactory databaseFactory = new MySqlDaoFactory();
        MySqlAccountDao accountDao = new MySqlAccountDao(databaseFactory.getConnection());
        assertEquals(accountDao.create().getClass(), "Manager");
    }

    @Test
    public void prepareStInsertTest() throws Exception {
        MySqlDaoFactory databaseFactory = new MySqlDaoFactory();
        Connection con = databaseFactory.getConnection();
        MySqlAccountDao accountDao = new MySqlAccountDao(databaseFactory.getConnection());
        Account ac = new Account("1234123412341234", 1234, "admin1234");
        String statement = "INSERT INTO Accounts (id, cardNumber, password, balance, cardPrint, cardEnd)" +
                "VALUES (?, ?, ?, ?, ?, ?);";
        PreparedStatement prSt = con.prepareStatement(statement);
        PreparedStatement prSt2 = con.prepareStatement(statement);
        accountDao.prepareStInsert(prSt2, ac);
        assertNotEquals(prSt, prSt2);
    }

    ;
}
