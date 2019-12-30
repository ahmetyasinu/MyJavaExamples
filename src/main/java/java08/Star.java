package java08;

public class Star {
    public static void main(String[] args) {
        kare(4);
        System.out.println();
        ucgen(4);

    }

    public static void kare(int a) {
        for (int i =0 ;i<a;i++){
            for (int j = 0; j <a ; j++) {
                System.out.printf("*");

            }
            System.out.printf("\n");
        }
    }

    public static void ucgen(int a) {
        for (int i =0 ;i<a;i++){
            for (int j = i; j <a ; j++) {
                System.out.printf("*");

            }
            System.out.printf("\n");
        }

    }
}
