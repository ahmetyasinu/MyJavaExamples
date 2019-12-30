package java04;

public class Fail {
    public static void main(String[] args) {

      int selim = 85;


        if (selim < 50) {
            System.out.println("Failed");
        } else if (selim >= 50 && selim < 60) {
            System.out.println("D Grade");
        }
        else if (selim >= 60 && selim < 70) {
            System.out.println("c Grade");
        }
        else if (selim >= 70 && selim < 80) {
            System.out.println("b Grade");
        }
        else {
            System.out.println("çöp");
        }

    }
}

