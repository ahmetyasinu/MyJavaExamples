package java24.Course;

import java14.SilindirOperations;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<Student>();
        List<Course> courses = new ArrayList<Course>();


        boolean quit = false;
        while (!quit) {
            printActions();
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {

                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    students.add(ogrenciEkle());
                    break;
                case 2:
                    courses.add(kursEkle());
                    break;
                case 3:
                    kursAta(courses,students);
                    break;
                case 4:
                    showStudent(students);
                    break;
                case 5:
                    showCourses(courses);
                    break;


            }
        }


    }

    public static void showCourses(List<Course> courses) {
        System.out.println("Kurs List");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(" Kurslar " + (i + 1) +
                    " \nKurs No:" + courses.get(i).getNo() +
                    " \nKurs Adi:" + courses.get(i).getAdi() +
                    " \nKurs Kredi:" + courses.get(i).getKredi() +
                    " \nKurs Saati:" + courses.get(i).getSaat());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void kursAta(List<Course> courses, List<Student> students) {
        final Scanner scanner = new Scanner(System.in);
        Student foundStudent  = null;
        Course foundCourse = null;



            System.out.println("Öğrenci first Adı giriniz");
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getFirstName().equals(scanner.nextLine())) {
                    foundStudent = students.get(i);
                    System.out.println();
                }else {
                    System.out.println("Böyle biri bulunamadı");
                }
            }

//            Optional<Student> optionalStudent = students
//                    .stream()
//                    .filter(entry-> Objects.equals(entry.getFirstName(), scanner.nextLine()))
//                    .findFirst();
//
//            if ( optionalStudent.isPresent() ){
//                foundStudent = optionalStudent.get();
//            }else {
//                System.out.println("Böyle biri bulunamadı");
//                return;
//            }


            System.out.println("Kurs Adı Giriniz");
            for (int i = 0; i < courses.size(); i++) {
                if (courses.get(i).getAdi().equals(scanner.nextLine())) {
                    foundCourse = courses.get(i);

                }else System.out.println("Böyle bir Kurs bulunamadı");
            }

        foundStudent.getCourses().add(foundCourse);
    }

    public static void showStudent(List<Student> students) {
        System.out.println("Student List");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(" Students " + (i + 1) +
                    " \nStudent number:" + students.get(i).getNo() +
                    " \nStudent First Name:" + students.get(i).getFirstName() +
                    " \nStudent Last Name:" + students.get(i).getLastName() +
                    " \nStudent Bölümü:" + students.get(i).getBolumu() +
                    "\n Student Sınıfı" + students.get(i).getSinif());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static Course kursEkle() {
        Course newCourse = new Course();
        System.out.println("Kurs Bilgilerini Giriniz");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kurs No Giriniz");
        newCourse.setNo(scanner.nextInt());
        System.out.println("Kurs Adi Giriniz");
        newCourse.setAdi(scanner.nextLine());
        newCourse.setAdi(scanner.nextLine());
        System.out.println("Kurs Kredisi Giriniz");
        newCourse.setKredi(scanner.nextInt());
        System.out.println("Kurs Saati Giriniz");
        newCourse.setSaat(scanner.nextInt());

        return newCourse;

    }

    public static Student ogrenciEkle() {
        Student newStudent = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  Number: ");
        newStudent.setNo(scanner.nextInt());

        System.out.println("Enter İsim: ");
        newStudent.setFirstName(scanner.nextLine());
        newStudent.setFirstName(scanner.nextLine());


        System.out.println("Enter Soy isim: ");
        newStudent.setLastName(scanner.nextLine());

        System.out.println("Bölümü Giriniz : ");
        newStudent.setBolumu(scanner.nextLine());

        System.out.println("Sınıfı Giriniz");
        newStudent.setSinif(scanner.nextInt());

        return newStudent;
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to add  Student\n" +
                "2  - to add Course \n" +
                "3 - Kurs Ata\n" +
                "4 - Öğrenci Listele\n" +
                "5 - Kursları Listele");
        System.out.println("Choose your action: ");
    }

}
