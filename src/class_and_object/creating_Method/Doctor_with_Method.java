package class_and_object.creating_Method;

public class Doctor_with_Method {
    // CREATING NEW METHOD
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void examineMethod(){
        System.out.println("DOCTOR EXAMINE THEIR PATIENTS");
    }
    public void medicineMethod(){System.out.println("DOCTOR GIVES A MEDICINE TO THE PATIENT");
    }
    public void feesMethod(){
        System.out.println("DOCTOR CHARGES A FEES TO THEIR PATIENTS");
    }

    public static void main(String[] args) {

        // creating new object
        Doctor_with_Method obj=new Doctor_with_Method();

        // calling methods
        obj.examineMethod();
        obj.medicineMethod();
        obj.feesMethod();
    }
}
