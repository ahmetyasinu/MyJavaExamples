package java15;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Ajan> ajans = new ArrayList<Ajan>();
        AjanServiceOperation operation = new AjanServiceOperation();

        boolean quit = false;
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (4 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    ajans.add(operation.createAjan());
                    break;

                case 2:
                    printContacts(ajans);
                    break;

                case 3:
                    bestAjan(ajans);
                    break;

                case 4:
                    theMostExperienceAjan(ajans);
                    break;


            }

        }
    }


    public static void bestAjan(List<Ajan> ajans) {
        System.out.println("Best ajan is ");
        int best = 0;
        for (int i = 0; i < ajans.size(); i++) {
            if (ajans.get(i).getSeviye() > ajans.get(best).getSeviye()) {
                best = i;
            }
        }
        System.out.println(ajans.get(best).toString());
    }

    public static void theMostExperienceAjan(List<Ajan> ajans) {
        System.out.println("En tecrübeli ajan ");
        int experienced = 0;
        for (int i = 0; i < ajans.size(); i++) {
            if (ajans.get(i).getGirisYili() < ajans.get(experienced).getGirisYili()) {
                experienced = i;
            }else if(ajans.get(i).getGirisYili() == ajans.get(experienced).getGirisYili()) {
                if(ajans.get(i).getGorevSayisi() > ajans.get(experienced).getGorevSayisi()) {
                    experienced = i;
                }
            }
        }
        System.out.println(ajans.get(experienced).toString());
    }

    public static void printContacts(List<Ajan> ajans) {
        System.out.println("Contact List");
        for (int i = 0; i < ajans.size(); i++) {
            System.out.println((i + 1) + "." +
                    ajans.get(i).getAd() + " -> " +
                    ajans.get(i).getTakmaAd() + " -> " +
                    ajans.get(i).getPerformans() + " -> " +
                    ajans.get(i).getSeviye() + " -> " +
                    ajans.get(i).getGirisYili() + " -> " +
                    ajans.get(i).getGorevSayisi());
        }

    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to add new ajan\n" +
                "2  - to show a ajan \n" +
                "3  - to show best ajan\n" +
                "4  - to the most experienced ajan\n");
        System.out.println("Choose your action: ");
    }


}



