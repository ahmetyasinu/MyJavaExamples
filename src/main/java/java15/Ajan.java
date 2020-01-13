package java15;

public class Ajan {
    private String ad;
    private String takmaAd;

    private int performans;
    private int seviye;
    private int girisYili;
    private int gorevSayisi;

    public Ajan() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTakmaAd() {
        return takmaAd;
    }

    public void setTakmaAd(String takmaAd) {
        this.takmaAd = takmaAd;
    }



    public int getPerformans() {
        return performans;
    }

    public void setPerformans(int performans) {
        this.performans = performans;
    }

    public int getSeviye() {
        return seviye;
    }

    public void setSeviye(int seviye) {
        this.seviye = seviye;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public int getGorevSayisi() {
        return gorevSayisi;
    }

    public void setGorevSayisi(int gorevSayisi) {
        this.gorevSayisi = gorevSayisi;
    }

    @Override
    public String toString() {
        return "" +
                "ad='" + ad + '\'' +
                ", takmaAd='" + takmaAd + '\'' +

                ", performans=" + performans +
                ", seviye=" + seviye +
                ", girisYili=" + girisYili +
                ", gorevSayisi=" + gorevSayisi + "";
    }
}
