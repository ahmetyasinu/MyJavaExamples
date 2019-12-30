package java05;

import java01.Student;
import java04.Switch;

import java.util.Scanner;

public class Salary02App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Brüt Aylık Gelirinizi giriniz:\n");

        int salary = scan.nextInt();
        if (salary < 0) {
            System.out.println("- Değer Girilemez");
            return;
        }
        SalaryInfo x = calculateSalary(salary);
        System.out.println(x.toString());

    }

    public static SalaryInfo calculateSalary(int a) {
        double v = 0;

        if ((a > 0) && (a <= 10700)) {
            v = a * 0.15;
        } else if ((a > 10700) && (a <= 26000)) {
            v = 1605 + (a - 10700) * 0.20;
        } else if ((a > 26000) && (a <= 94000)) {
            v = 4665 + (a - 26000) * 0.27;
        } else {
            v = a * 0.35;
        }


        SalaryInfo salaryInfo = new SalaryInfo();
        salaryInfo.setAnnualSalary(a*12);
        salaryInfo.setNeedToPayAnnualTax(v*12);
        salaryInfo.setTaxCutSalary(v);
        salaryInfo.setTaxHaveToPay(a-v);

        return salaryInfo;
    }

}
