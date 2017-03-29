/*package ua.smartprog.bankProject;

import java.sql.*;

import org.apache.log4j.Logger;

public class DatabaseConnection {
    private static final String DRIVERNAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/danulo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static final String INSERT_NEW_CUSTOMER = "INSERT INTO Customer (Name, Surname) VALUES(?,?)";
    private static final String UPDATE_ACCOUNT_DB = "UPDATE Account \n" +
            "SET balance = ?, password = ? \n" +
            "WHERE password = ? / cardNumber = ?";


    private static final Logger log = Logger.getLogger(DatabaseConnection.class);


    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVERNAME); // Рефлексія
            log.info("JDBC Driver is loaded");
        } catch (ClassNotFoundException e) {
            log.error("JDBC Driver not found!!!");
            log.error(e.getMessage());
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            log.info("Connect to database successful!!!");
        } catch (SQLException e) {
            log.error("Can't connect to database!!!");
            log.error(e.getMessage());
        }
        return connection;
    }

    public static void createUserTable() throws SQLException {
        Connection connection = null;
        Statement statement = null;

        String createTableMYSQL = "CREATE TABLE `servlab_danoop`.`Customer` (\n" +
                "  `Name` VARCHAR(20) NOT NULL,\n" +
                "  `Surname` VARCHAR(45) NULL,\n" +
                "  PRIMARY KEY (`Name`))\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8;";

        try {
            connection = getConnection();
            statement = connection.createStatement();
            statement.execute(createTableMYSQL);
            System.out.println("Table was created!!!");
        } catch (SQLException e) {
            System.out.println("Table was not created");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    //start creating rows
    public static void addTableRow(Account infoobj) throws SQLException {
        Connection connection = null;
        Statement statement = null;

        String createTableRow = "INSERT INTO `servlab_danoop`.`Account` \n" + "(" +
                "`balance` ," +
                "`cardNumber` ," +
                "`password`)"
                + "\n VALUES " +
                "( '" + infoobj.balance + "', '" + infoobj.cardNumber + "', '" + infoobj.password + "');";

        try {
            connection = getConnection();
            statement = connection.createStatement();
            statement.execute(createTableRow);
            System.out.println("Row was added!!!");
        } catch (SQLException e) {
            System.out.println("Row wasn't added!!!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    public static void createCurtomerPS() throws SQLException {
        Connection connection = null;
        PreparedStatement prStatement = null;

        try {
            connection = getConnection();
            prStatement = connection.prepareStatement(INSERT_NEW_CUSTOMER);
            prStatement.setString(1, "Nazar");
            prStatement.setString(2, "Mykhailiv");
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

    public static void UpdateAccountDb(int balance, String cardNumber, String newPassword, String oldPassword) throws SQLException {
        Connection connection = null;
        PreparedStatement prStatement = null;
        try {
            connection = getConnection();
            prStatement = connection.prepareStatement(UPDATE_ACCOUNT_DB);
            prStatement.setInt(1, balance);
            prStatement.setString(2, newPassword);
            prStatement.setString(3, oldPassword);
            prStatement.setString(4, cardNumber);
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

    public static void getCustomers() throws SQLException {
        Connection connection = null;
        Statement statement = null;

        String selectQuery = "SELECT * FROM Customer";


        try {
            connection = getConnection();
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectQuery);

            System.out.println("ID\tNAME\tSURNAME");
            while (rs.next()) {
                Customer tempCM = new Customer();
                int userID = rs.getInt("id");
                tempCM.setFirstName(rs.getString("Name"));
                tempCM.setSecondName(rs.getString("Surname"));

                System.out.println(userID + "\t" + tempCM.getFirstName() + "\t" + tempCM.getSecondName());

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

}*/

