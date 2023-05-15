package model;

public class Student {

    int roll_no;
    String name;
    String section;

    //param constructor

    public Student(int roll_no, String name, String section) {
        this.roll_no = roll_no;
        this.name = name;
        this.section = section;
    }

    // getter setter


    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
