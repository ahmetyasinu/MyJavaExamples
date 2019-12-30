package java08;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int num = 2019;
        digit(49);
        digit(145);
    }

    public static void digit(int n) {
        while (n % 10 != n) {
            n = square(unroll(n));
        }
        if (n == 1) {
            System.out.println("Mutludur");

        } else {
            System.out.println("Mutsuz");
        }
        }

        public static int square (List < Integer > digits) {
            int retVal = 0;
            for (int num : digits) {
                retVal += num * num;
            }
            return retVal;
        }

        public static List<Integer> unroll ( int n){
            List<Integer> digits = new ArrayList<Integer>();
            while (n % 10 != n) {
                digits.add(n % 10);
                n /= 10;
            }
            digits.add(n);
            return digits;

        }
    }
