package class_and_object_Project;

public class Employee {
    String company_name="Wipro";
    String name="Amit";
    int age=25;
    String designation="Backend Developer";
    String working_shift="Day";

    //Creating Method and call==========================================
    // syntax:- access_specifier return_type method_name (parameter){Code...}  using for Create Method=================

    public void workMethod(){
        System.out.println("This is Employee Work_Method Class");
    }
    public void eatMethod(){
        System.out.println("This is Employee Eat_Method Class");
    }
    public void sleepMethod(){
        System.out.println("This is Employee Sleep_Method Class");
    }


    public static void main(String[] args) {
        // Printing Syntax Using Class object=====================
        //ClassName objName= new ClassName();

        Employee obj1= new Employee();
        System.out.println("Printing Employe Details :- ");
        System.out.println("Company Name:- "+obj1.company_name);
        System.out.println("Employe Name:- "+obj1.name);
        System.out.println("Age:- "+obj1.age);
        System.out.println("Designation:- "+obj1.designation);
        System.out.println("Shift:- "+obj1.working_shift);

        //Creating new Object & Using method Class for Printing ======================================================

        Employee obj= new Employee();
        obj.workMethod();
        obj.eatMethod();
        obj.sleepMethod();




    }
}
