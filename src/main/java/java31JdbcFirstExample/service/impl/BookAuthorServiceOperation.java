package java31JdbcFirstExample.service.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookAuthorServiceOperation {
    public static void main() {
        int first = 0;
        String authorName = null;


        System.out.println("Kitap isbn Giriniz");
        Scanner scan1 = new Scanner(System.in);
        first = scan1.nextInt();
        System.out.println("yazar ismi Giriniz");
        Scanner scan = new Scanner(System.in);
        authorName = scan.nextLine();

        AuthorServiceOperation author = new AuthorServiceOperation();
        try { Connection connection = author.connect();
            String sql = "SELECT * FROM book " +
                    "WHERE isbn=" + first;
            String sql1 = "SELECT * FROM author " +
                    "WHERE firstname=" + "'" + authorName + "'";
            String sql2 = "INSERT INTO bookauthor (isbn, authorid)"
                    + " VALUES (?,?)";
            Statement statement = connection.createStatement();
            Statement statement1 = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            ResultSet result1 = statement1.executeQuery(sql1);

            PreparedStatement statement3 = connection.prepareStatement(sql2);

            while (result.next()) {
                int isbn = result.getInt("isbn");
                String title = result.getString("title");
                String publisher = result.getString("publisher");

                System.out.println(isbn + ":" + title + "" + publisher);
            }
            while (result1.next()) {
                int idauthor = result1.getInt("idauthor");
                String firstname = result1.getString("firstname");
                String lastname = result1.getString("lastname");
                System.out.println(idauthor + ":" + firstname + "" + lastname);
            }
            result.first();
            result1.first();

            statement3.setInt((1), result.getInt(1));
            statement3.setInt((2), result1.getInt(1));
            statement3.executeUpdate();


            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void BetweenList() {
        String authorName = null;
        System.out.println("Tüm kitapları Listelenecek Yazarı Giriniz");
        Scanner scan1 = new Scanner(System.in);
        authorName = scan1.nextLine();
        AuthorServiceOperation author = new AuthorServiceOperation();
        try { Connection connection = author.connect();
           String sql = "SELECT * FROM author " +
            " INNER JOIN bookauthor"+
          " ON author.idauthor=bookauthor.authorid"+
           " WHERE author.firstname= " + "'" + authorName + "'";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            List<Integer> arrList = new ArrayList<Integer>();
            String array = String.valueOf('(');



            while (result.next()) {
                int isbn = result.getInt("isbn");
                int idauthor = result.getInt("idauthor");
                String firstname = result.getString("firstname");
                String lastname = result.getString("lastname");
                int authorid = result.getInt("authorid");
                arrList.add(isbn);
                System.out.println(idauthor
                        + ":" + firstname + " " + lastname+" "+authorid+" "+isbn);
            }
            for (int i =0;i<arrList.size();i++){
            array += arrList.get(i);
            }

            String sql1 = "SELECT * FROM book"+
                    " WHERE book.isbn in " +  array+")";;
            Statement statement1 = connection.createStatement();
            ResultSet result1 = statement1.executeQuery(sql1);
          //  WHERE book.isbn in  " + "'" + "("+arrList+")"+ "'";


            while (result1.next()){
                int isbn = result1.getInt("isbn");
                String title = result1.getString("title");
                String publisher = result1.getString("publisher");
               result1.getInt("isbn");
               result1.getString("title");
               result1.getString("publisher");

                System.out.println(isbn+" "+title+" "+publisher);
            }

            result.first();
            result1.first();

            } catch (Exception e) {
            e.printStackTrace();
        }

    }
}