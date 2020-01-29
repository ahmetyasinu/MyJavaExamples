package java32;

import java32.service.Impl.CourseServiceOperation;
import java32.service.Impl.DepartmentServiceOperation;
import java32.service.Impl.StudentServiceOperation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentServiceOperation operation = new StudentServiceOperation();
        CourseServiceOperation operation1= new CourseServiceOperation();
        DepartmentServiceOperation operation2= new DepartmentServiceOperation();


        boolean quit = false;
        while (!quit) {
            printAction();
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {

                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    operation.addStudentassignedDepartment();
                    break;
                case 2:
                    operation1.addCourse();
                    break;
                case 3:
                    operation2.addDepartment();
                    break;
                case 4:
                    operation2.departmentAssignedCourse();
                    break;
                case 5:
                    operation2.showAndAssigned();
                    break;
                case 6 :
                    operation.assignedStudentCourse();
                    break;
                case 7 :
                    operation.showInformation();
                    break;

            }
        }
    }

    private static void printAction() {
        System.out.println("Öğelerden İstediğinizi Seçmek Numara Giriniz\n 1-Öğrenci Ekleme ve Departman Atama\n2-Kurs Ekleme\n3-Departman Ekle\n4-Departmana Kurs Ekleme\n5-Bölüm Bilgileri ve Bölüme Ait Kursları Listele\n6-Öğrenciye Ders Ata\n7-Öğrenci Bilgileri ve Aldığı Dersler");

    }
}
