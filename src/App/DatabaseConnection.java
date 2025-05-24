package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection conn;

    public static Connection getConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            String url = "jdbc:mysql://localhost:3306/databasesekolah";
            String username = "root";
            String password = "";

            conn = DriverManager.getConnection(url, username, password);
        }
       return conn;
    }
}