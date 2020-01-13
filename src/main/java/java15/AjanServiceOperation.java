package java15;

import java.util.Scanner;

public class AjanServiceOperation implements AjanService {




    public Ajan createAjan() {
        //int performansArttir = 0;
        Ajan newAjan = new Ajan();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter new Ajan name: ");
        newAjan.setAd(scanner.nextLine());

        System.out.println("Enter takma ad giriniz: ");
        newAjan.setTakmaAd(scanner.nextLine());

        System.out.println("Enter performans giriniz: ");
        newAjan.setPerformans(scanner.nextInt());

        System.out.println("Enter seviye giriniz: ");
        newAjan.setSeviye(scanner.nextInt());

        System.out.println("Enter giriş yılı giriniz: ");
        newAjan.setGirisYili(scanner.nextInt());

        System.out.println("Enter Görev Sayısı giriniz: ");
        newAjan.setGorevSayisi(scanner.nextInt());

        return newAjan;
    }
}

