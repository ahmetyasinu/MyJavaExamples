package java30.jdbc;

import java.sql.*;
import java.util.Scanner;

public class DeleteData {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/sampledb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String dbUsername = "admin";
        String dbPassword = "12345";
        int idAuthorD =0;

        System.out.println("Değiştirilecek Yazar isbn Giriniz");
        Scanner scan = new Scanner(System.in);
        idAuthorD = scan.nextInt();


        try {
            Connection connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);
            String sql = "DELETE FROM users WHERE idauthor = idAuthord";
            Statement statement=connection.createStatement();
            int rows = statement.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("A  user was deleted successfully!");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
