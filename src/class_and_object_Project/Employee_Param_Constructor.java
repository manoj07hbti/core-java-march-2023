package class_and_object_Project;

public class Employee_Param_Constructor {
    String company_name;
    String name;
    int age;
    String designation;
    String working_shift;

    public Employee_Param_Constructor(String company_name, String name, int age, String designation, String working_shift) {
        this.company_name = company_name;
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.working_shift = working_shift;
    }

    public static void main(String[] args) {

        Employee_Param_Constructor obj1= new Employee_Param_Constructor("Wipro","Amit",32,
                "Backend Developer","Day");
        System.out.println("Printing Employee 1 Details:- ");
        System.out.println("Company Name:- "+obj1.company_name);
        System.out.println("Name:-"+ obj1.name);
        System.out.println("Age:- "+ obj1.age);
        System.out.println("Designation:- "+obj1.designation);
        System.out.println("Working Shift:- "+ obj1.working_shift);

        // Printing Obj2 Employee Deatisl:-===========================
        Employee_Param_Constructor obj2= new Employee_Param_Constructor("Infosys","Akash",28,
                "Frontend Developer","Night");
        System.out.println("Printing Employee 2 Details:- ");
        System.out.println("Company Name:- "+obj2.company_name);
        System.out.println("Name:-"+ obj2.name);
        System.out.println("Age:- "+ obj2.age);
        System.out.println("Designation:- "+obj2.designation);
        System.out.println("Working Shift:- "+ obj2.working_shift);

    }
}
