package java09;

import java.util.Scanner;

public class Array {
    public static void mean(int[] arr1) {
        int total=0;
        for (int i=0;i<arr1.length;i++){
            total+=arr1[i];
        }
        System.out.println("ortalama"+total/arr1.length);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 6};
        int[] arr2 = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Aray Giriniz");
        for (int i =0; i< arr2.length; i++) {
        arr2[i]=scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {

            System.out.println("Eleman" + arr2[i]);
        }

        for (int i = 0; i < 5; i++) {

            System.out.println("Eleman" + arr1[i]);
        }
        mean(arr2);
        mean(arr1);

    }
}
