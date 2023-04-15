package Assignment_class_object_Default;

public class Doctor_class {
    String Doctor="Dr Sanjay verma";
    int Patient=90;
    String Ward="ICU Ward";

    public static void main(String[] args) {
        Doctor_class obj1= new Doctor_class();
        System.out.println(" obj1:- "+obj1.Doctor+ " obj1:- "+obj1.Patient+ " obj1:- "+obj1.Ward);

        Doctor_class obj2= new Doctor_class();
        System.out.println(" obj2:- "+obj2.Doctor+ " obj2:- "+obj2.Patient+ " obj2:_ "+obj2.Ward);

        Doctor_class obj3= new Doctor_class();
        System.out.println(" obj3:- "+obj3.Doctor+" obj3:- "+obj3.Patient+" obj3:- "+obj3.Ward);

        Doctor_class obj4=new Doctor_class();
        System.out.println(" obj4:- "+obj4.Doctor+" obj4:- "+obj4.Patient+" obj4:- "+obj4.Ward);

        Doctor_class obj5=new Doctor_class();
        System.out.println(" obj5:- "+obj5.Doctor+" obj5:- "+obj5.Patient+" obj5:- "+obj5.Ward);

        Doctor_class obj6=new Doctor_class();
        System.out.println(" obj6:- "+obj6.Doctor+" obj6:- "+obj6.Patient+" obj6:- "+obj6.Ward);
    }
}
