package java23;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Room> rooms = new ArrayList<Room>();
        Room room = new Room();

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
                    rooms.add(room.reservation());
                    break;

                case 2:
                    printContacts(rooms);
                    break;

                case 3:
                   total(rooms);
                    break;

            }

        }
    }
    public static void printContacts(List<Room> rooms) {
        System.out.println("Reservation List");
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(" Reservation " + (i + 1) +
                    " \nRoom number:" + rooms.get(i).getRoomNo() +
                    " \nRoom price:" + rooms.get(i).getRoomPrice() +
                    " \nRoom Flor:" +  rooms.get(i).getRoomFlor() +
                    " \nRoom Total:"+ rooms.get(i).getRoomDeLux());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to add new reservation\n" +
                "2  - to show reservation \n" +
                "3 - to total Price");
        System.out.println("Choose your action: ");
    }
    private static void total(List<Room> rooms){
        int best = 0;
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getRoomDeLux()> 1) {
                best= rooms.get(i).getRoomPrice()*rooms.get(i).getRoomDeLux();
                System.out.println(best);
            }
            else { best = rooms.get(i).getRoomPrice();
                System.out.println(best);

            }
        }

    }
}
