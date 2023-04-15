package class_and_object_Project;

public class Engineer {
    String college_name= "Harcourt Butler Technical University";
    String student_name= "Ajeet Chauhan";
    int age=23;
    String branch="Mechanical";
    int year=3;

    public static void main(String[] args) {

        Engineer obj1= new Engineer();
        System.out.println("Printing Engineer Deatils:- ");
        System.out.println("College Name:- "+ obj1.college_name);
        System.out.println("Student Name:- "+ obj1.student_name);
        System.out.println("Age:- "+ obj1.age);
        System.out.println("Branch:- "+ obj1.branch);
        System.out.println("Year:- "+ obj1.year);
    }
}
