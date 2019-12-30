package java01;

import java.util.ArrayList;

public class MainApplication {


    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList();//Creating arraylist


        Student student = new Student();
        student.setId("64654654546");
        student.setFirstname("Ali");
        student.setLastname("kamil");
        student.setGrade1(5.0);
        student.setGrade2(2.0);
        student.setGrade3(3.0);
        list.add(student);



        Student student1 = new Student();
        student1.setId("34325234");
        student1.setFirstname("Ata");
        student1.setLastname("kan");
        student1.setGrade1(35.0);
        student1.setGrade2(11.0);
        student1.setGrade3(30.0);
        list.add(student1);

        Student student2 = new Student();
        student2.setId("34325234");
        student2.setFirstname("elon");
        student2.setLastname("tes");
        student2.setGrade1(37.0);
        student2.setGrade2(23.4);
        student2.setGrade3(55.3);
        list.add(student2);

        Student student3 = new Student();
        student3.setId("34325234");
        student3.setFirstname("Zeynep");
        student3.setLastname("tekan");
        student3.setGrade1(45.6);
        student3.setGrade2(51.0);
        student3.setGrade3(70.0);
        list.add(student3);

        Student student4 = new Student();
        student4.setId("34325234");
        student4.setFirstname("Ata");
        student4.setLastname("kan");
        student4.setGrade1(3.5);
        student4.setGrade2(1.1);
        student4.setGrade3(3.0);
        list.add(student4);

       double sonuc=student.getGrade1()+student.getGrade2()+student.getGrade3();
       sonuc=sonuc/3;
        double sonuc1= student1.getGrade1()+student1.getGrade2()+student1.getGrade3();
        sonuc1=sonuc1/3;
       double sonuc2= student2.getGrade1()+student2.getGrade2()+student2.getGrade3();
        sonuc2=sonuc2/3;
        double sonuc3= student3.getGrade1()+student3.getGrade2()+student3.getGrade3();
        sonuc3=sonuc3/3;
        double sonuc4= student4.getGrade1()+student4.getGrade2()+student4.getGrade3();
        sonuc4=sonuc4/3;


        double[] directory = {sonuc,sonuc1,sonuc2,sonuc3,sonuc4};
    double thebiggest = directory[0];

        for (double number: directory) {
            if (thebiggest < number)
                thebiggest = number;
        }

        System.out.format("Ortalaması en Yüksek Öğrenci = %.2f \n", thebiggest);





    }





}
