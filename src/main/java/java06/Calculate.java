package java06;

public class Calculate {

    public static void main(String[] args) {
        int newScore = calculateScore("Teo", 1000);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(1, 12);
        calcFeetAndInchesToCentimeters(400);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player" + playerName + "scored" + score);
        return score * 1000;

    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored" + score);
        return score * 1000;

    }

    public static int calculateScore() {
        System.out.println("No name");
        return 0;

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) && (inches > 12)) {
            System.out.println("kemal");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet" + inches + "inches" + centimeters + "cm");
        return centimeters;


    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + "inches is equal to" + feet+"feet and"+remainingInches+"inches");
        return calcFeetAndInchesToCentimeters(feet,inches);
    }

}
