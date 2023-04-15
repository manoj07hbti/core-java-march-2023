package class_and_object_Project;

public class Doctor {

    String hospital_name="Regency Hospital";
    String name="Dr. Deshraj Gujjar";
    int age=30;
    String specialist="Nephrologist";
   String visiting_hours="10:00 Am to 2:00 Pm";

    public static void main(String[] args) {

        Doctor obj1= new Doctor();
        System.out.println("Printing Doctor Details");
        System.out.println("Hospital Name:- "+ obj1.hospital_name);
        System.out.println("Name:- "+ obj1.name);
        System.out.println("Age :- "+ obj1.age);
        System.out.println("Specialist:- "+ obj1.specialist);
        System.out.println("Timing:- "+obj1.visiting_hours);

    }
}
