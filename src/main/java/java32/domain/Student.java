package java32.domain;

public class Student {
    int idStudent;
    String fullName;
    String courseName;
    String department;
    String email;

    public Student(int idStudent, String fullName, String courseName, String department, String email) {
        this.idStudent = idStudent;
        this.fullName = fullName;
        this.courseName = courseName;
        this.department = department;
        this.email = email;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
