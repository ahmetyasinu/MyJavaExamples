package java14;

public class Silindir {
    private double yaricap;
    private double yukseklik;


    public Silindir(double yaricap, double yukseklik) {
        this.yaricap = yaricap;
        this.yukseklik = yukseklik;

    }
    public Silindir() {
        System.out.println("default");
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }


}
