package class_and_object;

public class DoctorParamConstructor {
    String name;
    int age;
    String Hospital;
    String Specialist;

    public DoctorParamConstructor(String name, int age, String hospital, String specialist) {
        this.name = name;
        this.age = age;
        Hospital = hospital;
        Specialist = specialist;
    }

    public static void main(String[] args) {

        // SYNTAX ClassName = new ClassName
        DoctorParamConstructor obj1 = new DoctorParamConstructor("Dr.Vinay jain",35,"Heritage","Mind");
        System.out.println("Name:" + obj1.name + " age " + obj1.age + " Hospital " + obj1.Hospital + " specialist " + obj1.Specialist);

        DoctorParamConstructor obj2 = new DoctorParamConstructor("Dr.atul",45,"ZH","Bone");
        System.out.println("Name:" + obj2.name + " age " + obj2.age + " Hospital " + obj2.Hospital + " specialist " + obj2.Specialist);

        DoctorParamConstructor obj3 = new DoctorParamConstructor(" Amar deep ",37,"Renwo","Child");
        System.out.println("Name:" + obj3.name + " age " + obj3.age + " Hospital " + obj3.Hospital + " specialist " + obj3.Specialist);
    }

}