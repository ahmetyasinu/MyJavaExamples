package java10;

import java.util.Scanner;

public class Ort {
    public static float ortalama(int[] a) {
        int[] part = new int[6];


        for (int i = 0; i < 6; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Aray Giriniz:");
            part[i] = scan.nextInt();
        }
        float toplam = 0;
        for (int i = 0; i < a.length; i++) {
            toplam = toplam + a[i];
        }
        return toplam / a.length;
    }

    public static void main(String[] args) {
        int[] dersNotlarim = {75, 90, 40};
        float ortalamam = ortalama(dersNotlarim);
        System.out.println("Ortalamam: " + ortalamam);
    }
}
