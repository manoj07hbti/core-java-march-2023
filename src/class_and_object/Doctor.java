package class_and_object;

import java.time.chrono.MinguoDate;

public class Doctor {
    String name = "Dr.Vinay jain";
    int age = 35;
    String Hospital = "Heritage";
    String Specialist = "Mind";

    public static void main(String[] args) {
        // ClassName objectName = ClassName();

        Doctor obj1 = new Doctor();
        System.out.println("Doctor name " + obj1.name + "  age " + obj1.age + " Hospital " + obj1.Hospital + " Specialist " + obj1.Specialist);

        Doctor obj2 = new Doctor();
        System.out.println("Doctor name " + obj2.name + "  age " + obj2.age + " Hospital " + obj2.Hospital + " Specialist " + obj2.Specialist);

        Doctor obj3 = new Doctor();
        System.out.println("Doctor name " + obj3.name + "  age " + obj3.age + " Hospital " + obj3.Hospital + " Specialist " + obj3.Specialist);

        Doctor obj4 = new Doctor();
        System.out.println("Doctor name " + obj4.name + "  age " + obj4.age + " Hospital " + obj4.Hospital + " Specialist " + obj4.Specialist);

        Doctor obj5 = new Doctor();
        System.out.println("Doctor name " + obj5.name + "  age " + obj5.age + " Hospital " + obj5.Hospital + " Specialist " + obj5.Specialist);

    }
}
