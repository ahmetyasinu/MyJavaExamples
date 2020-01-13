package java26;

import java23.Room;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> rakam = new LinkedList<Integer>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            printActions();

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    createList(rakam);
                    break;

                case 2:
                    addList(rakam);
                    break;

                case 3:
                    deleteList(rakam);
                    break;
                case 4:
                    showList(rakam);


            }

        }
    }

    public static void createList(LinkedList<Integer> rakam) {
        int e = 0;
        System.out.println("Eleman Sayısı Belirleyin");
        Scanner scanner = new Scanner(System.in);
        e = scanner.nextInt();


        boolean quit = false;
        int z = 0;
        while (!quit) {

            for (int i = 1; i < e + 1; i++) {
                System.out.println("Eleman Giriniz");
                rakam.add(scanner.nextInt());

            }

            quit = true;
        }


    }

    private static void deleteList(LinkedList<Integer> rakam) {
        int b = 0;
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("İndex Giriniz");
        b = scanner.nextInt();


            if (rakam.size() == b) {
                rakam.remove(b);

            } else if (rakam.size() != b) {
                System.out.println("İndex Bulunamadı\n");
                System.out.println("İndex Giriniz");
                b = scanner.nextInt();
                rakam.remove(b);
            }


    }


    private static void addList(LinkedList<Integer> rakam) {
        int a = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("İndex Giriniz");
        a = scanner.nextInt();

        System.out.println("Sayı Giriniz");
        rakam.add(a, scanner.nextInt());

    }

    private static void showList(LinkedList<Integer> rakam) {

        System.out.println(rakam);


    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to Number of elements and elements numbers  \n" +
                "2  - to add new element \n" +
                "3 - to delete a element\n" +
                "4- to show list");
        System.out.println("Choose your action: ");
    }
}
