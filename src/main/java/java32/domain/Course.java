package java32.domain;

public class Course {
     int id;
     String shortname;
     String fullname;

    public Course(int id, String shortname, String fullname) {
        this.id = id;
        this.shortname = shortname;
        this.fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
