package java17;

public class Main {
    public static void main(String[] args) {
        Insan ali = new Insan();
        Muhendis veli = new Muhendis(20000,180,80);


        veli.boy=180;
        System.out.println(veli.boy);
        veli.kilo=90;
        veli.yemek();
        System.out.println(veli.kilo);
        veli.maas=10000;
        veli.zam((float)0.50);
        System.out.println(veli.maas);
        ali.kilo=80;
        ali.yemek();
        System.out.println(ali.kilo);
    }
}
