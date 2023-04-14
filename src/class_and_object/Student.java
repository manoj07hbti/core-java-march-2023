package class_and_object;

public class Student {

    String name="Rohit";
    int age=21;
    int roll_no=3;
    String section="B";

    public static void main(String[] args) {
        Student obj1= new Student();

        System.out.println("Name :"+obj1.name + " Age: "+obj1.age + " Roll_No : "+obj1.roll_no +" Section: "+obj1.section);
    }


}
