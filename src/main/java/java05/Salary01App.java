package java05;
import java.util.Scanner;

public class Salary01App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Brüt Aylık Gelirinizi giriniz:\n");
        int a = scan.nextInt();
        double v = 0;



        if ((a<0)){
            System.out.println("- Değer Girilemez");
            return;
        }else if ((a > 0)&&(a <= 10700)) {
            v = a * 0.15;
        } else if ((a > 10700) && (a <= 26000)) {
            v = 1605 + (a - 10700) * 0.20;
        }
        else if ((a > 26000)&&(a <= 94000) ) {
            v = 4665 + (a - 26000) * 0.27;
        } else{
            v = a*0.35;

        }
        System.out.println("Yıllık Geliriniz: "+ a*12 );
        System.out.println("Odemeniz gereken toplam vergi: " + v*12);
        System.out.println("her ay ödemenizden kesilecek vergi: " + v);
        System.out.println("Vergisi kesilmiş net maaşınız: " + (a-v));


    }


}




