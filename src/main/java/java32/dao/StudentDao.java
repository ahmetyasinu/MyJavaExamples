package java32.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java31JdbcFirstExample.utils.JdbcUtils.connect;

public class StudentDao {
    public void addStudent(int idStudent,String fullName,String courseName,String department ,String birthday ,String email){
        try {
            Connection connection = connect();
            String sql = "INSERT INTO student (idstudent,fullname,coursename,department,birthdaydate,email)"
                    + " VALUES (?,?,?,?,?,?)";

            PreparedStatement statement = connect().prepareStatement(sql);
            statement.setInt(1, idStudent);
            statement.setString(2, fullName);
            statement.setString(3, courseName);
            statement.setString(4, department);
            statement.setString(5, birthday);
            statement.setString(6,email);
            int rows = statement.executeUpdate();

            String sql2 = "SELECT * FROM student " +
                    "WHERE idstudent=" + idStudent;
            String sql3 = "SELECT * FROM department " +
                    "WHERE departmentname=" + "'" + department + "'";


            String sql5 = "INSERT INTO studentdepartment (idstudent,iddepartment)"
                    + " VALUES (?,?)";

            Statement statement1 = connection.createStatement();
            Statement statement2 = connection.createStatement();
            ResultSet result = statement1.executeQuery(sql2);
            ResultSet result1 = statement2.executeQuery(sql3);
            result.first();
            result1.first();
            PreparedStatement statement3 = connection.prepareStatement(sql5);
            statement3.setInt((1), result.getInt(1));
            statement3.setInt((2), result1.getInt(1));
            statement3.executeUpdate();








            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void assignedCourse(int studentId,String courseName){
        try {Connection connection=connect();
            String sql2 = "SELECT * FROM student " +
                    "WHERE idstudent=" + studentId;
            String sql3 = "SELECT * FROM course " +
                    "WHERE fullname=" + "'" + courseName + "'";


            String sql5 = "INSERT INTO studentcourse (idstudent,idcourse)"
                    + " VALUES (?,?)";

            Statement statement1 = connection.createStatement();
            Statement statement2 = connection.createStatement();
            ResultSet result = statement1.executeQuery(sql2);
            ResultSet result1 = statement2.executeQuery(sql3);
            result.first();
            result1.first();
            PreparedStatement statement3 = connection.prepareStatement(sql5);
            statement3.setInt((1), result.getInt(1));
            statement3.setInt((2), result1.getInt(1));
            statement3.executeUpdate();

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void showInformationAndAssigned(int studentId){
        try {Connection connection=connect();

            String sql = "SELECT * FROM student" +
                    " INNER JOIN studentcourse" +
                    " On student.idstudent = studentcourse.idstudent" +
                    " WHERE student.idstudent=" + "'" + studentId + "'";

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            List<Integer> arrList = new ArrayList<Integer>();
            String array = String.valueOf('(');
            int idStudent=0;
            String fullName=null;
            String courseName=null;
            String department=null;
            String birtdayDate=null;
            String email=null;


            while (result.next()) {
                idStudent = result.getInt("idstudent");
                fullName = result.getString("fullname");
                courseName = result.getString("coursename");
                department = result.getString("department");
                birtdayDate = result.getString("birthdaydate");
                email = result.getString("email");
                int idcourse = result.getInt("idcourse");
                arrList.add(idcourse);

            }                System.out.println("Student id: "+idStudent + " Course adı: " +fullName +" Course short name: "+courseName+"Departman Adı"+department+"Doğum Tarihi"+birtdayDate+"Email"+email );


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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
