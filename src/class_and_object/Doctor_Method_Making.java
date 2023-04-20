package class_and_object;

public class Doctor_Method_Making {

   public void method(){
       System.out.println(" This is my default method ");
    }
public void doctor(){
       System.out.println(" this method is base on doctor's information");
}
public void method_making(){
       System.out.println(" this method give information of the doctor ");
}
    String specialist="Neurologist";
    String name="Dr. Mathur";
    int age=30;
    String qualification="MBBS";
    public static void main(String[] args) {
        Doctor_Method_Making obj1= new Doctor_Method_Making();
        System.out.println("Doctor name; "+obj1.name+" age; "+obj1.age+" qualification; "+obj1.qualification+" specialist; "+obj1.specialist);

        Doctor_Method_Making obj= new Doctor_Method_Making();
        obj.method();
        obj.doctor();
        obj.method_making();

    }

}
