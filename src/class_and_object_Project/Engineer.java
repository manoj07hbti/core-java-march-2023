package class_and_object_Project;

public class Engineer {
    String college_name= "Harcourt Butler Technical University";
    String student_name= "Ajeet Chauhan";
    int age=23;
    String branch="Mechanical";
    int year=3;

    //Creating Method and call==========================================
    // syntax:- access_specifier return_type method_name (parameter){Code...}  using for Create Method=================

    public void workMethod(){
        System.out.println("This is Engineer Work_Method Class");
    }
    public void projectMethod(){
        System.out.println("This is Engineer Project_Method Class");
    }
    public void eatMethod(){
        System.out.println("This is Engineer Eat_Method Class");
    }

    public static void main(String[] args) {

        Engineer obj1= new Engineer();
        System.out.println("Printing Engineer Deatils:- ");
        System.out.println("College Name:- "+ obj1.college_name);
        System.out.println("Student Name:- "+ obj1.student_name);
        System.out.println("Age:- "+ obj1.age);
        System.out.println("Branch:- "+ obj1.branch);
        System.out.println("Year:- "+ obj1.year);

        //Creating new Object & Using method Class for Printing ======================================================

        Engineer obj=new Engineer();
        obj.workMethod();
        obj.projectMethod();
        obj.eatMethod();

    }
}