package java30.jdbc;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class UsersView {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/sampledb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String dbUsername ="admin";
        String dbPassword = "12345";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL,dbUsername,dbPassword);
            String sql = "SELECT * FROM users";
            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery(sql);
            while (result.next()){
                int userId = result.getInt("user_id");
                String username = result.getString("username");
                String fullname = result.getString("fullname");
                String email = result.getString("email");
                String password = result.getString("password");
                System.out.println(userId+":"+username+","+fullname+","+email+","+password);
            }

                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

