package class_and_object_Project;

public class Doctor {

    String hospital_name="Regency Hospital";
    String name="Dr. Deshraj Gujjar";
    int age=30;
    String specialist="Nephrologist";
   String visiting_hours="10:00 Am to 2:00 Pm";

   //Creating Method and call==========================================
   // syntax:- access_specifier return_type method_name (parameter){Code...}  using for Create Method=================

    public void workMethod(){
        System.out.println("This is the Doctor Work_Method Class...");
    }
    public void readMethod(){
        System.out.println("This is the Doctor Read_Method Class...");
    }
    public void eatMethod(){
        System.out.println("This is the Doctor Eat_Method Class...");
    }

    public static void main(String[] args) {

        Doctor obj1= new Doctor();
        System.out.println("Printing Doctor Details");
        System.out.println("Hospital Name:- "+ obj1.hospital_name);
        System.out.println("Name:- "+ obj1.name);
        System.out.println("Age :- "+ obj1.age);
        System.out.println("Specialist:- "+ obj1.specialist);
        System.out.println("Timing:- "+obj1.visiting_hours);

        //Creating new Object & Using method Class for Printing ======================================================

        Doctor obj= new Doctor();
        obj.workMethod();
        obj.readMethod();
        obj.eatMethod();

    }
}
