package Assignment_class_object_param_constructor;


public class Doctor_Pram_constructor {

    String Doctor;
    int patient;
    String Ward;

    public Doctor_Pram_constructor(String doctor, int patient, String ward) {
        Doctor = doctor;
        this.patient = patient;
        Ward = ward;
    }


    public static void main(String[] args) {
        Doctor_Pram_constructor obj1=new Doctor_Pram_constructor("sanjeev",87,"opt");
        System.out.println(" doctor:- "+obj1.Doctor+" patient:- "+obj1.patient+" ward:- "+obj1.Ward);

        Doctor_Pram_constructor obj2= new Doctor_Pram_constructor("Ghosh",76,"genral");
        System.out.println(" doctor:- "+obj2.Doctor+" patient:- "+obj2.patient+" ward:- "+obj2.Ward);

        Doctor_Pram_constructor obj3= new Doctor_Pram_constructor("Puja",54,"pph");
        System.out.println(" doctor:- "+obj3.Doctor+" patient:- "+obj3.patient+" ward:- "+obj3.Ward);

        Doctor_Pram_constructor obj4= new Doctor_Pram_constructor("SudhaBansal",11,"OOO");
        System.out.println(" doctor:- "+obj4.Doctor+" patient:- "+obj4.patient+" ward:- "+obj4.Ward);

        Doctor_Pram_constructor obj5= new Doctor_Pram_constructor("otp",77,"KLO");
        System.out.println(" doctor:- "+obj5.Doctor+" patient:- "+obj5.patient+" ward:- "+obj5.Ward);

    }




}
