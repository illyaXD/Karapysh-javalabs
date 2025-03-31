package ntudp.pzks.lr5.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static final String URL = "jdbc:postgresql://localhost:5432/students_db";
    private static final String USER = "illia";
    private static final String PASSWORD = "illia";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}