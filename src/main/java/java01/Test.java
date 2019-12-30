package java01;
import java.util.Locale;
import java.util.Scanner;

public class Test  {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       scan.useLocale(Locale.US);
       System.out.println("Bir sayı giriniz");
       String a = scan.nextLine();


        System.out.println("a değişkeninin değeri="+ a);
    }


}
