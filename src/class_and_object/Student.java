package class_and_object;

public class Student {
    String name="Rocky";
    int age=25;
    int roll_no=15;
    String section="B";

    public static void main(String[] args) {
        Student obj1= new Student();
        System.out.println("Name :"+obj1.name +"Age:"+obj1.age +"Roll_No :"+obj1.roll_no +"Section :"+obj1.section);

        Student obj2= new Student();
        System.out.println("Name :"+obj2.name +"Age:"+obj2.age +"Roll_No :"+obj2.roll_no +"Section :"+obj2.section);

        Student obj3= new Student();
        System.out.println("Name :"+obj3.name +"Age:"+obj3.age +"Roll_No :"+obj3.roll_no +"Section :"+obj3.section);


    }
}
