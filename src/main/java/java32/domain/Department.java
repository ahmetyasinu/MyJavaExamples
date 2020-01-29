package java32.domain;

public class Department {
    int idDepartment;
    int idStudent;

    public Department(int idDepartment, int idStudent) {
        this.idDepartment = idDepartment;
        this.idStudent = idStudent;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }
}
