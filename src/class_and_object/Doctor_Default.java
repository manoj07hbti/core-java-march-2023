package class_and_object;

public class Doctor_Default {
    String name="Dr. Mathur";
    int age=30;
    String qualification="MBBS";
    String specialist="Neurologist";

    public static void main(String[] args) {
        Doctor_Default obj1= new Doctor_Default();
        System.out.println("Doctor name; "+obj1.name+" age; "+obj1.age+" qualification; "+obj1.qualification+" specialist; "+obj1.specialist);

        Doctor_Default obj2= new Doctor_Default();
        System.out.println("Doctor name; "+obj2.name+" age; "+obj2.age+" qualification; "+obj2.qualification+" specialist; "+obj2.specialist);

        Doctor_Default obj3= new Doctor_Default();
        System.out.println("Doctor name; "+obj3.name+" age; "+obj3.age+" qualification; "+obj3.qualification+" specialist; "+obj3.specialist);

        Doctor_Default obj4= new Doctor_Default();
        System.out.println("Doctor name; "+obj4.name+" age; "+obj4.age+" qualification; "+obj4.qualification+" specialist; "+obj4.specialist);

        Doctor_Default obj5= new Doctor_Default();
        System.out.println("Doctor name; "+obj5.name+" age; "+obj5.age+" qualification; "+obj5.qualification+" specialist; "+obj5.specialist);


    }
}
