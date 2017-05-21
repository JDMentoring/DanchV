package ua.smartprog.bankProject.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import ua.smartprog.bankProject.mysql.MySqlAccountDao;
import ua.smartprog.bankProject.mysql.MySqlDaoFactory;

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
    public void prepareStInsertTest() throws Exception{
        MySqlDaoFactory databaseFactory = new MySqlDaoFactory();
        MySqlAccountDao accountDao = new MySqlAccountDao(databaseFactory.getConnection());
        accountDao.
    }
}
