package java32.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java31JdbcFirstExample.utils.JdbcUtils.connect;

public class DepartmentDao {
    public void addDepartment(int idDepartment, String departmentName) {
        try {
            Connection connection = connect();
            String sql = "INSERT INTO department (iddepartment,departmentname)"
                    + " VALUES (?,?)";

            PreparedStatement statement = connect().prepareStatement(sql);
            statement.setInt(1, idDepartment);
            statement.setString(2, departmentName);

            int rows = statement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void assignedCourse(String departmentName, String courseName) {
        try {
            Connection connection = connect();
            String sql2 = "SELECT * FROM department " +
                    "WHERE departmentname=" + "'" + departmentName + "'";
            String sql3 = "SELECT * FROM course " +
                    "WHERE fullname=" + "'" + courseName + "'";


            String sql5 = "INSERT INTO coursedepartment (idcourse,iddepartment)"
                    + " VALUES (?,?)";

            Statement statement1 = connection.createStatement();
            Statement statement2 = connection.createStatement();
            ResultSet result = statement1.executeQuery(sql3);
            ResultSet result1 = statement2.executeQuery(sql2);
            result.first();
            result1.first();
            PreparedStatement statement3 = connection.prepareStatement(sql5);
            statement3.setInt((1), result1.getInt(1));
            statement3.setInt((2), result.getInt(1));
            statement3.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void showAndAssigned(String departmentName) {
        try {
            Connection connection = connect();
            String sql = "SELECT * FROM department" +
                    " INNER JOIN coursedepartment" +
                    " On department.iddepartment=coursedepartment.idcourse" +
                    " WHERE department.departmentname=" + "'" + departmentName + "'";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            System.out.println(result);
            List<Integer> arrList = new ArrayList<Integer>();
            String array = String.valueOf('(');
            while (result.next()) {
                int iddepartment = result.getInt("iddepartment");
                String departmentname = result.getString("departmentname");
                int idcourse = result.getInt("idcourse");
                arrList.add(idcourse);


                System.out.println("Departman id: "+iddepartment + " Departman adı: " + departmentname +" Kurs id: "+ idcourse );
            }

            for (int i = 0; i < arrList.size(); i++) {
                if (i > 0) {
                    array += ",";
                }
                array += arrList.get(i);
            }
            String sql1 = "SELECT * FROM course" +
                    " WHERE course.idcourse in " + array + ")";

            Statement statement1 = connection.createStatement();
            ResultSet result1 = statement1.executeQuery(sql1);


            while (result1.next()) {
                int idcourse = result1.getInt("idcourse");
                String coursename = result1.getString("shortname");
                String fullname = result1.getString("fullname");
                String createddate = result1.getString("createddate");


                System.out.println(idcourse + " " + coursename+" "+fullname+" "+createddate);
            }

            result.first();
            result1.first();


            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
