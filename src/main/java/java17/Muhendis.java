package java17;

public class Muhendis extends Insan {
    int maas;
    public Muhendis(int maas){
       if(maas<0){
           this.maas=maas;
       }else {
           this.maas=7000;
       }
    }
    public Muhendis(int maas,int boy,int kilo){
        super(boy,kilo);
    }
    int zam(){
        maas++;
        return maas;
    }
    int zam(int zamMiktarı){
        maas+=zamMiktarı;
        return maas;
    }
    int zam(float zamOrani){
        maas*=(1+zamOrani);
        return maas;

    }
    void yemek(){
        kilo = kilo+2;


    }
}
