package java32.service.Impl;

import java31JdbcFirstExample.dao.AuthorDao;
import java32.dao.StudentDao;
import java32.service.StudentService;

import java.util.Date;
import java.util.Scanner;

public class StudentServiceOperation implements StudentService {
StudentDao operation = new StudentDao();

    @Override
    public void addStudentassignedDepartment() {
        int idStudent = 0;
        String fullName = null;
        String courseName = null;
        String department = null;
        String birtday=null;
        String email = null;


        System.out.println("Öğrenci No Giriniz");
        Scanner scan = new Scanner(System.in);
        idStudent = scan.nextInt();
        System.out.println("Öğrenci Adı Soyadı Giriniz");
        Scanner scan1 = new Scanner(System.in);
        fullName = scan1.nextLine();
        System.out.println("Kurs Adı Giriniz");
        Scanner scan2 = new Scanner(System.in);
        courseName = scan2.nextLine();
        System.out.println("Departman Adı Giriniz");
        Scanner scan3 = new Scanner(System.in);
        department = scan3.nextLine();
        System.out.println("Doğum Tarihi Giriniz");
        Scanner scan5 = new Scanner(System.in);
        birtday = scan5.nextLine();
        System.out.println("Email Giriniz");
        Scanner scan4 = new Scanner(System.in);
        email = scan4.nextLine();
        operation.addStudent(idStudent,fullName,courseName,department,birtday,email);


    }

    @Override
    public void assignedStudentCourse() {
        int studentId=0;
        String courseName=null;
        System.out.println("Ders atamak istediğiniz Öğrenci no giriniz");
        Scanner scan = new Scanner(System.in);
        studentId=scan.nextInt();
        System.out.println("Atamak istediğiniz ders adı giriniz");
        Scanner scan1= new Scanner(System.in);
        courseName=scan1.nextLine();
        operation.assignedCourse(studentId,courseName);


    }

    @Override
    public void showInformation() {
        int studentId=0;
        String courseName=null;
        System.out.println("Öğrenci bilgileri ve Aldığı dersler için Öğrenci no giriniz");
        Scanner scan = new Scanner(System.in);
        studentId=scan.nextInt();
        operation.showInformationAndAssigned(studentId);
    }
}
