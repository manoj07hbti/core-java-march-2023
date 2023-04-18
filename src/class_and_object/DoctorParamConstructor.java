package class_and_object;

public class DoctorParamConstructor {
String name;
int age;
String qualification;
String speciality;

    public DoctorParamConstructor(String name, int age, String qualification, String speciality) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        this.speciality = speciality;
    }

    public static void main(String[] args) {
        //SYNTAX   ClassName objName= new ClassName(value1, value2, value3.......valueN);
        DoctorParamConstructor obj1= new DoctorParamConstructor("Dr.Mathur",30,"mbbs","neurologist");
        System.out.println("Name: "+obj1.name+" age: "+obj1.age+" qualification: "+obj1.qualification+" speciality: "+obj1.speciality);

        DoctorParamConstructor obj2= new DoctorParamConstructor("Dr. Sharma",35,"MBBS","Cardiologist");
        System.out.println("Name: "+obj2.name+" age: "+obj2.age+" qualification: "+obj2.qualification+" speciality: "+obj2.speciality);

        DoctorParamConstructor obj3= new DoctorParamConstructor("Dr.Dixit",40,"MBBS&MD","Psychiatrist");
        System.out.println("Name: "+obj3.name+" age: "+obj3.age+" qualification: "+obj3.qualification+" speciality: "+obj3.speciality);

        DoctorParamConstructor obj4= new DoctorParamConstructor("Dr.Radhakrashnan",30,"MBBS","Surgeon");
        System.out.println("Name: "+obj4.name+" age: "+obj4.age+" qualification: "+obj4.qualification+" speciality: "+obj4.speciality);

        DoctorParamConstructor obj5= new DoctorParamConstructor("Dr.Prakash",35,"MBBS","Oncologist");
        System.out.println("Name: "+obj5.name+" age: "+obj5.age+" qualification: "+obj5.qualification+" speciality: "+obj5.speciality);

    }
}
