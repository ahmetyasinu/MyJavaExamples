package java31JdbcFirstExample.service.impl;

import java31JdbcFirstExample.service.BookService;
import java31JdbcFirstExample.service.impl.AuthorServiceOperation;

import java.sql.*;
import java.util.Scanner;

public class BookServiceOperation implements BookService {
    @Override
    public void addBook() {
        AuthorServiceOperation author = new AuthorServiceOperation();
        int idauthor = 0;
        String firstName = null;
        String lastName = null;


        System.out.println("Kitap isbn Giriniz");
        Scanner scan = new Scanner(System.in);
        idauthor = scan.nextInt();
        System.out.println("Kitap Title Giriniz");
        Scanner scan1 = new Scanner(System.in);
        firstName = scan1.nextLine();
        System.out.println("Kitap yayınevi");
        Scanner scan2 = new Scanner(System.in);
        lastName = scan2.nextLine();

        try {Connection connection=author.connect();

            String sql = "INSERT INTO book (isbn, title, publisher)"
                    + " VALUES (?,?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idauthor);
            statement.setString(2, firstName);
            statement.setString(3, lastName);
            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("A new book was inserted successfully!");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateBook() {
        AuthorServiceOperation author = new AuthorServiceOperation();

        int idAuthorD = 0;
        String firstName = null;
        String lastName = null;


        System.out.println("Değiştirilecek Kitap isbn Giriniz");
        Scanner scan = new Scanner(System.in);
        idAuthorD = scan.nextInt();
        System.out.println("Yeni Kitap title Giriniz");
        Scanner scan1 = new Scanner(System.in);
        firstName = scan1.nextLine();
        System.out.println("Yeni kitap yayınevi giriniz");
        Scanner scan2 = new Scanner(System.in);
        lastName = scan2.nextLine();

        try {
            Connection connection = author.connect();
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

    @Override
    public void deleteBook() {
        AuthorServiceOperation author = new AuthorServiceOperation();

        int idAuthorD = 0;

        System.out.println("Silinecek Kitap isbn Giriniz");
        Scanner scan = new Scanner(System.in);
        idAuthorD = scan.nextInt();

        try {
            Connection connection=author.connect();
            String sql = "DELETE FROM book WHERE isbn =" + idAuthorD;
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
    public void showBook() {
        AuthorServiceOperation author = new AuthorServiceOperation();

        try {
            Connection connection = author.connect();
            String sql = "SELECT * FROM book";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                int isbn = result.getInt("isbn");
                String title = result.getString("title");
                String publisher = result.getString("publisher");
                System.out.println(isbn + ":" + title + " " + publisher);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

