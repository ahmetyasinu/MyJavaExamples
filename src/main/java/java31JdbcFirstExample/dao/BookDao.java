package java31JdbcFirstExample.JdbcUtilities;

import java31JdbcFirstExample.service.impl.AuthorServiceOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BookDao {



    public void updateBook(int idAuthorD ,String  firstName,String lastName ) {


        try {
            Connection connection = connect();
            String sql = "UPDATE book SET title = " + "'" + firstName + "'" + "," + " publisher=" + "'" + lastName + "'" +
                    " WHERE isbn = " + idAuthorD;
            PreparedStatement statement = connection.prepareStatement(sql);
            {
            }

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

