package class_and_object.parameterized_constructor;

public class Engineer_ParamConstructor {

    String name ;
    int age;
    String field;
    double salary;
    String id;

    //parameterized constructor
    public Engineer_ParamConstructor(String name, int age, String field, double salary, String id) {
        this.name = name;
        this.age = age;
        this.field = field;
        this.salary = salary;
        this.id = id;
    }

    public static void main(String[] args) {

       Engineer_ParamConstructor obj1=new Engineer_ParamConstructor("AMAN",25,"MECHANICAL",45867.22,"ENG7811");
       System.out.println("\nPrinting object 1 of Engineer class\n"+"NAME : "+obj1.name+"\nAGE : "+obj1.age+"\nFIELD : "+obj1.field+"\nSALARY : "+obj1.salary+"\nID : "+obj1.id);

       Engineer_ParamConstructor obj2=new Engineer_ParamConstructor("RAHUL",24,"CIVIL",48557.56,"ENG7488");
       System.out.println("\nPrinting object 2 of Engineer class\n"+"NAME : "+obj2.name+"\nAGE : "+obj2.age+"\nFIELD : "+obj2.field+"\nSALARY : "+obj2.salary+"\nID : "+obj2.id);

       Engineer_ParamConstructor obj3=new Engineer_ParamConstructor("SAHIL",27,"SOFTWARE",485744.25,"ENG6599");
       System.out.println("\nPrinting object 3 of Engineer class\n"+"NAME : "+obj3.name+"\nAGE : "+obj3.age+"\nFIELD : "+obj3.field+"\nSALARY : "+obj3.salary+"\nID : "+obj3.id);


    }
}
