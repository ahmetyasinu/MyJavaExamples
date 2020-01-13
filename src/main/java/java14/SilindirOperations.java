package java14;

import static java.lang.Math.*;

public class SilindirOperations implements SilindirService {


    public double tabanAlani(double yaricap) {

        return PI * yaricap * yaricap;
    }


    public double hacimHesapla(double tabanAlani, double yukseklik) {

        return tabanAlani * yukseklik;
    }
}
