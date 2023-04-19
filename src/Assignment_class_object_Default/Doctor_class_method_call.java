package Assignment_class_object_Default;

public class Doctor_class_method_call {
    String Doctor="Dr Sanjay verma";
    int Patient=90;
    String Ward="ICU Ward";

    public void Patient_Method(){
        System.out.println("this patient method for doctor");
    }

    public void Patient_Treatment_Method(){
        System.out.println("This is Patient method For Doctor");
    }
    public void Patient_Fees_method(){
        System.out.println("This patient method for fess");
    }
    public void Patient_Ward_method(){
        System.out.println("This Patient method for ward");
    }
    public void Patient_Icu(){
        System.out.println("This is Patient in Icu Ward");
    }
    public static void main(String[] args) {
        Doctor_class_method_call obj1= new Doctor_class_method_call();
        System.out.println(" obj1:- "+obj1.Doctor+ " obj1:- "+obj1.Patient+ " obj1:- "+obj1.Ward);

        Doctor_class_method_call obj2= new Doctor_class_method_call();
        System.out.println(" obj2:- "+obj2.Doctor+ " obj2:- "+obj2.Patient+ " obj2:_ "+obj2.Ward);

        Doctor_class_method_call obj3= new Doctor_class_method_call();
        System.out.println(" obj3:- "+obj3.Doctor+" obj3:- "+obj3.Patient+" obj3:- "+obj3.Ward);

        Doctor_class_method_call obj4=new Doctor_class_method_call();
        System.out.println(" obj4:- "+obj4.Doctor+" obj4:- "+obj4.Patient+" obj4:- "+obj4.Ward);

        Doctor_class_method_call obj5=new Doctor_class_method_call();
        System.out.println(" obj5:- "+obj5.Doctor+" obj5:- "+obj5.Patient+" obj5:- "+obj5.Ward);

        Doctor_class_method_call obj6=new Doctor_class_method_call();
        System.out.println(" obj6:- "+obj6.Doctor+" obj6:- "+obj6.Patient+" obj6:- "+obj6.Ward);

        Doctor_class_method_call obj= new Doctor_class_method_call();
        obj.Patient_Method();
        obj.Patient_Treatment_Method();
        obj.Patient_Fees_method();
        obj.Patient_Ward_method();
        obj.Patient_Icu();


    }
}

