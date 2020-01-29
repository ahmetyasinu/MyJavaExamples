package java32.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
    public static Connection connect() {

        String jdbcURL = "jdbc:mysql://localhost:3306/sampledb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String dbUsername = "admin";
        String dbPassword = "12345";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcURL,dbUsername,dbPassword);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
