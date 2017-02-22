package ua.smartprog.bankProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private static final String DRIVERNAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://servlab.mysql.ukraine.com.ua:3306/servlab_danoop";
    private static final String USERNAME = "servlab_danoop";
    private static final String PASSWORD = "pmyqjlhz";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVERNAME); // Рефлексія
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Driver not found!!!");
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Can't connect to database!!!");
            System.out.println(e.getMessage());
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


}
