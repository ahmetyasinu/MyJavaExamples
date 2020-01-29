package java32.service.Impl;

import java32.dao.CourseDao;
import java32.service.CourseService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CourseServiceOperation implements CourseService {
    CourseDao courseDao=new CourseDao();
    @Override
    public void addCourse() {
        int idCourse=0;
        String shortName=null;
        String fullName=null;
        String datee=null;

        System.out.println("Kurs id Giriniz");
        Scanner scan = new Scanner(System.in);
        idCourse = scan.nextInt();
        System.out.println("Kurs Full Name Giriniz");
        Scanner scan2 = new Scanner(System.in);
        fullName=scan2.nextLine();
        System.out.println("Kurs Short Name Giriniz");
        Scanner scan1 = new Scanner(System.in);
        shortName=scan1.nextLine();



        courseDao.addCourse(idCourse,fullName,shortName);




    }

    @Override
    public void showCourse() {

    }
}
