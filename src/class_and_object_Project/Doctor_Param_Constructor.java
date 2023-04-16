package class_and_object_Project;

import javax.naming.Name;

public class Doctor_Param_Constructor {
    String hospital_name;
    String name;
    int age;
    String specialist;
    String visiting_hours;

    public Doctor_Param_Constructor(String hospital_name, String name, int age, String specialist, String visiting_hours) {
        this.hospital_name = hospital_name;
        this.name = name;
        this.age = age;
        this.specialist = specialist;
        this.visiting_hours = visiting_hours;
    }
    public static void main(String[] args) {
        // Object 1 Person Details=========================================

        Doctor_Param_Constructor obj1= new Doctor_Param_Constructor("Regency Hospital","Dr. Vina Mittal"
        ,32,"Orthologist","10:00 Am to 2:00 Pm");
        System.out.println("Hospital Name:- "+obj1.hospital_name);
        System.out.println("Name:- "+ obj1.name);
        System.out.println("Age:- "+ obj1.age);
        System.out.println("Specialist:- "+ obj1.specialist);
        System.out.println("Visiting Hours:- "+ obj1.visiting_hours);

        // Object 1 Person Details=========================================

        Doctor_Param_Constructor obj2= new Doctor_Param_Constructor("Regency Hospital","Dr.Ashok Sinha"
                ,45,"Neurologist","11:00 Am to 12 Pm");
        System.out.println("Hospital Name:- "+obj2.hospital_name);
        System.out.println("Name:- "+ obj2.name);
        System.out.println("Age:- "+ obj2.age);
        System.out.println("Specialist:- "+ obj2.specialist);
        System.out.println("Visiting Hours:- "+ obj2.visiting_hours);

        // Using Param Constructor we can Create Object 1.2.3......n.(You Want)
    }


}
