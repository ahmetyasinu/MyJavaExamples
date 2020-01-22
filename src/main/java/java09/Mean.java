package java09;

import java.util.Scanner;

public class Mean {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers,myIntegers);
        printArray(sorted);

    }


    private static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integers Value\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element");
        }

    }

    public static int[] sortIntegers(int[] array, int[] sortedArray) {
        int[] sortIntegers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortIntegers[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i + 1];
                sortedArray[i + 1] = temp;
                flag = true;
            }
        }
        return sortedArray;
    }
}
