package java30.jdbc;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class AddNewData {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/sampledb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String dbUsername = "admin";
        String dbPassword = "12345";

        String username = "Selami";
        String email = "Kara@gmail.com";
        String fullname = "Selami Karakelle";
        String password = "1555";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);

            String sql = "INSERT INTO Users (username, email, fullname, password)"
                    + " VALUES (?,?,?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, email);
            statement.setString(3, fullname);
            statement.setString(4, password);
            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("A new user was inserted successfully!");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}