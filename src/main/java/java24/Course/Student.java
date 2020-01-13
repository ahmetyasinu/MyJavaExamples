package java24.Course;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int no;
    private String firstName;
    private String lastName;
    private String bolumu;
    private int sinif;
    private List<Course> courses = new ArrayList<Course>();

    public Student(){
    }

    public Student(int no, String firstName, String lastName, String bolumu, int sinif) {
        this.no = no;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bolumu = bolumu;
        this.sinif = sinif;
    }


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBolumu() {
        return bolumu;
    }

    public void setBolumu(String bolumu) {
        this.bolumu = bolumu;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bolumu='" + bolumu + '\'' +
                ", sinif=" + sinif +
                ", courses=" + courses +
                '}';
    }
}
class Course{
    private int no;
    private String adi;
    private int kredi;
    private int saat;

    public Course(){

    }
    public Course(int no, String adi, int kredi, int saat) {
        this.no = no;
        this.adi = adi;
        this.kredi = kredi;
        this.saat = saat;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getKredi() {
        return kredi;
    }

    public void setKredi(int kredi) {
        this.kredi = kredi;
    }

    public int getSaat() {
        return saat;
    }

    public void setSaat(int saat) {
        this.saat = saat;
    }

    @Override
    public String toString() {
        return "Course{" +
                "no=" + no +
                ", adi='" + adi + '\'' +
                ", kredi=" + kredi +
                ", saat=" + saat +
                '}';
    }
}
