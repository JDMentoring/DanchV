package ua.smartprog.bankProject.DAO;

import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class MySqlDaoFactoryTest {
    @Test
    public void getAccountDAO() throws Exception {
        DAOFactory daoFactory = new MySqlDaoFactory();
        AccountDao adao = null;

        try (Connection cn = daoFactory.getConnection()) {
            adao = daoFactory.getAccountDAO(cn);
            System.out.println(adao.read(5000).toString());

        }
        assertNotNull(adao);
    }
}