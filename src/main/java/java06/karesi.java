package java06;// Arda Mavi - ardamavi.com

import java.util.Scanner;

public class karesi {

    public static void main(String[] args) {

        System.out.print("Bir sayı giriniz : ");

        Scanner scn = new Scanner(System.in);

        int sayi = scn.nextInt();

        while (sayi > 0){

            sayi = sayi/10;

        }

    }
}
