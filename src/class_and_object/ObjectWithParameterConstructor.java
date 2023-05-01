package class_and_object;

public class ObjectWithParameterConstructor {
    // student object
    String name;
    int age;
    int Rollno;
    String section;

    public ObjectWithParameterConstructor(String name, int age, int rollno, String section) {
        this.name = name;
        this.age = age;
        Rollno = rollno;
        this.section = section;
    }

    public static void main(String[] args) {
        ObjectWithParameterConstructor obj = new ObjectWithParameterConstructor("Rahul",24,12,"A");
        System.out.println("Student data.."+obj.name+" age "+obj.age+ " roll no "+obj.Rollno+ "  section "+obj.section);

        ObjectWithParameterConstructor obj2=new ObjectWithParameterConstructor("Rajesh",25,11,"B");

        System.out.println("Student data.."+obj2.name+" age "+obj2.age+ " roll no "+obj2.Rollno+ "  section "+obj2.section);

        ObjectWithParameterConstructor obj3=new ObjectWithParameterConstructor("Rakesh",29,18,"A");
        System.out.println("Student data.."+obj3.name+" age "+obj3.age+ " roll no "+obj3.Rollno+ "  section "+obj3.section);
    }
}
