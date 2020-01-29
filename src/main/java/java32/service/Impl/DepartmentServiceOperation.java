package java32.service.Impl;

import java32.dao.DepartmentDao;
import java32.service.DepartmentService;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.awt.*;
import java.util.Scanner;

public class DepartmentServiceOperation implements DepartmentService {
    DepartmentDao departmantDao = new DepartmentDao();

    @Override
    public void addDepartment() {
        int idDepartment = 0;
        String departmentName = null;


        System.out.println("Departman id Giriniz");
        Scanner scan = new Scanner(System.in);
        idDepartment = scan.nextInt();
        System.out.println("Kurs Full Name Giriniz");
        Scanner scan2 = new Scanner(System.in);
        departmentName = scan2.nextLine();
        departmantDao.addDepartment(idDepartment, departmentName);


    }

    @Override
    public void departmentAssignedCourse() {
        String departmentName = null;
        String courseName = null;
        String other = null;
        String gal = "Evet";

        System.out.println("Departman Adı Giriniz");
        Scanner scan = new Scanner(System.in);
        departmentName = scan.nextLine();
        System.out.println("Course Adı Giriniz");
        Scanner scan1 = new Scanner(System.in);
        courseName = scan1.nextLine();
        System.out.println("Eklemek İstediğine Eminsin(Evet/Hayır)");
        Scanner scan2 = new Scanner(System.in);
        other = scan2.nextLine();
        if (other.equals(gal)) {

            departmantDao.assignedCourse(departmentName, courseName);

        }
    }

    public void showAndAssigned() {
        String courseName=null;
        System.out.println("Bölüm bilgileri ve bölüme ait kurslar için Bölüm ismi giriniz");
        Scanner scan= new Scanner(System.in);
        courseName=scan.nextLine();
        departmantDao.showAndAssigned(courseName);


    }
}
