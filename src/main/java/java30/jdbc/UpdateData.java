package java30.jdbc;

import java.sql.*;

public class UpdateData {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/sampledb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String dbUsername = "admin";
        String dbPassword = "12345";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);
            String sql = "UPDATE users SET password ='parola' WHERE username='ahmet'";

            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("Update this data");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}