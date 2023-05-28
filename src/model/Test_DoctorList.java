package model;

public class Test_DoctorList {
    int  id;
    String name;
    String speciality;
    String post;

    public Test_DoctorList(int id, String name, String speciality, String post) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
