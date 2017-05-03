package ua.smartprog.bankProject.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.runners.Parameterized;
import ua.smartprog.bankProject.domain.Account;
import ua.smartprog.bankProject.mysql.MySqlDaoFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collection;

public class MySqlDaoTest extends GenericDaoTest {

    private Connection connection;
    private GenericDao dao;

    private static DAOFactory<Connection> factory = new MySqlDaoFactory();

    @Parameterized.Parameters
    public static Collection getParamaters() {
        return Arrays.asList(
                new Object[][]{
                        {Account.class, new Account()}
                });
    }

    @Before
    public void loadSetup() throws DAOownException, SQLException {
        connection = factory.getConnection();
        connection.setAutoCommit(false);
        dao = factory.getDAO(connection, daoClass);
    }

    @After
    public void closeAll() throws SQLException{
        context().rollback();
        context().close();
    }

    @Override
    public GenericDao dao() {
        return dao;
    }

    @Override
    public Connection context() {
        return connection;
    }

    public MySqlDaoTest(Class daoClass, Identified daoObject, Connection connection, GenericDao dao) {
        super(daoClass, daoObject);
        this.connection = connection;
        this.dao = dao;
    }
}
