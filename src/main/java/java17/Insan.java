package java17;

public class Insan {
    int boy;
    int kilo;
    public Insan(int boy,int kilo){
        if (boy>0&&kilo>0)
        this.boy=boy;
        this.kilo=kilo;
        System.out.println("Yeni Bir İnsan Oluştu");

    }
    public Insan(){

    }

    void yemek() {
        kilo++;
    }

}



