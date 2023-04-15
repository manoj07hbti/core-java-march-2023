package class_and_object;

public class Doctor_ParamConstructor {
    String name;
    String id;
    String field;
    String hospital;
    int age;

    //parameterized constructor
    public Doctor_ParamConstructor(String name, String id, String field, String hospital, int age) {
        this.name = name;
        this.id = id;
        this.field = field;
        this.hospital = hospital;
        this.age = age;
    }

    public static void main(String[] args){
        //SYNTAX   ClassName objName= new ClassName(value1, value2, value3.......valueN);

        Doctor_ParamConstructor obj1=new Doctor_ParamConstructor("ROHAN","DOC4456","CARDIOLOGIST","RML",26);
        System.out.println("\nprinting object 1 of Doctor class\n" +"NAME : "+obj1.name +"\nID : "+obj1.id +"\nFIELD : "+obj1.field +"\nHOSPITAL : "+obj1.hospital +"\nAGE : "+obj1.age);

        Doctor_ParamConstructor obj2=new Doctor_ParamConstructor("AMIT","DOC4486","NEUROLOGIST","GANGARAM",25);
        System.out.println("\nprinting object 2 of Doctor class\n" +"NAME : "+obj2.name +"\nID : "+obj2.id +"\nFIELD : "+obj2.field +"\nHOSPITAL : "+obj2.hospital +"\nAGE : "+obj2.age);

        Doctor_ParamConstructor obj3=new Doctor_ParamConstructor("NAINA","DOC6956","GYNECOLOGIST","RML",33);
        System.out.println("\nprinting object 3 of Doctor class\n" +"NAME : "+obj3.name +"\nID : "+obj3.id +"\nFIELD : "+obj3.field +"\nHOSPITAL : "+obj3.hospital +"\nAGE : "+obj3.age);

    }
}
