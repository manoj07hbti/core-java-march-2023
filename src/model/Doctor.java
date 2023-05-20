package model;

import java.util.Objects;

public class Doctor {
    int id;
    String name;
    String speciality;

    //crating a parameterized constructor
    public Doctor(int id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }

    //hashcode and equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return id == doctor.id && Objects.equals(name, doctor.name) && Objects.equals(speciality, doctor.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, speciality);
    }

    //creating getter setter

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
}
