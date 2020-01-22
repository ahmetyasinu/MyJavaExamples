package java12;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] notes = new int[5][3];

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". öğrencinin notları: ");
            Scanner scanner = new Scanner(System.in);
            notes[i - 1][0] = scanner.nextInt();
            notes[i - 1][1] = scanner.nextInt();
            notes[i - 1][2] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i+". öğrencinin kaldığı ders sayısı: "+ isPassed(notes[i]));
        }

    }

    public static int isPassed(int[] array) {
        int counter = 0;
        int mean = (array[0] + array[1] + array[2]) / 3;

        for (int i = 0; i < 3; i++) {
            if (array[i] <= 40)
                counter += 1;
            else if (array[i] >= 41 && array[i] <= 59) {
                if (mean < 60)
                    counter += 1;
            }
        }
        return counter;
    }


}
