package ua.smartprog.bankProject.mysql;

import ua.smartprog.bankProject.dao.*;
import ua.smartprog.bankProject.domain.Account;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class MySqlDaoFactory implements DAOFactory<Connection> {
    private static final String DRIVERNAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/danulo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private Map<Class, DAOCreator> daoCreatorMap;


    @Override
    public Connection getConnection() throws DAOownException {
        Connection connection = null;
        try {
            Class.forName(DRIVERNAME);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new DAOownException(e);
        }
        return connection;
    }

    @Override
    public GenericDao getDAO(Connection connection, Class daoClass) throws DAOownException {
        DAOCreator creator = daoCreatorMap.get(daoClass);

        if (creator == null) {
            throw new DAOownException("DAO object not found for class" + daoClass);
        }
        return creator.create(connection);

    }

    public MySqlDaoFactory() {
        try {
            Class.forName(DRIVERNAME);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        daoCreatorMap = new HashMap<Class, DAOCreator>();
        daoCreatorMap.put(Account.class, new DAOCreator<Connection>() {
            @Override
            public GenericDao create(Connection connection) {
                return new MySqlAccountDao(connection);
            }
        });

        /*daoCreatorMap.put(Customer.class, new DAOCreator<Connection>() {
            @Override
            public GenericDao create(Connection connection) {
                return new MySqlCustomerDao(connection);
            }
        });*/
    }
}
