package model;

import java.util.Objects;

public class Student {
    int roll_no;
    String name;
    String section;


    //creating parameterized constructor
    public Student(int roll_no, String name, String section) {
        this.roll_no = roll_no;
        this.name = name;
        this.section = section;
    }

    //hashcode and equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll_no == student.roll_no && Objects.equals(name, student.name) && Objects.equals(section, student.section);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll_no, name, section);
    }


    //GETTER SETTER

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
