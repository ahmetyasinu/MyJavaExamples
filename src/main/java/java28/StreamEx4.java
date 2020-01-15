package java28;

import java18.Game.Player;

import java.util.*;

public class StreamEx4 {
    public static void main(String[] args) {
        List<PlayerReport> players = generateData();
        Map<String, List<PlayerReport>> hm = new HashMap<String, List<PlayerReport>>();
        for (int i = 0; i < players.size(); i++) {
            String key = players.get(i).getName();
            if (hm.containsKey(key)) {
                hm.get(key).add(players.get(i));
            } else {
                List<PlayerReport> playerReports = new ArrayList<>();
                playerReports.add(players.get(i));
                hm.put(key, playerReports);
            }
        }
        //Map dolaşılıyor while iterator ile
        // bir değişken oluşturup toplam geçerli pas sayısı atıcaz
        // o mapin keyine ait value sini dolaşıcaz
        double biggestVPass = 0;
        String biggestVPassPlayer = null;
        double smallestVPass = 0;
        String smallestVPassPlayer = null;
        double bigRatio = 0;
        String bigRatioPlayer = null;
        double smallestPassRatio = 0.0;
        String smallRatioPlayer = null;

        int a = 0;
        int c= 0;


        Iterator<Map.Entry<String, List<PlayerReport>>> it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, List<PlayerReport>> pair = (Map.Entry<String, List<PlayerReport>>) it.next();
            System.out.println("Futbolcu Adı " + pair.getKey());

            double validPass = 0;
            double invalidPass = 0;
            double total = 0;
            double passRatio = 0.0;

            for (int i = 0; i < pair.getValue().size(); i++) {
                validPass = validPass + pair.getValue().get(i).getValidPass();
                invalidPass = invalidPass + pair.getValue().get(i).getInvalidPass();
                total = invalidPass + validPass;
                passRatio = (validPass / total) * 100.0;
            }
            if (bigRatio < passRatio) {
                bigRatio = passRatio;
                bigRatioPlayer = pair.getKey();
                // geçerli pas/toplam*100 yüzdesi
            }
            if (c == 0) {
                smallestPassRatio = passRatio;
                c= 1;
            }
            if (smallestPassRatio > passRatio) {
                smallestPassRatio = passRatio;
                smallRatioPlayer = pair.getKey();
            }


            if (biggestVPass < validPass) {
                biggestVPass = validPass;
                biggestVPassPlayer = pair.getKey();
                // geçerli pas/toplam*100 yüzdesi

            }
            if (a == 0) {
                smallestVPass = validPass;
                a = 1;
            }
            if (smallestVPass > validPass) {
                smallestVPass = validPass;
                smallestVPassPlayer = pair.getKey();
            }


            System.out.print(" Valid Pass " + validPass);
            System.out.print(" Invalid Pass " + invalidPass);
            System.out.print(" Total " + total + "\n");

            Date date = new Date();
            System.out.println(date.toString());
        }


        // long yuzdebig = (biggestVPass/total);
        // long yuzdekig =smallestVPass/total;
        // float k= (biggestVPass/totalVPass)*100;
        //float m =(smallestVPass/totalVPass)*100;


        System.out.println("İsabetli Pası En Çok Olan " + biggestVPassPlayer + " " + biggestVPass);
        System.out.println("İsabetli Pası en az olan " + smallestVPassPlayer + " " + smallestVPass);
        System.out.println("İsabetli Pas yüzdesi en çok olan " + bigRatioPlayer + "  " + bigRatio);
        System.out.println("İsabetli Pas yüzdesi En az olan " + smallRatioPlayer + "  " + smallestPassRatio);




        //geçerli pası en büyük olan oyuncuyu bulalım
        //geçerli pası en küçük olan oyuncuyu bulalım
        //geçerli pas/toplam*100 yüzdesi en büyük ve enküçük olan oyuncuyu bulalım
    }


    public static List<PlayerReport> generateData() {

        List<PlayerReport> players = new ArrayList<>();
        String[] playerNames = new String[]{"Cristiano Ronaldo", "Edinson Cavani",
                "Paulo Dybala", "Luis Suarez", "Mohamed Salah",
                "Paul Pogba", "Dele Alli", "Romelu Lukaku", "Gareth Bale"};

        for (int i = 0; i < 100; i++) {
            int index = (int) (playerNames.length * Math.random());
            long validPass = (long) (Math.random() * 50);
            long invalidPass = (long) (Math.random() * 50);

            players.add(new PlayerReport(playerNames[index], validPass, invalidPass));
        }


        return players;
    }


}


class PlayerReport {

    private String name;
    private long validPass;
    private long invalidPass;
    private long totalPass;

    public PlayerReport(String name, long validPass, long invalidPass) {
        this.name = name;
        this.validPass = validPass;
        this.invalidPass = invalidPass;
    }

    public PlayerReport(String name, long validPass, long invalidPass, long totalPass) {
        this.name = name;
        this.validPass = validPass;
        this.invalidPass = invalidPass;
        this.totalPass = totalPass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getValidPass() {
        return validPass;
    }

    public void setValidPass(long validPass) {
        this.validPass = validPass;
    }

    public long getInvalidPass() {
        return invalidPass;
    }

    public void setInvalidPass(long invalidPass) {
        this.invalidPass = invalidPass;
    }

    public long getTotalPass() {
        return totalPass;
    }

    public void setTotalPass(long totalPass) {
        this.totalPass = totalPass;
    }

    @Override
    public String toString() {
        return "PlayerReport{" +
                "name='" + name + '\'' +
                ", validPass=" + validPass +
                ", invalidPass=" + invalidPass +
                ", totalPass=" + totalPass +
                '}';
    }
}