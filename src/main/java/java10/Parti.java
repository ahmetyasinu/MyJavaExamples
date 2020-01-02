package java10;

import java.util.Scanner;

public class Parti {

    public static void main(String[] args) {

        int[] part = new int[6];

        for (int i = 1; i < part.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println(i + " Partisinin Oy sayısı Giriniz:");
            part[i] = scan.nextInt();
        }
        int toplam = toplamBul(part);
        mean(toplam, part);
    }

    public static int toplamBul(int[] a) {
        int toplam = 0;
        for (int i = 1; i < a.length; i++) {
            toplam = toplam + a[i];
        }
        return toplam;

    }

    public static void mean(int toplam, int[] part) {
        for (int i = 1; i < part.length; i++) {
            double ortalama = (double) part[i] * 100.0 / (double)toplam;
            System.out.println(i + " nolu parti oy sayısı= " + part[i] + " Oy oranı ½ = " + ortalama);

        }

    }
}

