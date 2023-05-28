package model;

public class Specialist_Doctors {

    int id;
    String name;
    String specialist;
    int salary;

    //parameterized constructor
    public Specialist_Doctors(int id, String name, String specialist, int salary) {
        this.id = id;
        this.name = name;
        this.specialist = specialist;
        this.salary = salary;
    }

    //getter setter
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

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
