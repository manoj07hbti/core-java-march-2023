package class_and_object_Project;

public class Employe {
    String company_name="Wipro";
    String name="Amit";
    int age=25;
    String designation="Backend Developer";
    String working_shift="Day";


    public static void main(String[] args) {
        // Printing Syntax Using Class object=====================
        //ClassName objName= new ClassName();

        Employe obj1= new Employe();
        System.out.println("Printing Employe Details :- ");
        System.out.println("Company Name:- "+obj1.company_name);
        System.out.println("Employe Name:- "+obj1.name);
        System.out.println("Age:- "+obj1.age);
        System.out.println("Designation:- "+obj1.designation);
        System.out.println("Shift:- "+obj1.working_shift);




    }
}
