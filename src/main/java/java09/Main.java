package java09;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int hafifSikletSayisi = 0;
        int ortaSikletSayisi = 0;
        int agirSikletSayisi = 0;
        int toplam = 0;
        int toplamGirilen = 1;
        int girilenDeger = 1;


        while (true) {
            System.out.println("Kilonuzu giriniz:");
            Scanner scan = new Scanner(System.in);
            girilenDeger = scan.nextInt();

            if (girilenDeger < 0) {
                System.out.println("Negatif sayı girmeyiniz!");
                continue;
            }

            if (girilenDeger == 0) {
                break;
            }

            if (girilenDeger < 50) {
                hafifSikletSayisi++;
            } else if (girilenDeger >= 50 && girilenDeger < 70) {
                ortaSikletSayisi++;
            } else {
                agirSikletSayisi++;
            }

            toplamGirilen++;
            toplam = toplam + girilenDeger;
            toplamGirilen = hafifSikletSayisi + ortaSikletSayisi + agirSikletSayisi;
        }



        System.out.println("hafif siklet" + hafifSikletSayisi);
        System.out.println("ortaSiklet" + ortaSikletSayisi);
        System.out.println("agirSiklet" + agirSikletSayisi);
        System.out.println("toplam sportmen sayısı" + toplamGirilen);
        System.out.println("toplam" + toplam);
    }


}