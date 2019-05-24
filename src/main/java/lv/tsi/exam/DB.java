package lv.tsi.exam;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
    private static DB ourInstance = new DB();

    public static DB getInstance() {
        return ourInstance;
    }


    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    private Statement statement;
    private Connection connection;


    public static Connection createConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    private DB() {
        System.out.println("Connecting to database...");

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = connection.createStatement();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            try {
                if (statement != null) statement.close();
            } catch (SQLException se2) {
            }
        }
    }

    public Statement getStatement() {
        return statement;
    }
    public Connection getConnection() {
        return connection;
    }

    public void close() {
        try {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException se2) {
        }
    }
}
