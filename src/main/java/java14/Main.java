package java14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double toplamGirilen = 1;
        double girilenDeger = 1;
        SilindirOperations silindirOperations = new SilindirOperations();

        while (true) {
            System.out.println("yükseklik ");
            Scanner scan = new Scanner(System.in);
            girilenDeger = scan.nextDouble();
            System.out.println("yari çap ");
            Scanner scan1 = new Scanner(System.in);
            toplamGirilen = scan1.nextDouble();

            if (girilenDeger < 0) {
                System.out.println("Negatif sayı girmeyiniz!");
                continue;
            }

            if (girilenDeger == 0) {
                break;
            }

            Silindir silindir = new Silindir(girilenDeger, toplamGirilen);
            double tabanAlani = silindirOperations.tabanAlani(silindir.getYaricap());
            double hacimHesapla = silindirOperations.hacimHesapla(tabanAlani, silindir.getYukseklik());
            System.out.println(tabanAlani);
            System.out.println(hacimHesapla);
        }
    }
}