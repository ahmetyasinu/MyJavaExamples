package java32.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import static java31JdbcFirstExample.utils.JdbcUtils.connect;

public class CourseDao {
    public void addCourse(int idCourse, String fullName, String shortName) {
        try {
            Connection connection = connect();
            String sql = "INSERT INTO course (idcourse,fullname,shortname,createddate)"
                    + " VALUES (?,?,?,?)";

            java.sql.Date date1 = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            PreparedStatement statement = connect().prepareStatement(sql);
            statement.setInt(1, idCourse);
            statement.setString(2, fullName);
            statement.setString(3, shortName);
            statement.setDate(4, date1);;

            int rows = statement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}