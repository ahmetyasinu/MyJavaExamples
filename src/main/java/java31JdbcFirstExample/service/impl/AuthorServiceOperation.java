package java31JdbcFirstExample.service.impl;

import java31JdbcFirstExample.service.AuthorService;

import java.sql.*;
import java.util.Scanner;

public class AuthorServiceOperation implements AuthorService {

//kitap adı verisini bul , yazar adı verisini bul ekleme işlemi yap

    public Connection connect() {
        // SQLite connection string
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

    @Override
    public void addAuthor() {


        int idauthor = 0;
        String firstName = null;
        String lastName = null;


        System.out.println("Yazar id Giriniz");
        Scanner scan = new Scanner(System.in);
        idauthor = scan.nextInt();
        System.out.println("Yazar Adı Giriniz");
        Scanner scan1 = new Scanner(System.in);
        firstName = scan1.nextLine();
        System.out.println("Yazar Soyadı Giriniz");
        Scanner scan2 = new Scanner(System.in);
        lastName = scan2.nextLine();

        try {Connection connection = this.connect();
            String sql = "INSERT INTO author (idauthor, firstName, lastName)"
                    + " VALUES (?,?,?)";

            PreparedStatement statement = connect().prepareStatement(sql);
            statement.setInt(1, idauthor);
            statement.setString(2, firstName);
            statement.setString(3, lastName);
            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("A new author was inserted successfully!");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateAuthor() {

        int idAuthorD = 0;
        String firstName = null;
        String lastName = null;




        System.out.println("Değiştirilecek Yazar id Giriniz");
        Scanner scan = new Scanner(System.in);
        idAuthorD = scan.nextInt();
        System.out.println("Yeni Yazar Adı Giriniz");
        Scanner scan1 = new Scanner(System.in);
        firstName = scan1.nextLine();
        System.out.println(" Yeni Yazar Soyadı Giriniz");
        Scanner scan2 = new Scanner(System.in);
        lastName = scan2.nextLine();

        try { Connection connection = this.connect();
            String sql = "UPDATE author SET firstname = " +"'"+firstName+"'"+ ","+ " lastname="+"'"+lastName+"'"+
                    " WHERE idauthor = "+idAuthorD;
            PreparedStatement statement = connection.prepareStatement(sql);{}

                int rows = statement.executeUpdate(sql);

                if (rows > 0) {
                    System.out.println("Update this data");
                }
                connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAuthor() {
        int idAuthorD=0;

        System.out.println("Silinecek Yazar id Giriniz");
        Scanner scan = new Scanner(System.in);
        idAuthorD = scan.nextInt();

        try {Connection connection = this.connect();
            String sql = "DELETE FROM author WHERE idauthor ="+idAuthorD;
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("A  user was deleted successfully!");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showAuthor() {


        try {Connection connection = this.connect();
            String sql = "SELECT * FROM author";
            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                int idauthor = result.getInt("idauthor");
                String firstname = result.getString("firstname");
                String lastname = result.getString("lastname");
                System.out.println(idauthor + ":" + firstname + " " + lastname);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
