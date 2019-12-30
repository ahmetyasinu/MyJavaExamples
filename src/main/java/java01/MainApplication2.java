package java01;

import java.util.ArrayList;
import java.util.UUID;
import java.lang.Double;


public class MainApplication2 {


    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();//Creating arraylist


        Student student = new Student();
        student.setId(UUID.randomUUID().toString());
        student.setFirstname("Ali");
        student.setLastname("kamil");
        student.setGrade1(5.0);
        student.setGrade2(2.0);
        student.setGrade3(3.0);

        list.add(student);


        Student student1 = new Student();
        student1.setId(UUID.randomUUID().toString());
        student1.setFirstname("Ata");
        student1.setLastname("kan");
        student1.setGrade1(35.0);
        student1.setGrade2(11.0);
        student1.setGrade3(30.0);
        list.add(student1);

        Student student2 = new Student();
        student2.setId(UUID.randomUUID().toString());
        student2.setFirstname("elon");
        student2.setLastname("tes");
        student2.setGrade1(37.0);
        student2.setGrade2(23.4);
        student2.setGrade3(55.3);
        list.add(student2);

        Student student3 = new Student();
        student3.setId(UUID.randomUUID().toString());
        student3.setFirstname("Zeynep");
        student3.setLastname("tekan");
        student3.setGrade1(45.6);
        student3.setGrade2(51.0);
        student3.setGrade3(70.0);
        list.add(student3);

        Student student4 = new Student();
        student4.setId(UUID.randomUUID().toString());
        student4.setFirstname("Ata");
        student4.setLastname("kan");
        student4.setGrade1(3.5);
        student4.setGrade2(1.1);
        student4.setGrade3(3.0);
        list.add(student4);

        double enbuyuk = 0.0;

        Student s = null;

        for (int i = 0; i < list.size(); i++) {
            double sonuc = list.get(i).getGrade1() + list.get(i).getGrade2() + list.get(i).getGrade3();

            int result = Double.compare(enbuyuk, sonuc);
            //en buyuk sonuctan kucukse
            if (result < 0) {
                enbuyuk = sonuc;
                s = list.get(i);
            }
        }


        if (s != null) {
            System.out.println(s.toString());
        }

        System.out.println(enbuyuk);


    }

}




