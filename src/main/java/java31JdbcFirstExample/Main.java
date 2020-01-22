package java31JdbcFirstExample;

import java31JdbcFirstExample.service.impl.AuthorServiceOperation;
import java31JdbcFirstExample.service.impl.BookAuthorServiceOperation;
import java31JdbcFirstExample.service.impl.BookServiceOperation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthorServiceOperation operation = new AuthorServiceOperation();
        BookServiceOperation operation1 = new BookServiceOperation();
        BookAuthorServiceOperation operation2 = new BookAuthorServiceOperation();

        boolean quit = false;
        while (!quit) {
            printAction();
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {

                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    operation.addAuthor();
                    break;
                case 2:
                    operation.updateAuthor();
                    break;
                case 3:
                    operation.deleteAuthor();
                    break;
                case 4:
                    operation.showAuthor();
                    break;
                case 5:
                    operation1.addBook();
                    break;
                case 6:
                    operation1.updateBook();
                    break;
                case 7:
                    operation1.deleteBook();
                    break;
                case 8:
                    operation1.showBook();
                    break;
                case 9:
                    operation2.main();
                    break;
                case 10:
                    operation2.BetweenList();
                    break;


            }
        }


    }

    private static void printAction() {
        System.out.println("Yazar eklemek için 1 e basınız\nYazar güncellemek için 2 ye basınız\nYazar silmek için 3 e basınız\nYazar listelemek için 4 e basınız\nKitap eklemek için 5 e basınız\nkitap güncelle için 6 ya basınız\nkitap sil için 7 y basınız\nkitap listelemek için 8 e basınız:\nkitap isbn ve yazar id i ilişkilendirmek için 9 a basınız\nYazarın Kitaplarını inner ile Listele 10");

    }
}

