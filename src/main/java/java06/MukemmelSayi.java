package java06;
import javax.swing.JOptionPane;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
public class MukemmelSayi{

    public static void main(String[] args) {
        int sayi = Integer.parseInt(JOptionPane.showInputDialog("Bir Sayı Giriniz")); // Ekrana mesaj kutusu ile değer alalım
        int toplam=0;
        for (int i = 1; i <= sayi/2; i++) { // Döngü 1 den başla, sayının yarısına kadar döngüyü çalıştır
            if (sayi % i ==0) {// Sayının i'inci sayı ile modu 0 ise
                toplam+=i;//toplam değişkenine i değerini at
            }
        }
        if (sayi==toplam) {// eğer girilen sayı döngüdeki bölümlerin toplamına eşitse
            System.out.println(sayi+" Mükemmel Sayıdır");
        }
        else // Değilse
            System.out.println(sayi+" Mükemmel Sayı Değildir");
    }


}
